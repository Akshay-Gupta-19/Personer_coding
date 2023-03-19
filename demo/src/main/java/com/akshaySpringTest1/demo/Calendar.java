/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akshaySpringTest1.demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author Akshay Gupta
 */

@Component
public class Calendar {
    String owner;
    String timeZone;
    
    void show(){
        System.out.println("Hello Calendar");
    }
}
