package com.oracle.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ProductDetails")
public class Product {
	private int productId;
	private String productName;
	private float price;
	private List<Review> reviews;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String productName, float price,List<Review> reviews ) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.reviews=reviews;
	}
	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
