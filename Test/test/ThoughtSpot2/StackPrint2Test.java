/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ThoughtSpot2;

import java.util.List;
import java.util.Random;
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
        
    }
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
        StackPrint2 stackPrint2=new StackPrint2();
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
        assertEquals(List.of(8,7,6,3,2,1),stackPrint2.print(10));
    }
    
    @Test
    public void smallTest(){
        StackPrint2 stackPrint2=new StackPrint2();
        StackPrintTesterHelper tester=new StackPrintTesterHelper();
        Random random=new Random();
        int ver=0;
        for (int i = 0; i < 10000; i++) {
            int operation=random.nextInt(3);
            switch(operation){
                case 0:
                    int nextVal=random.nextInt(100000);
                    stackPrint2.push(nextVal);
                    tester.push(nextVal);
                    ver++;
                    break;
                case 1:
                    if(stackPrint2.stack.head==null)
                            continue;
                    stackPrint2.pop();
                    tester.pop();
                    ver++;
                    break;
                case 2:
                    int version = random.nextInt(ver+1);
                    assertTrue("Failed for ",stackPrint2.print(ver).equals(tester.print(ver)));
                    break;
            }
        }
    }
}

