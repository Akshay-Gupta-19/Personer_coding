/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StratagyPatternSorting;

/**
 *
 * @author guptaakshay
 */
public class Context {
    ISorting sorting;
    Context(ISorting sorting){
        this.sorting=sorting;
    }
    void sort(int arr[]){
        this.sorting.sort(arr);
    }
}
