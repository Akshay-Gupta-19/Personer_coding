/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

import java.util.*;

/**
 *
 * @author guptaakshay
 */
public class CalendarEvent {
    Date startDate,endDate;
}
class CalendarAppoinment extends CalendarEvent{
    
}
class Meeting extends CalendarEvent{
    List<Attendee> attendee;
    
}
class User{
    String name;
}
class Organizer extends User{
    
}
class Attendee extends User{
    
}

class CalendarEventFactory{
    CalendarEvent getEvent(String event){
        return switch (event) {
            case "Meeting" -> new Meeting();
            case "Appointment" -> new CalendarAppoinment();
            default -> new CalendarEvent();
        };
    }
}

class Driver{
    public static void main(String[] args) {
        CalendarEventFactory cef=new CalendarEventFactory();
        CalendarEvent meeting = cef.getEvent("Meeting");
        System.out.println(meeting);
    }
}