package javaanthelloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
 class BuitInFunctionalInterfacesEx {
    public static void main(String[] args) {
      Product p1=new Product(101,"SamsungM20",9000,4.1f);  
      Product p2=new Product(102,"Iphone",60000,4.5f);
      Product p3=new Product(103,"One Plus",30000,4.3f);
      Product p4=new Product(104,"Redmi",12000,4.4f);
      Product p5=new Product(105,"Vivo",14000,3.9f);
      ArrayList<Product> list=new ArrayList<>();
      list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
       
      System.out.println("Displaying products price <=30000");
        searchAndDisplay(list, p->p.getPrice()<=30000, p->userInterfaceLayer(p));
        System.out.println("***Iphone Details** ");
        searchAndDisplay(list, p->p.getName().equals("Iphone"),p->dataLayer(p));
    
    }
    static void searchAndDisplay(List<Product> list,
            Predicate<Product> predicate,Consumer<Product> consumer){
        for(Product p:list){
            if(predicate.test(p)){
                consumer.accept(p);
                //System.out.println(p.getProdName()+"\t"+p.getPrice()+"\t"+p.getRatings());
            }
        }
     /*   list.stream().filter((p) -> (predicate.test(p))).forEachOrdered((p) -> {
            consumer.accept(p);
            //System.out.println(p.getProdName()+"\t"+p.getPrice()+"\t"+p.getRatings());
        });*/
    }
    static void userInterfaceLayer(Product p){//DISPLAY in UI
        System.out.println("****In UI Layer ****");
        System.out.println(p.getName()+"\t"+p.getPrice()+"\t"+p.getRating()+"\n");
    }
    static void dataLayer(Product p){ //Stores in DB
        System.out.println("****In DATA Layer ****");
        System.out.println(p.getName()+"\t"+p.getPrice()+"\t"+p.getRating()+"\n");
    }
}
