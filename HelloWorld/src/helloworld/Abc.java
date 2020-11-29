/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Optional;
import java.awt.datatransfer.*;
import java.awt.*;
sealed class x{}
non-sealed class y extends x{}
/**
 * Demo to access System Clipboard
 */
interface x{}
enum y implements x{

}
class myClass {

    public myClass() {
        System.out.println("a");
    }

    public myClass(int x) {
        System.out.println("myClass");
    }

}

class child extends myClass {

    public child() {
        System.out.println("child void");
    }

    public child(int x) {
        System.out.println("child x");
    }
}

class SystemClipboardAccess {

    public static void main(String args[]) throws Exception {
        String year = "Senior";
        switch (year) {
            case "Freshman":
            default:
            case "Sophomore":
            case "Junior":
                System.out.print("See you next year");
                break;
            case "Senior":
                System.out.print("Congratulations");
        }
        Exception
        new child(20);

        new BlackRhino();
    }
}

class Rhinoceros {

    public Rhinoceros() {
        System.out.print("1");
    }

}

class BlackRhino extends Rhinoceros {

    public BlackRhino(int age) {
        System.out.print("2");
    }

    public BlackRhino() {

        this(5);

        System.out.print("3");

    }
}
