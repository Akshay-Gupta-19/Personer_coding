/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author Akshay Gupta
 */

//Merge calling of multiple classes in one
public class User {
    public static void main(String[] args) {
        Computer comp=new Computer(new PlayGame(), new WriteStory());
        comp.playGame();
    }
}
