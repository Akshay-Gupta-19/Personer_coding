/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akggupta
 */
class A {
}

final class B extends A {
}

final class C extends A {
}

final class D extends A {
}

public class newJavaFile {

    public static void main(String args[]) {
        new Thread(() -> {
            while (true) {
                System.out.println("1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(newJavaFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println("2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(newJavaFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
}
