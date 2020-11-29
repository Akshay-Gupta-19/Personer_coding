/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanthelloworld;
import java.util.*;
/**
 *
 * @author akggupta
 */
class Product{
    int id;
    String name;
    float price;
    float rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Product(int id, String name, float price, float rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + '}';
    }
   
}

@FunctionalInterface
interface SearchProduct{
    boolean search(Product p);
}

//lambda expression implements only for interfaces with only one method
public class NoLambda {
    public static void main(String[] args) {
        Product p1=new Product(101,"sambung",12499,3);
        Product p2=new Product(102,"nokia",13499,2);
        Product p3=new Product(103,"iphone",14499,1);
        Product p4=new Product(104,"redmi",12599,6);
        Product p5=new Product(105,"oneplus",17499,4);
        ArrayList<Product> list=new ArrayList<>();
        list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
        
        SearchProduct byRate = new SearchProduct(){
            public boolean search(Product p){return p.rating>10;}
        };
        SearchProduct byRate2 = (p) ->{System.out.println("Hello world");return p.rating>10;};
        SearchProduct byRate3 = p ->p.rating>10;//only one statement no need of return statement and curly braces
                                                //if only one param no need for backet around it

        searchPrint(list, byRate);
       
    }
    static void searchPrint(List<Product> l,SearchProduct cond){
        for (int i = 0; i < l.size(); i++) {
                if(cond.search(l.get(i)))System.out.println(l.get(i));
        }
    }
}
