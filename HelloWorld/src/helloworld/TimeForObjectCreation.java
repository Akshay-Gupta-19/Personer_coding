/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author akggupta
 */
class sample2{
    String[] codeText;

    public sample2(String largeString[]) {
        this.codeText=new String[largeString.length];
        for (int i = 0; i < largeString.length; i++) {
               this.codeText[i]=largeString[i];
               System.out.print("");
        }
    }
    
}
public class TimeForObjectCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Multiple Instences");
        String largeStrings[]=new String[10000000];
        sample2 obj[]=new sample2[largeStrings.length];
        for (int i = 0; i < largeStrings.length; i++) {
            for (int j = 0; j < 10; j++) {
                largeStrings[i]+=j;
            }
            String oneElementArray[]=new String[]{new String(largeStrings[i])};
            obj[i]=new sample2(oneElementArray);
        }
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj[i].codeText.length; j++) {
                for (int k = 0; k < obj[i].codeText[j].length(); k++) {
                    System.out.print("");
                    System.out.print("");
                }
            }
        }
        
    }
    
}
