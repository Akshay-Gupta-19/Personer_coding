/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akshay Gupta
 */
public class Client {
    public static void main(String[] args) {
        Library library=new Library("Shaitan gali", "WBH");
        Admin admin=new IITBAdmin(library);
        Librarian librarian=new IITBLibrarion(library);
        Member member = new IITBMemeber(librarian);
        
        admin.addLocation(new Location(0,1,1,1));
        try {
            BookType harryBook=new BookType("Harry potter", "101", "JKR", new Date(10,11,12));
            admin.addBooType(harryBook);
            admin.addBookCopy(new BookCopy(101,harryBook));
        } catch (LibraryFull ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BookNotAvailable ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
