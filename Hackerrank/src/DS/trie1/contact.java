/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.trie1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class contact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        MyTrie<Character> mt=new MyTrie<>();
        for (int i = 0; i < q; i++) {
            switch(sc.next()){
                case "add":
                    char c[]=sc.next().toCharArray();
                    Character cc[]=new Character[c.length];
                    for (int j = 0; j <c.length; j++) {
                        cc[j]=c[j];
                    }
                    mt.insert(cc);
                    break;
                case "find":
                    System.out.println(mt.getPrefixNo(sc.next()));
            }
        }
    }
   
}

class MyTrie<T> {
    final MyTrieNode<T> root;

    public MyTrie() {
        this.root = new MyTrieNode<>();
    }
    public int getPrefixNo(String s){
        MyTrieNode<T> temp=root;
        for (int i=0; i<s.length() && temp!=null; temp=temp.childs.get(s.charAt(i)),i++);  
        if(temp==null)return 0;
       return countSon(temp);
    }
    public int countSon(MyTrieNode<T> node){
       Iterator t=node.childs.keySet().iterator();
       int ans=node.terminating;
       while(t.hasNext()){
           ans+=countSon(node.childs.get(t.next()));
       } 
       return ans;
    }
    
    public int query(final T arr[]) {
        MyTrieNode<T> current = root;
        for (int i = 0; i < arr.length; i++) {
           current = current.next(arr[i]); 
            if (current == null) {
                return 0;
            }
        }
        return current.terminating;
    }

    public void insert(final T arr[]) {
        MyTrieNode<T> current = root;
        for (int i = 0; i < arr.length; i++) {
            if (!current.childs.containsKey(arr[i])) {
                MyTrieNode<T> nn=new MyTrieNode<T>();
                nn.parent=current;
                nn.value=arr[i];
                current.childs.put(arr[i], nn);
            }
            current = current.next(arr[i]);
        }
        
        current.terminating++;
    }
    public void delete(final T arr[]) {
        MyTrieNode<T> current = root;
        for (int i = 0; i < arr.length; i++) {
            current = current.next(arr[i]);  
            if (current == null) {
                throw new RuntimeException();
            }
        }
      if(current.terminating!=0)current.terminating--;
        if(current.terminating==0){
            while(current!=null && current.terminating==0 && current.childs.size()==0){
           MyTrieNode<T> temp=current;
           current=current.parent;
           current.childs.remove(temp.value);
            }
        }
    }
    public void update(final T old[], final T rep[]) {
        delete(old);
        insert(rep);
    }
}

class MyTrieNode<T> {
    int terminating;
    MyTrieNode<T> parent;
    T value;
    //final MyTrieNode[] mytrieNodes = new MyTrieNode[26];
    HashMap<T,MyTrieNode<T>> childs=new HashMap<>();
    public MyTrieNode next(final T c) {
        if(childs.containsKey(c))return childs.get(c);
        else return null;
    }
}
