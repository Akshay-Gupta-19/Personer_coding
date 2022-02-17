/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
class node {
    int data;
    ArrayList<node> childs;
}

public class Cutthetree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node n[] = new node[sc.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i].data = sc.nextInt();
            n[i].childs=new ArrayList<node>();
        }
        for (int i = 0; i < n.length-1; i++) {
            n[sc.nextInt()-1].childs.add(n[sc.nextInt()-1]);
        }
    }
}
