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

interface ICalendarItem{
    String printDetails();
}
class Item implements ICalendarItem{
    String Description;

    public Item(String Description) {
        this.Description = Description;
    }
    
    @Override
    public String printDetails() {
        return this.Description;
    }
    
}

abstract class ItemDecorator implements ICalendarItem{
    
}
class ItemEvent extends ItemDecorator{

    Date start,end;
    ICalendarItem item;

    public ItemEvent(Date start, Date end, ICalendarItem item) {
        this.start = start;
        this.end = end;
        this.item = item;
    }
    
    @Override
    public String printDetails() {
        return item.printDetails() +" Start Date = "+start+" EndDate "+end;
    }    
}
class Drive{
    public static void main(String[] args) {
        ICalendarItem plainItem=new Item("abc");
        ICalendarItem event = new ItemEvent(new Date(100), new Date(200), plainItem);
        System.out.println(event.printDetails());
    }
}