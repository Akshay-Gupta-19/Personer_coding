/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package PhonePe;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guptaakshay
 */
public class TrieTest {
    
    public TrieTest() {
    }
    
    static Trie pendencySystem;
    
    @BeforeClass
    public static void setUpClass() {
        pendencySystem=new Trie();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of getCount method, of class Trie.
     */
    @Test
    public void testGetCount() {
        pendencySystem.add(1112, List.of("UPI", "Karnataka", "Bangalore"));
        pendencySystem.add(2451, List.of("UPI", "Karnataka", "Mysore"));
        pendencySystem.add(3421, List.of("UPI", "Rajasthan", "Jaipur"));
        pendencySystem.add(1221, List.of("Wallet", "Karnataka", "Bangalore"));
        assertEquals(3,pendencySystem.getCount(List.of("UPI")));
        assertEquals(2,pendencySystem.getCount(List.of("UPI", "Karnataka")));
        assertEquals(1,pendencySystem.getCount(List.of("UPI", "Karnataka", "Bangalore")));
        assertEquals(0,pendencySystem.getCount(List.of( "Bangalore")));
        pendencySystem.add(4221, List.of("Wallet", "Karnataka", "Bangalore"));
        
        pendencySystem.remove(1112);  
        pendencySystem.remove(2451);
        
        assertEquals(1,pendencySystem.getCount(List.of("UPI")));
        assertEquals(2,pendencySystem.getCount(List.of("Wallet")));
        assertEquals(0,pendencySystem.getCount(List.of("UPI", "Karnataka", "Bangalore")));
       
    }
    
    
}
