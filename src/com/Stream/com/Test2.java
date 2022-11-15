package com.Stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
	int id;
	String name;
	float price;
public Product2(int id ,String name,float price) {
	this.id=id;
	this.name=name;
	this.price=price;
}
}

public class Test2 {
public static void main(String[]args) {
	List<Product2>plist=new ArrayList<>();
	plist.add(new  Product2 (1,"HP Laptop",25000f));
	plist.add(new  Product2 (2,"Dell Laptop",55000f));
	plist.add(new  Product2 (3,"Lenovo Laptop",75000f));
	plist.add(new  Product2 (4,"Sony Laptop",85000f));
	plist.add(new  Product2 (5,"Apple Laptop",95000f));
	List<Float>pPrice=	plist.stream()
			 .filter(p -> p.price > 30000)// filtering data  
             .map(p->p.price)        // fetching price  
             .collect(Collectors.toList()); // collecting as list  
System.out.println(pPrice);  
}
}
