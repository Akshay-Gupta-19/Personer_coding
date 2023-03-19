/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import java.util.Date;
import jdk.jfr.Description;

/**
 *
 * @author guptaakshay
 */

//Child of interface also contains a reference to some other and add functionality on top of it.

interface Computer{
    String getDetails();
}
class PlainComputer implements Computer{

    @Override
    public String getDetails() {
        return "Computer";
    }
}

class DVD implements Computer{
    Computer computer;

    public DVD(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDetails() {
        return computer.getDetails()+" And DVD";
    }
}
class USBPort implements Computer{
        Computer computer;

    public USBPort(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDetails() {
        return computer.getDetails()+" And USBPort";
    }
}


class Client{
    public static void main(String[] args) {
        Computer computer = new PlainComputer();
        USBPort usbPort = new USBPort(new DVD(computer));
        System.out.println(usbPort.getDetails());
    }
}