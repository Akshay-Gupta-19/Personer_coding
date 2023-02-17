/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StatePattern;
import java.util.*;
/**
 *
 * @author guptaakshay
 */
public class CalendarEventsState {
    public static void main(String[] args) {
        Person organizer =new Person("Akshay Gupta", "akshay.gupta@gmail.com");
        Person Attendee =new Person("Shivam raina", "shivam@gmail.com");
        Event myEvent=new CalendarEvent(organizer, "Test event body", "Test subject", Arrays.asList(Attendee), new Date(100), new Date(200), 100, false);
        myEvent.send();
        System.out.println("Event now "+myEvent);
        myEvent.saveAsDraft();
        System.out.println("\nEvent now "+myEvent);
        myEvent.clear();
        System.out.println("after clearing "+myEvent);
    }
}
interface EventActions{
    void send();
    void saveAsDraft();
    void delete();
    void update(Event newEvent);
    void clear();
}
class Person{
    String name;
    String email;
    
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ",\n email=" + email + '}';
    }
    
}
abstract class Event{
    Person organizer;
    String body;
    String subject;
    List<Person> recipent;
    Date start,end;
    int eventId;
    boolean isDeleted;

    public Event(Person organizer, String body, String subject, List<Person> recipent, Date start, Date end, int eventId, boolean isDeleted) {
        this.organizer = organizer;
        this.body = body;
        this.subject = subject;
        this.recipent = recipent;
        this.start = start;
        this.end = end;
        this.eventId = eventId;
        this.isDeleted = isDeleted;
    }
    
   
    private void copy(Event newEvent){
        this.organizer=newEvent.organizer;
        this.body=newEvent.body;
        this.subject=newEvent.subject;
        this.recipent=newEvent.recipent;
        this.start=newEvent.start;
        this.end=newEvent.end;
    }
    
    abstract void send();
    abstract void saveAsDraft();
    abstract void delete();
    abstract void clear();
    void update(Event newEvent){
        copy(newEvent);
    }
    final void clearEventData(){
        this.organizer = null;
        this.body = null;
        this.subject = null;
        this.recipent = null;
        this.start = null;
        this.end = null;
    }

    @Override
    public  String toString() {
        return "Event{" + "organizer=" + organizer + ",\n body=" + body + ",\n subject=" + subject + ",\n recipent=" + recipent + ",\n start=" + start + ",\n end=" + end + ",\n eventId=" + eventId + ",\n isDeleted=" + isDeleted + '}';
    }

}
class CalendarEvent extends Event{
    EventActions draft=new Draft(this);
    EventActions newState=new NewEvent(this);
    EventActions published=new PublishedEvent(this);
    EventActions deleted=new DeletedEvent(this);
    EventActions publishedModified=new PublishedModified(this);
    EventActions currenntState;

    public CalendarEvent( Person organizer, String body, String subject, List<Person> recipent, Date start, Date end, int eventId, boolean isDeleted) {
        super(organizer, body, subject, recipent, start, end, eventId, isDeleted);
        this.currenntState=newState;
    }
    
    @Override
    public void send(){
        currenntState.send();
    }
    
    @Override
    public void saveAsDraft(){
        currenntState.saveAsDraft();
    }
    
    @Override
    public void delete(){
        currenntState.delete();
    }
    
    @Override
    public void clear(){
        currenntState.clear();
    }
    
    @Override
    public void update(Event newEvent){
        currenntState.update(newEvent);
    }

    public void setCurrenntState(EventActions currenntState) {
        this.currenntState = currenntState;
    }

    @Override
    public String toString() {
        return super.toString()+", currenntState=" + currenntState + '}';
    }

}

class Draft implements EventActions{

    CalendarEvent event;
    
    Draft(CalendarEvent event){
        this.event=event;
    }
    
    @Override
    public void send() {
        event.setCurrenntState(event.published);
    }

    @Override
    public void saveAsDraft() {
        event.setCurrenntState(event.draft);
    }

    @Override
    public void delete() {
        event.setCurrenntState(event.deleted);
    }

    @Override
    public void update(Event newEvent) {
        this.event.update(newEvent);
    }

    @Override
    public void clear() {
       this.event.clearEventData();
    }

    @Override
    public String toString() {
        return "current state is draft";
    }
    
}

class DeletedEvent implements EventActions{

    Event event;

    public DeletedEvent(Event event) {
        this.event = event;
    }
    
    @Override
    public void send() {
        System.out.println("Cant send delted event");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("Cant save deleted event");
    }

    @Override
    public void delete() {
        System.out.println("Can't delete deleted event");
    }

    @Override
    public void update(Event newEvent) {
        System.out.println("Cant' update deleted event");
    }

    @Override
    public void clear() {
        event.clearEventData();
        System.out.println("Cant clear deleted event");
    }

    @Override
    public String toString() {
        return "current state is deleted";
    }
    
}

class NewEvent implements EventActions{

    CalendarEvent event;

    public NewEvent(CalendarEvent event) {
        this.event = event;
    }
    
    @Override
    public void send() {
        event.setCurrenntState(event.published);
        System.out.println("Sending a new event");
    }

    @Override
    public void saveAsDraft() {
        event.setCurrenntState(event.draft);
        System.out.println("Saved the new event");
    }

    @Override
    public void delete() {
        event.setCurrenntState(event.deleted);
        System.out.println("Deleting new event");
    }

    @Override
    public void update(Event newEvent) {
        event.update(newEvent);
    }

    @Override
    public void clear() {
        event.clearEventData();
    }
    
    @Override
    public String toString() {
        return "current state is new event";
    }
    
}

class PublishedModified implements EventActions{

    CalendarEvent event;

    public PublishedModified(CalendarEvent event) {
        this.event = event;
    }
    
    @Override
    public void send() {
        event.setCurrenntState(event.published);
        System.out.println("Sending a after modified event");
    }

    @Override
    public void saveAsDraft() {
        event.setCurrenntState(event.draft);
        System.out.println("Saved the modified changes");
    }

    @Override
    public void delete() {
        event.setCurrenntState(event.deleted);
        System.out.println("Deleting modified event");
    }

    @Override
    public void update(Event newEvent) {
        event.update(newEvent);
    }

    @Override
    public void clear() {
        event.clearEventData();
    }
    
    @Override
    public String toString() {
        return "current state is published modified";
    }
    
}

class PublishedEvent implements EventActions{

    CalendarEvent event;

    public PublishedEvent(CalendarEvent event) {
        this.event = event;
    }
    
    @Override
    public void send() {
        System.out.println("Can't send without an update");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("Can't save published event without changes");
    }

    @Override
    public void delete() {
        event.setCurrenntState(event.deleted);
    }

    @Override
    public void update(Event newEvent) {
        event.update(newEvent);
        event.setCurrenntState(event.publishedModified);
    }

    @Override
    public void clear() {
        event.clearEventData();
        event.setCurrenntState(event.publishedModified);
    }
    
    @Override
    public String toString() {
        return "current state is published";
    }
    
}
