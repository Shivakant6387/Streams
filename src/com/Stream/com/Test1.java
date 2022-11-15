package com.Stream.com;

import java.util.*;

class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Test1 {

	private static List<Product> productPriceList;

	public static void main(String[] args) {
		List<Product>plist=new ArrayList<>();
		plist.add(new  Product (1,"HP Laptop",25000f));
		plist.add(new  Product (2,"	Dell Laptop",35000f));
		plist.add(new  Product (3,"Lenevo Laptop",45000f));
		plist.add(new  Product (4,"Sony Laptop",25000f));
		plist.add(new  Product (5,"APPLE Laptop",95000f));
		List<Float> productPriceList = new ArrayList<Float>();  
		for(Product product:plist) {
			if(product.price<95000) {
                productPriceList.add(product.price); 
			}
		}
		  System.out.println(productPriceList);
	}

}
