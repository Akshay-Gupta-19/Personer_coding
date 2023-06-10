/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ThoughtSpot2;

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
public class StackPrint2Test {
    
    public StackPrint2Test() {
        stackPrint2=new StackPrint2();
    }
    static StackPrint2 stackPrint2;
    @BeforeClass
    public static void setUpClass() {
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

    @Test
    public void testPrint() {
        for (int i = 0; i < 5; i++) {
            stackPrint2.push(i+1);
        }
        for (int i = 0; i <2; i++) {
            stackPrint2.pop();
        }
        for (int i = 0; i < 5; i++) {
            stackPrint2.push(i+6);
        }
        assertEquals(List.of(3,2,1),stackPrint2.print(3));
        assertEquals(List.of(5,4,3,2,1),stackPrint2.print(5));
        assertEquals(List.of(3,2,1),stackPrint2.print(7));
        assertEquals(List.of(1,2,3,6,7,8),stackPrint2.print(10));
    }
    
}
