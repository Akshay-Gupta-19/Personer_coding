/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThoughtSpot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author guptaakshay
 */

public class StackPrintTesterHelper {
    int currentVersion = 0;
    Map<Integer, NodeTest> versionToNodeMap = new HashMap<>();
    NodeListTest snapshots = new NodeListTest();

    public void push(int value) {
        NodeTest snapshot = snapshots.add(value);
        versionToNodeMap.put(++currentVersion, snapshot);
        System.out.print("Push(" + value + ") -> ");
        printList(snapshot);
        System.out.println(", version=" + currentVersion);
    }

    public void pop() {
        NodeTest snapshot = snapshots.remove();
        versionToNodeMap.put(++currentVersion, snapshot);
        System.out.print("Pop -> ");
        printList(snapshot);
        System.out.println(", version=" + currentVersion);
    }

    public List<Integer> print(int version) {
        System.out.print("print(" + version + ") -> ");
        NodeTest snapshot = versionToNodeMap.get(version);
        return printList(snapshot);
    }

    private List<Integer> printList(NodeTest temp) {
        List<Integer> ans=new ArrayList<>();
        while (temp.next != null) {
            ans.add(temp.value);
            temp = temp.next;
        }
        Collections.reverse(ans);
        return ans;
    }
}
class NodeTest{
    int value;
    NodeTest next;
    NodeTest prev;

    public NodeTest() {
    }

    public NodeTest(int value, NodeTest next, NodeTest prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    
}
class NodeListTest {
    NodeTest head;
    NodeTest tail;

    public NodeListTest() {
        head = new NodeTest();
        tail = new NodeTest();
        head.next = tail;
        tail.prev = head;
    }

    public NodeTest add(int value) {
        NodeTest node = new NodeTest(value, head.next, head);
        head.next = node;
        node.next.prev = node;
        return node;
    }

    public NodeTest remove() {
        NodeTest node = head.next;
        if (node != tail) {
            head.next = node.next;
            node.next.prev = head;
        }
        return node.next;
    }
}