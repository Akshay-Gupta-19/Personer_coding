/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author Akshay Gupta
 */
public class Computer {
    private final PlayGame playGame;
    private final WriteStory writeStory;

    public Computer(PlayGame playGame, WriteStory writeStory) {
        this.playGame = playGame;
        this.writeStory = writeStory;
    }
    
    void playGame(){
        playGame.playingGame();
    }
    void writeStory(){
        writeStory.writeStory();
    }
}
