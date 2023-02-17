/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingLot;
import java.util.*;
/**
 *
 * @author guptaakshay
 */
public class Parking {
    
}
enum VechileType{
    Car,
    Bike,
    Truck,
    Cycle,
    Tank
}
enum ParkingType{
    Car,
    Bike,
    Truck,
    Tank
}
class ParkingSpot{
    ParkingType parkingType;
}
class Vechile{
    VechileType vechileType;
    String vechileNumber;
}
class Person{
    String name;
    String loginName;
    String password;
}
class Customer extends Person{
    
}
class Admin extends Person{
    
}

class ParkingLot{
    List<ParkingFloor> floor;
}
class ParkingFloor{
    List<ParkingSpot> spot;
}
class Driver{
    public static void main(String[] args) {
        
    }
}