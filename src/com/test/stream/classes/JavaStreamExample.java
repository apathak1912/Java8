package com.test.stream.classes;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  

		/*
		 * productsList.stream() .filter(p ->p.id == 2) .forEach(p ->
		 * System.out.println(p.name));
		 */
        
   /*  Float cost =   productsList.stream() 
    		 .map(product->product.price)  
    		 .reduce(0f,(sum,price)->sum+price);
     System.out.println(cost);*/
      
        /*Stream.iterate(1,n->n+1)
       .filter(n->n%2 ==0)
       .limit(10)
       .forEach(p -> System.out.println(p));*/
    List<String> names =   productsList.stream().map(x->x.name).collect(Collectors.toList());
    System.out.println(names);
  productsList.stream().filter(x->x.name.startsWith("H"))
    		.forEach(x->System.out.println(x.name));
    //System.out.println(names2);
    }  
}  