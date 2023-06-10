/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THoughtSpot;

import java.util.*;

/**
 *
 * @author guptaakshay
 */
public class StackPrint {
    void printStackVersion(int operations[][]){
        List<Operation> operationsList=new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
           if(operations[i][0]==0){
               //push operation
               int value = operations[i][1];
               operationsList.add(new Operation(StackOperation.PUSH,value));
           }
           else if(operations[i][1] == 1){
               operationsList.add(new Operation(StackOperation.POP,-1));
           }
           else{
               int version= operations[i][1];
               Stack<Integer> currStack= new Stack<>();
               for (int j = 0; j < version; j++) {
                   switch(operationsList.get(j).type){
                       case PUSH:
                           currStack.add(operationsList.get(j).value);
                       case POP:
                           currStack.pop();
                   }
               }
               System.out.println(currStack);
           }
        }
    }
    class Operation{
        StackOperation type;
        int value;

        public Operation(StackOperation type,int value) {
            this.type=type;
            this.value = value;
        }
    }
}
enum StackOperation{
    PUSH,
    POP
}