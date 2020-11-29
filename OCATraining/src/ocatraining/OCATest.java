/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatraining;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akggupta
 */


class FeedingSchedule {

    public static void main(String[] args) {
     
    }
}
 class FeedingSchedule2 {
 public static void main(String[] args) {
 int x = 5, j = 0;
 OUTER: for(int i=0; i<3; )
 INNER: do {
 i++; x++;
 if(x > 10) break INNER;
 x += 4;
 j++;
 } while(j <= 2);
 System.out.println(x);
 } }
 class BearOrShark {
 public static void main(String[] args) {
 int luck = 10;
 if((luck>10 ? luck++: --luck)<10) {
 System.out.print("Bear");
 } if(luck<10) System.out.print("Shark");
 } }
interface Animal { public String getName() ; }
 interface Mammal { public  String getName(); }
 abstract class Otter implements Mammal, Animal {}