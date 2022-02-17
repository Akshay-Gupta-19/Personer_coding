/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.trie1;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
class MainTrie {
    public static void main(String[] args) {
        InputReader sc=new InputReader(System.in);
        int q=sc.nextInt();
        Trie mt=new Trie();
        for (int i = 0; i < q; i++) {
            switch(sc.readString()){
                case "add":
                    mt.insert(sc.readString());
                    break;
                case "find":
                    System.out.println(mt.getPrefixNo(sc.readString()));
            }
        }
    }
}

class Trie {
    final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }
    public int getPrefixNo(String s){
        TrieNode temp=root;
        for (int i=0; i<s.length() && temp!=null; temp=temp.next(s.charAt(i)),i++);  
        if(temp==null)return 0;
       return countSon(temp);
    }
    public int countSon(TrieNode node){
       TrieNode t[]=node.childs;
       int ans=node.terminating;
        for (int i = 0; i < t.length; i++)
        {if(t[i]!=null)
           ans+=countSon(t[i]);
       } 
       return ans;
    }
    
    public void insert(final String s) {
        TrieNode current = root;
        for (int i = 0; i < s.length(); i++) {
            if (current.childs[s.charAt(i) - 'a'] == null) {
                current.childs[s.charAt(i) - 'a'] = new TrieNode();
            }
            current = current.next(s.charAt(i));
        }
        current.terminating++;
    }
}

class TrieNode {
    int terminating;
    final TrieNode[] childs = new TrieNode[26];

    public TrieNode next(final char c) {
        return childs[c - 'a'];
    }
}



 class InputReader {
 
		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar, snumChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
