/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author guptaakshay
 */
public class User {
    public static void main(String[] args) {
        TvCicurit using=new RemoteAdapter(new Remote());//may recive remote objefct reference from network
        using.nextChannel();
    }
}
