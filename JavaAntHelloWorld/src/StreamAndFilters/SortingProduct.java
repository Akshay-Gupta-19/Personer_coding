package StreamAndFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingProduct {
    public static void main(String[] args) {
                 Product p1=new Product(101,"SamsungM20",9000,4.1f);  
      Product p2=new Product(102,"Iphone",60000,4.5f);
      Product p3=new Product(103,"One Plus",35000,4.3f);
      Product p4=new Product(104,"Redmi",12000,4.4f);
      Product p5=new Product(105,"One Plus",31000,4.4f);
      Product p6=new Product(106,"Redmi",12000,4.4f);
      Product p7=new Product(107,"Vivo",14000,3.9f);
      Product p8=new Product(108,"Vivo",15000,5.9f);
      Product p9=new Product(109,"Vivo",17000,2.9f);
      
      ArrayList<Product> list=new ArrayList<>();
      list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
      list.add(p6);list.add(p7);list.add(p8);list.add(p9);
      
      System.out.println("Natural order on prices");
      list.stream().sorted().forEach(a->System.out.println(a));
        
      System.out.println("My orderingin on ids");
      list.stream().sorted((a,b)->b.id-a.id).forEach(a->System.out.println(a));
      
        System.out.println("Order by method reference");
      list.stream().sorted(SortingProduct::compareByRaate).forEach(a->System.out.println(a));
        
      //cheapest,costliest,highest,lowest rating
        System.out.println("Costliest");
        System.out.println(list.stream().max((a,b)->(int)(a.price-b.price)).get());
        System.out.println("Cheapest");
        System.out.println(list.stream().min((a,b)->(int)(a.price-b.price)).get());
        System.out.println("Least Rated");
        System.out.println(list.stream().max((a,b)->(a.rating>=b.rating)?1:-1).get());
        System.out.println("Most Rated");
        System.out.println(list.stream().min((a,b)->(a.rating>=b.rating)?1:-1).get());
    
        double sum=list.stream().mapToDouble(p->p.getPrice()).sum();
        System.out.println("Sum of all product");
        System.out.println(sum);
        
        System.out.println("average of product");
       String avg=list.stream().mapToDouble(p->p.getPrice()).average().toString();
        System.out.println(avg);
        
        System.out.println("average of ratings");
       double avgOfRat=list.stream().mapToDouble(p->p.getRating()).average().getAsDouble();
        System.out.println(avgOfRat);
        
        System.out.println();
        //printing only id stream
        System.out.println("IDs");
        list.stream().map(p->p.id).forEach(a->System.out.print(a+" "));
        System.out.println();
        
        List<Product> ip=list.stream().filter(a->a.getName().equals("Iphone")).collect(Collectors.toList());
        System.out.println("Iphone only collected");
        ip.forEach(a->System.out.println(a));
        
        Map<String, List<Product>> collect = list.stream().collect(Collectors.groupingBy(e->e.getName()));
        System.out.println(collect);
        
        list.stream().collect(Collectors.partitioningBy(e->e.name=="Vivo"));
        
    }   
    static int compareByRaate(Product p1,Product p2){return (int)(p1.rating-p2.rating);}
}
