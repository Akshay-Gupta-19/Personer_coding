/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;
import java.util.*;
/**
 *
 * @author akggupta
 */
public final class CausesVisitIterableForeachLoopNPE {
  public static final void main(String args[]) {
    final Map<String,Object> someMap = null;
    for (Object someVar : someMap) {  
    }
  }
}
