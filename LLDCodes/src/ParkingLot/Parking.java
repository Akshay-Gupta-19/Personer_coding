/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingLot;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guptaakshay Requirments 1. User can request spot 2. User can request
 * checkout 3. user can make payment 4. Receptionist can request a parking spot
 * lowest number will go first // need policy 5. Receptionist at entry can book
 * the spot and create a ticket 6. Receptionist at exit can close a ticket 7.
 * Admin can add new parking spot 8. Admin can add new entry or exit point
 */
public class Parking {

    public static void main(String[] args) {
        ParkingLot parkingLot = new MallParkingLot();
        parkingLot.addAdmin("Paplue", new MallAdmin("Paplue"));
        parkingLot.addAdmin("Taplue", new MallAdmin("Taplue"));
        parkingLot.addAdmin("Chaplue", new MallAdmin("Chaplue"));

        parkingLot.addGateWorker("Bablue", new MallGateKeeper("Bablue"));
        parkingLot.addGateWorker("Montu", new MallGateKeeper("Montu"));
        parkingLot.addGateWorker("Chotu", new MallGateKeeper("Chotu"));

        Ticket jatinTicket=  addTickets(parkingLot);
        System.out.println("");
        closeTicket(parkingLot, jatinTicket);
    }

    static Ticket addTickets(ParkingLot parkingLot) {
        Map<String, Admin> admins = parkingLot.getAdmins();
        Admin paplue = admins.get("Paplue");
        try {
            for (int i = 0; i < VechileType.values().length; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 100; k++) {
                        for (int l = 0; l < 100; l++) {
                            paplue.addParkingSpot(parkingLot, new MallParkingSpot(VechileType.values()[i], j + "th", k, l));
                        }
                    }
                }
            }
        } catch (SpotNotFoundException ex) {
            Logger.getLogger(Parking.class.getName()).log(Level.SEVERE, null, ex);
        }

        GateWorker bablue = parkingLot.getGateWorkers().get("Bablue");
        Customer pankaj = new Customer("Pankaj");
        Vechile HeroHonda = new Vechile(VechileType.Bike, "MH21V3451", pankaj);
        Ticket pankajTicket = bablue.findSpotAndGetTicket(parkingLot, HeroHonda, 10);

        Customer jatin = new Customer("Jatin");
        Vechile Nano = new Vechile(VechileType.Car, "MH21V7535", jatin);
        Ticket jatinTicket = bablue.findSpotAndGetTicket(parkingLot, Nano, 20);

        Customer pankaj2 = new Customer("Pankaj2");
        Vechile HeroHonda2 = new Vechile(VechileType.Bike, "MH21V3451 2", pankaj2);
        Ticket pankajTicket2 = bablue.findSpotAndGetTicket(parkingLot, HeroHonda2, 12);

        return jatinTicket;
    }
    
    static void closeTicket(ParkingLot parkingLot , Ticket ticketToClose){
        GateWorker bablue = parkingLot.getGateWorkers().get("Bablue");
        bablue.closeTicket(parkingLot, ticketToClose);
    }
}

enum VechileType {
    Car,
    Bike,
    Truck,
    Cycle,
    Tank
}

interface SpotCollection<ParkingSpot> {

    ParkingSpot fillFreeSpot(VechileType vechileType);

    void freeSpot(ParkingSpot spotToFree);

    boolean isSpotPresent(ParkingSpot spotToCheck);

    void addSpot(ParkingSpot spotToAdd) throws SpotNotFoundException;

    void removeSpot(ParkingSpot spotToDelete) throws SpotNotFoundException;
}

class MallSpotCollection implements SpotCollection<ParkingSpot> {

    Map<VechileType, Queue<ParkingSpot>> spotCollection;

    public MallSpotCollection() {
        spotCollection = new HashMap<>();
        for (VechileType value : VechileType.values()) {
            spotCollection.put(value, new PriorityQueue<>());
        }
    }

