/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

import java.util.Scanner;

/**
 *
 * @author Akshay Gupta
 */
public class PlayGame {
    void playingGame(){
        Scanner sc=new Scanner(System.in);
        while(sc.nextInt()!=10){
            System.out.println("Guess again");
        }
        System.out.println("You gussed");
    }
}
