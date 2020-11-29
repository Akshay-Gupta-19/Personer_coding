/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Map;

/**
 *
 * @author akggupta
 */
public final class CausesVisitIterableForeachLoopNPE {
  public static final void main(String args[]) {
    final Map<String,Object> someMap = null;
    
    for (Object someVar : someMap.keySet()) { 
        System.out.println("");
    }
  }
}