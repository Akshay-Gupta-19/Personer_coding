/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
class sample{
    String[] codeText;

    public sample(String largeString[]) {
         this.codeText=new String[largeString.length];
        for (int i = 0; i < largeString.length; i++) {
               this.codeText[i]=largeString[i];
               System.out.print("");
        }
    }
    
}
/**
 *
 * @author akggupta
 */
public class TimeForObjectCreationOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Single Instence");
        String largeStrings[]=new String[10000000];
        for (int i = 0; i < largeStrings.length; i++) {
            for (int j = 0; j < 10; j++) {
                largeStrings[i]+=j;
            }
        }
        sample oneObj=new sample(largeStrings);
        for (int i = 0; i < oneObj.codeText.length; i++) {
            String oneString=oneObj.codeText[i];
            for (int j = 0; j < oneString.length(); j++) {
                System.out.print("");
                System.out.print("");
            }
        }
    }
    
}
