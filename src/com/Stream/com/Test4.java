package com.Stream.com;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id ;
	String name; 
	float price;
	public Product(int id ,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Test4 {
public static void main(String[]args) {
	List<Product>list = new ArrayList<>();
	list.add(new Product(1,"HP Laptop",30000f));
	list.add(new Product(2,"dell Laptop",70000f));
	list.add(new Product(3,"Lanovo Laptop",80000f));
	list.add(new Product(4,"Sony Laptop",40000f));
	list.add(new Product(5,"Apple Laptop",90000f));
	 list.stream()  
     .filter(product -> product.price == 30000)  
     .forEach(product -> System.out.println(product.name));
}
}
