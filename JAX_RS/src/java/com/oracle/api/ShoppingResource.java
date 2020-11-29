package com.oracle.api;

import java.util.List;

import com.oracle.dao.ProductDao;
import com.oracle.model.Product;
import com.oracle.model.Review;
import java.util.Comparator;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value="/products")
public class ShoppingResource {
	ProductDao dao =new ProductDao();
	
        @GET
        @Path(value="/SampleProduct")
	public String getSampleProducts(){
		return "<font color=blue size=10> Displays Sample Products </font>";
	}
	
	@GET
        //@Produces(MediaType.APPLICATION_XML)
        //@Produces(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
        public List<Product> getAllProducts(@QueryParam("order") String order){
            
		System.out.println("in get products ...");
                List<Product> list=dao.readAllProducts();
                if(order!=null && order.equals("desc")){
                    list.sort(new Comparator<Product>() {

                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice()-o2.getPrice()>0?-1:0;
                        }
                    });
                }
                
                return list;
	}
	
        @GET
        @Path(value = "/{productId}")
        @Produces(MediaType.APPLICATION_JSON)
	public Product getProductById(@PathParam("productId")int pid){
		List<Product> productList=dao.readAllProducts();
		for(Product p:productList){
			if(pid==p.getProductId())
				return p;
		}
		return null;
	}

        @GET
        @Path(value = "/{productId}/reviews")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Review> getReviewsProductById(@PathParam("productId")int pid){
		List<Product> productList=dao.readAllProducts();
		for(Product p:productList){
			if(pid==p.getProductId())
				return p.getReviews();
		}
		return null;
	}
	
	@DELETE
        @Path(value = "/{productId}")
        @Produces(MediaType.APPLICATION_JSON)
	public List<Product> deleteProduct(int pid){
		List<Product> productList=dao.readAllProducts();
		int index=0;
		for(Product p:productList){
		
			if(pid==p.getProductId())
				break;
			index++;
		}
                productList.remove(index);
		return productList;
	}
	
        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.APPLICATION_XML)
	public List<Product> addProduct(Product p){
		List<Product> productList=dao.readAllProducts();
		productList.add(p);
		return productList;
	}
}
