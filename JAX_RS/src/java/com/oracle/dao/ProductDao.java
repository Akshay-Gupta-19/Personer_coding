package com.oracle.dao;
import java.util.ArrayList;
import java.util.List;
import com.oracle.model.Product;
//DAO --> Data Access Object
import com.oracle.model.Review;


public class ProductDao {
	private List<Product> productList =new ArrayList<Product>();
	//Assume these data read from the Database ..
	{
		Review r1=new Review(19991, "Very comfort to use", 5);
		Review r2=new Review(19992, "Nice", 4);
		Review r3=new Review(19994, "Good", 2);
		Review r4=new Review(19995, "Excellent", 5);
		Review r5=new Review(19997, "Ok ok", 3);
		Review r6=new Review(19999, "nice product", 4);
		Review r7=new Review(19993, "Very Good", 4);
		
		List <Review>reviewList=new ArrayList<Review>();
		reviewList.add(r1);
		reviewList.add(r2);
		reviewList.add(r3);
		reviewList.add(r4);
		
		List <Review>reviewList2=new ArrayList<Review>();
		reviewList2.add(r5);
		reviewList2.add(r6);
		reviewList2.add(r7);
		
		Product p1=new Product(101, "Nike Shoe", 2999.99f,reviewList);
		Product p2=new Product(519,"Redmi Note 5",15000,null);
		Product p3=new Product(201,"Dell Laptop",55000,reviewList);
		Product p4=new Product(602,"Iphone",85000,reviewList2);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
	}
	public List<Product> readAllProducts(){
		System.out.println("in DAO ...");
		return productList;
	}
}
