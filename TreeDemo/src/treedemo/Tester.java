package treedemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

final public class Tester {

    JFrame frame;
    DrawPanel drawPanel;
    TreeNode root;

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.go();
    }

    private void go() {
        root = new TreeNode(0);

        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawPanel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(BorderLayout.EAST,new JButton());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        moveIt();
    }

    class DrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            paintTree(g, root, 900, 100,this.getWidth());
        }

        public void paintTree(Graphics g, TreeNode currNode, int ind, int dep,int avaiableWidth) {
            if (currNode == null) {
                return;
            }
            if(currNode.leftChild!=null){
                g.drawLine(ind+1, dep+10, ind-(avaiableWidth/4)+30, dep+80);
            } if(currNode.rightChild!=null){
                g.drawLine(ind+4, dep+10, ind+(avaiableWidth/4)+10, dep+80);
            }
            g.setColor(Color.YELLOW);
            g.fillOval(ind, dep, 20, 20);
            g.setColor(Color.red);
            g.drawString(currNode.data + "", ind + 5, dep + 15);
            paintTree(g, currNode.leftChild, ind - (avaiableWidth/4), dep + 80,avaiableWidth/2);
            paintTree(g, currNode.rightChild, ind + (avaiableWidth/4), dep + 80,avaiableWidth/2);
        }
    }

    private void moveIt() {
        int x=0;
        while (x++<100) {
            TreeNode temp = root;
            TreeNode nn = new TreeNode(new Random().nextInt(100));
            while (temp.leftChild != null && temp.rightChild != null) {
                if (new Random().nextBoolean()) {
                    temp = temp.leftChild;
                } else {
                    temp = temp.rightChild;
                }
            }
            if(temp.leftChild==null)temp.leftChild=nn;
            else temp.rightChild=nn;
            try {
                Thread.sleep(100);
            } catch (Exception exc) {
            }
            frame.repaint();
        }
    }
}

class TreeNode {

    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

}
