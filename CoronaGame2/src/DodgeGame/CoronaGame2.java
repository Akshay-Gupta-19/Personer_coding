/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DodgeGame;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

final public class CoronaGame2 {

    JFrame frame;
    DrawPanel drawPanel;

    private int oneX[];
    private int oneY[];
    int dirx[];
    int diry[];
    boolean start;
    int score = 0;
    int smothness=1;
    int diffculty;
    int virusSize;
    int numVirus;
    Random random;
    int speed;
    Image CoronaImage;
    Image CursorImage;

    public void go() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawPanel = new DrawPanel();
        drawPanel.setBackground(new Color(25, 251, 255));
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setCursor(Cursor.CROSSHAIR_CURSOR);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        random = new Random();
        oneX = new int[numVirus];
        oneY = new int[numVirus];
        dirx = new int[numVirus];
        diry = new int[numVirus];
        if (CursorImage != null) {
            Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(CursorImage, new Point(0, 0), "customCursor");

            frame.setCursor(customCursor);
        }
        for (int i = 0; i < oneX.length; i++) {
            oneX[i] = random.nextInt(1080) + 200;
        }
        for (int i = 0; i < oneY.length; i++) {
            oneY[i] = random.nextInt(618);
        }
        for (int i = 0; i < oneX.length; i++) {
            dirx[i] = random.nextInt(2 * speed + 1) - (speed);

            diry[i] = (dirx[i] == 0 && speed != 0) ? (random.nextBoolean() ? 1 : -1) : random.nextInt(2 * speed + 1) - (speed);
        }
        int orignalVirus = numVirus;
        Thread checkPosition = new Thread(() -> {
            while (true) {
                if (start) {
                    score++;
                }
                if (score % diffculty == 1) {
                    numVirus--;
                }
                if (numVirus == 0) {
                    frame.dispose();
                    StartGame sg = new StartGame();
                    JOptionPane.showMessageDialog(sg, "You Win To " + orignalVirus + " Viruses," + " Virus Size" + virusSize);
                    sg.setVisible(true);
                    break;
                }
                Point p = MouseInfo.getPointerInfo().getLocation();
                Robot robot = null;
                try {
                    robot = new Robot();
                } catch (AWTException ex) {
                    Logger.getLogger(CoronaGame2.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (p.x < 200) {
                    this.start = true;

                }
                Color currentPiColor = robot.getPixelColor(p.x, p.y);
                if (!currentPiColor.equals(new Color(25, 251, 255)) && !currentPiColor.equals(Color.green) && !currentPiColor.equals(Color.red) && start) {

                    StartGame sg = new StartGame();
                    sg.setVisible(true);
                    frame.dispose();
                    JOptionPane.showMessageDialog(sg, "Final score is " + this.score + " With " + numVirus + " Viruses Left" + " Virus Size" + virusSize);
                    break;
                }
            }
        });
        checkPosition.setPriority(1);
        checkPosition.start();

        moveIt();
    }

    class DrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int j = 0; j < numVirus; j++) {
                g.drawImage(CoronaImage, oneX[j], oneY[j], virusSize, virusSize, this);
            }
            if (!start) {

                g.setColor(Color.green);
                g.fillRect(0, 0, 200, this.getHeight());
                g.setFont(new Font("", Font.ITALIC, 15));
                g.setColor(Color.BLACK);
                g.drawString("Created By - Akshay Gupta", 0, 600);
                g.drawString("Game Idea - Karanveer Singh", 0, 630);
                g.setFont(new Font("", Font.BOLD + Font.BOLD, 30));
                g.setColor(Color.red);
                g.drawString("S\nT\nA\nR\nT", 3, 370);
            }
            g.setFont(new Font("", Font.BOLD, 30));
            g.setColor(Color.green);
            g.drawString("Current Score " + score, 100, 100);

        }
    }

    private void moveIt() {

        new Thread(() -> {
            while (true) {
                int randomDirChange=numVirus;//random.nextInt(numVirus*(smothness+1)*10);
                for (int i = 0; i < numVirus; i++) {
                    if (oneX[i] >= frame.getWidth() - 1 ||  randomDirChange<i) {
                        dirx[i] = -dirx[i];
                        diry[i] =random.nextInt(2 * speed + 1) - (speed);
                    }
                    if (oneX[i] <= (start ? -50 : 200)) {
                        dirx[i] = -dirx[i];
                        diry[i] = random.nextInt(2 * speed + 1) - (speed);
                    }
                    if (oneY[i] >= frame.getHeight() - 1  ||  randomDirChange<i) {
                        diry[i] = -diry[i];
                        dirx[i] =random.nextInt(2 * speed + 1) - (speed);
                    }
                    if (oneY[i] <= -50) {
                        diry[i] = -diry[i];
                        dirx[i] = random.nextInt(2 * speed + 1) - (speed);
                    }
                    oneX[i] += dirx[i];
                    oneY[i] += diry[i];
                }
                try {
                    Thread.sleep(numVirus / 10 + 1);
                } catch (Exception exc) {
                }
                frame.repaint();
            }
        }).start();
    }
}