    @Override
    public ParkingSpot fillFreeSpot(VechileType vechileType) {
        ParkingSpot firstFree = spotCollection.get(vechileType).poll();
        return firstFree;
    }

    @Override
    public void freeSpot(ParkingSpot spotToFree) {
        spotCollection.get(spotToFree.getVechileType()).add(spotToFree);
    }

    @Override
    public boolean isSpotPresent(ParkingSpot spotToCheck) {
        if (!spotCollection.containsKey(spotToCheck.getVechileType())) {
            return false;
        }
        return spotCollection.get(spotToCheck.getVechileType()).contains(spotToCheck);
    }

    @Override
    public void addSpot(ParkingSpot spotToAdd) throws SpotNotFoundException {
        if (isSpotPresent(spotToAdd)) {
            throw new SpotNotFoundException();
        }
        spotCollection.putIfAbsent(spotToAdd.getVechileType(), new PriorityQueue<>());
        spotCollection.get(spotToAdd.getVechileType()).add(spotToAdd);
    }

    @Override
    public void removeSpot(ParkingSpot spotToDelete) throws SpotNotFoundException {
        if (!isSpotPresent(spotToDelete)) {
            throw new SpotNotFoundException();
        }
        spotCollection.get(spotToDelete.getVechileType()).remove(spotToDelete);
    }
}

class SpotNotFoundException extends Exception {

}

interface ParkingSpot extends Comparable<ParkingSpot> {

    VechileType getVechileType();

    String getFloor();
}

class MallParkingSpot implements ParkingSpot {

    VechileType vechileType;
    String floor;
    Integer row, column;

    public MallParkingSpot(VechileType vechileType, String floor, Integer row, Integer column) {
        this.vechileType = vechileType;
        this.floor = floor;
        this.row = row;
        this.column = column;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    @Override
    public String getFloor() {
        return floor;
    }

    @Override
    public int compareTo(ParkingSpot otherSpot) {
        if (!(otherSpot instanceof MallParkingSpot)) {
            return 1;
        }
        MallParkingSpot otherMallParkingSpot = (MallParkingSpot) otherSpot;
        if(!otherSpot.getFloor().equals(this.floor)){
            return this.getFloor().compareTo(otherMallParkingSpot.getFloor());
        }
        int rowCompare = this.row.compareTo(otherMallParkingSpot.row);
        int colCompare = this.column.compareTo(otherMallParkingSpot.column);
        return rowCompare == 0 ? colCompare : rowCompare;
    }

    @Override
    public String toString() {
        return "MallParkingSpot{" + "vechileType=" + vechileType + ", floor=" + floor + ", row=" + row + ", column=" + column + '}';
    }

}

class Vechile {

    VechileType vechileType;
    String vechileNumber;
    Customer customer;

    public Vechile(VechileType vechileType, String vechileNumber, Customer customer) {
        this.vechileType = vechileType;
        this.vechileNumber = vechileNumber;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Vechile{" + "vechileType=" + vechileType + ", vechileNumber=" + vechileNumber + ", customer=" + customer + '}';
    }

}

abstract class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

    
}

class Customer extends Person {

    public Customer(String name) {
        super(name);
    }

}

interface GateWorker {

    Ticket findSpotAndGetTicket(ParkingLot parkingLot, Vechile vechile, double rate);

    Price closeTicket(ParkingLot parkingLot, Ticket ticket);
    
}

abstract class GenralGateKeeper extends Person implements GateWorker {

    PriceCaclulator priceCaclulator = PriceCaclulator.getCaclculator();

    public GenralGateKeeper(String name) {
        super(name);
    }

    @Override
    public Ticket findSpotAndGetTicket(ParkingLot parkingLot, Vechile vechile, double rate) {
        ParkingSpot bookedSpot = parkingLot.getSpotCollection().fillFreeSpot(vechile.vechileType);
        Ticket newTicket = new Ticket(vechile, new Date(), bookedSpot, rate, this);
        System.out.println("Assigning new ticket " + newTicket);
        return newTicket;
    }

