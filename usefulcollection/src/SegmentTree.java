/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SegmentTree {
    
}
class NumArray {

    public NumArray(int[] nums) {
        root=buildTree(nums,0,nums.length-1);
        arr=nums;
        //preOrder(root);
    }
    int arr[];
    Node root;
    public Node buildTree(int arr[],int s,int e){
        if(s==e)
            return new Node(arr[s],s,e);
        int mid=s+(e-s)/2;
        Node ls=buildTree(arr,s,mid);
        Node rs=buildTree(arr,mid+1,e);
        Node newNode=new Node(ls.val+rs.val,s,e);
        newNode.left=ls;
        newNode.right=rs;
        return newNode;
    }
    public void update(int index, int val) {
        int diff=val-arr[index];
        arr[index]=val;
        update(root,index,diff);
    }
    public void update(Node root,int ind,int diff){
        if(root==null)return;
        if(root.l<=ind && root.r>=ind){
            root.val+=diff;
            update(root.left,ind,diff);
            update(root.right,ind,diff);
        }
    }
    public int sumRange(int left, int right) {
        return findSum(root,left,right);
    }
    int findSum(Node root,int left,int right){
        if(root.l>=left && root.r<=right)return root.val;
        if(root.r<left || root.l>right)return 0;
        return findSum(root.left,left,right)+findSum(root.right,left,right);
    }
}
class Node{
    int val;
    int l,r;
    Node left,right;
    Node(int v,int l,int r){
        val=v;
        this.l=l;
        this.r=r;
    }
    public String toString(){
        return "val "+val+" left "+l+" right "+r;
    }
}