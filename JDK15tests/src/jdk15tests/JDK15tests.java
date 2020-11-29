/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk15tests;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author akggupta
 */
public class JDK15tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        
    }

}

class Trie {

    HashMap<Character, Trie> hm;
    boolean eh[];

    Trie() {
        hm = new HashMap();
        eh = new boolean[26];
    }

    public String toString() {
        return hm + " " + Arrays.toString(eh);
    }
}

class WordDictionary {

    Trie root;

    public WordDictionary() {
        Trie root = new Trie();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        char c[] = word.toCharArray();
        Trie temp = root;
        for (int i = 0; i < c.length; i++) {
            temp.hm.putIfAbsent(c[i], new Trie());
            if (i == c.length - 1) {
                temp.eh[c[i] - 'a'] = true;
            } else {
                temp = temp.hm.get(c[i]);
            }
        }
        System.out.println(root);
    }

    /**
     * Returns if the word is in the data structure. A word could contain the
     * dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
