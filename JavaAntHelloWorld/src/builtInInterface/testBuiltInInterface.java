/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builtInInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.List;
import java.util.function.Consumer;
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

public class testBuiltInInterface {
    public static void main(String[] args) {
                Product p1=new Product(101,"sambung",12499,3);
        Product p2=new Product(102,"nokia",13499,2);
        Product p3=new Product(103,"iphone",14499,1);
        Product p4=new Product(104,"redmi",12599,6);
        Product p5=new Product(105,"oneplus",17499,4);
        ArrayList<Product> list=new ArrayList<>();
        list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
        List<Product> li=List.of(p1,p2,p3,p4);
        //System.out.println(li);
        
        Consumer c=a->{System.out.println(a);};
        li.forEach(a->{System.out.println(a);});//can pass c instead
        //searchAndDis(list, p->p.getPrice()>13000);
    }
    static void searchAndDis(List<Product> list,Predicate<Product> pr){
        for (int i = 0; i < list.size(); i++) {
           if(pr.test(list.get(i)))System.out.println(list.get(i)); 
        }
        
    }
}
