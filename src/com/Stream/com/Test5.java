package com.Stream.com;

import java.util.ArrayList;
import java.util.List;

class Products{
	int id;
	String name;
	float price;
	public Products(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Test5 {

	public static void main(String[] args) {
		List<Products>list=new ArrayList<>();
		list.add(new Products(1,"HP Laptop",30000f));
		list.add(new Products(2,"Dell Laptop",70000f));
		list.add(new Products(3,"Lanovo Laptop",90000f));
		list.add(new Products(4,"Sony Laptop",40000f));
		list.add(new Products(5,"Apple Laptop",100000f));
	     // This is more compact approach for filtering data  
        Float totalPrice = list.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        // More precise code   
        float totalPrice2 = list.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
	}

}
