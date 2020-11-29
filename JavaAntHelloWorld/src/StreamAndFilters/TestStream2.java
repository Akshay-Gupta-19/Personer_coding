package StreamAndFilters;

import java.util.ArrayList;
import java.util.stream.Stream;
class Product implements Comparable<Product>{
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
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + '}'+"\n";
    }

    @Override
    public int compareTo(Product p) {
        return (int)(this.price-p.price);
    }
   
}

public class TestStream2 {
    public static void main(String[] args) {
         Product p1=new Product(101,"SamsungM20",9000,4.1f);  
      Product p2=new Product(102,"Iphone",60000,4.5f);
      Product p3=new Product(103,"One Plus",30000,4.3f);
      Product p4=new Product(104,"Redmi",12000,4.4f);
      Product p5=new Product(105,"Vivo",14000,3.9f);
      ArrayList<Product> list=new ArrayList<>();
      list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);

      Stream<Product> firstStream=list.stream();
      Stream<Product> secondStream=firstStream.filter(a->a.getRating()>4);
      secondStream.forEach(p->System.out.println(p));
    
        System.out.println("\n");
   
   list.stream().filter(a->a.getPrice()>13000).forEach(a->System.out.println(a));
    }
}
