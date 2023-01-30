/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StratagyPatternSorting;

/**
 *
 * @author guptaakshay
 */
public class Driver {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]=new int[100];
        Context cntex=new Context(bubbleSort);
        cntex.sort(arr);
    }
}