    @Override
    public Price closeTicket(ParkingLot parkingLot, Ticket ticket) {
        parkingLot.getSpotCollection().freeSpot(ticket.parkingSpot);
        Price price = priceCaclulator.caclulatePrice(ticket, new Date());
        System.out.println("Closing ticket" + ticket +" Fianl Price "+price);
        return price;
    }
}

class MallGateKeeper extends GenralGateKeeper {

    public MallGateKeeper(String name) {
        super(name);
    }

}

class Price {

    double price;

    public Price(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" + "price=" + price + '}';
    }
    
    
}

class PriceCaclulator {

    private PriceCaclulator() {
    }
    private final static PriceCaclulator PRICE_CACLULATOR = new PriceCaclulator();

    static PriceCaclulator getCaclculator() {
        return PRICE_CACLULATOR;
    }

    Price caclulatePrice(Ticket ticket, Date endTime) {
        return new Price((endTime.getTime() - ticket.generated.getTime()) * ticket.parkingRate);
    }
}

interface Admin {

    void addParkingSpot(ParkingLot parkingLot, ParkingSpot parkingSpot) throws SpotNotFoundException;

    void removeParkingSpot(ParkingLot parkingLot, ParkingSpot parkingSpot) throws SpotNotFoundException;
}

abstract class GeneralAdmin extends Person implements Admin {

    public GeneralAdmin(String name) {
        super(name);
    }

    @Override
    public void addParkingSpot(ParkingLot parkingLot, ParkingSpot parkingSpot) throws SpotNotFoundException {
        parkingLot.getSpotCollection().addSpot(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingLot parkingLot, ParkingSpot parkingSpot) throws SpotNotFoundException {
        parkingLot.getSpotCollection().removeSpot(parkingSpot);
    }
}

class MallAdmin extends GeneralAdmin {

    public MallAdmin(String name) {
        super(name);
    }

}

class Ticket {

    long ticketId;
    Vechile vechile;
    Date generated;
    double parkingRate;
    ParkingSpot parkingSpot;
    static long nextId = 0;
    GateWorker assignedBy;

    public Ticket(Vechile vechile, Date generated, ParkingSpot parkingSpot, double parkingRate, GateWorker assignedBy) {
        this.ticketId = nextId++;
        this.vechile = vechile;
        this.generated = generated;
        this.parkingSpot = parkingSpot;
        this.parkingRate = parkingRate;
        this.assignedBy = assignedBy;
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketId=" + ticketId + ", vechile=" + vechile + ", generated=" + generated + ", parkingRate=" + parkingRate + ", parkingSpot=" + parkingSpot + ", assignedBy=" + assignedBy + '}';
    }

}

interface ParkingLot {

    SpotCollection<ParkingSpot> getSpotCollection();

    Map<String, Admin> getAdmins();

    Map<String, GateWorker> getGateWorkers();

    void addAdmin(String name, Admin admin);

    void addGateWorker(String name, GateWorker gateWorker);
}

class MallParkingLot implements ParkingLot {

    SpotCollection mallSpotCollection = new MallSpotCollection();
    Map<String, Admin> admins;
    Map<String, GateWorker> gateWorkers;

    public MallParkingLot() {
        this.admins = new HashMap<>();
        this.gateWorkers = new HashMap();
    }

    @Override
    public SpotCollection<ParkingSpot> getSpotCollection() {
        return mallSpotCollection;
    }

    @Override
    public Map<String, Admin> getAdmins() {
        return admins;
    }

    @Override
    public Map<String, GateWorker> getGateWorkers() {
        return gateWorkers;
    }

    @Override
    public void addAdmin(String name, Admin admin) {
        this.admins.put(name, admin);
    }

    @Override
    public void addGateWorker(String name, GateWorker gateWorker) {
        this.gateWorkers.put(name, gateWorker);
    }
}
