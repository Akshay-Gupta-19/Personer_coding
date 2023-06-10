/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhonePe;

import java.util.*;

/**
 *
 * @author guptaakshay
 */
class TrieNode {

    Map<String, TrieNode> childs;
    int transactionCount;
    TrieNode parent;
    public TrieNode() {
        childs = new HashMap<>();
    }
}

class Trie {

    TrieNode root;
    Map<Integer,TrieNode> idToNode;

    public Trie() {
        root=new TrieNode();
        idToNode=new HashMap<>();
    }
    
    void add(Integer id, List<String> hierarchicalTags) {
        TrieNode curr = root;
        TrieNode previousCurrent=root;
        for (int i = 0; i < hierarchicalTags.size(); i++) {
            previousCurrent=curr;
            String agla = hierarchicalTags.get(i);
            curr.childs.putIfAbsent(agla, new TrieNode());
            curr = curr.childs.get(agla);
            curr.parent=previousCurrent;
            curr.transactionCount++;
        }
        idToNode.put(id, curr);
    }
    
    void remove(int id){
        TrieNode removedTransaction=idToNode.get(id);
        for(TrieNode curr=removedTransaction;curr!=root;curr=curr.parent){
            curr.transactionCount--;
        }
    }
    int getCount(List<String> tags){
        TrieNode curr=root;
        for (int i = 0; i < tags.size(); i++) {
            String agla = tags.get(i);
            if(!curr.childs.containsKey(agla)){
                return 0;
            }
            curr=curr.childs.get(agla);
        }
        return curr.transactionCount;
    }
}

