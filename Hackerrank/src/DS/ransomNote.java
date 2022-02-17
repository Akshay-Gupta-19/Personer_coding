/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;
import java.util.*;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player>{

    @Override
    public int compare(Player t, Player t1) {
        if(t.score>t1.score)return 1;
        else if(t.score<t1.score)return -1;
        else {
            return t.name.compareTo(t1.name);
        }
    }
    
}


/**
 *
 * @author avnegers
 */

 class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        String ar1[]=magazine.split(" ");
        magazineMap=new HashMap<>();
        noteMap=new HashMap<>();
        for(int i=0;i<ar1.length;i++){
            if(!magazineMap.containsKey(ar1[i]))
                magazineMap.put(ar1[i],0);
            magazineMap.put(ar1[i],magazineMap.get(ar1[i])+1);
        }
        ar1=note.split(" ");
        noteMap=new HashMap<>();
        for(int i=0;i<ar1.length;i++){
            if(!noteMap.containsKey(ar1[i]))
                noteMap.put(ar1[i],0);
            noteMap.put(ar1[i],noteMap.get(ar1[i])+1);
        }
    }
    
    public boolean solve() {
        Set<String> s=noteMap.keySet();
        for(String akey:s){
            if(!magazineMap.containsKey(akey) || magazineMap.get(akey)!=noteMap.get(akey))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

