package com.ibm;

import java.util.UUID;

public class App {

	public static void main(String args[]) {
		Product product = new Product();

		product.createProduct(UUID.randomUUID().toString(), "AC", 1999.0);
		System.out.println(Product.getNumberOfProduct());
		System.out.println("Original price:" + Product.getProductPrice());
		System.out.println("2% Discount price :" + Product.discount());

		Product product1 = new Product();
		product1.createProduct(UUID.randomUUID().toString(), "TV", 2399.0);
		System.out.println(Product.getNumberOfProduct());
		System.out.println("Original price:" + Product.getProductPrice());
		System.out.println("2% Discount price :" + Product.discount());

		Product product2 = new Product();
		product2.createProduct(UUID.randomUUID().toString(), "fan", 3000.0);
		System.out.println(Product.getNumberOfProduct());
		System.out.println("Original price:" + Product.getProductPrice());
		System.out.println("2% Discount price :" + Product.discount());

		Product product3 = new Product();
		System.out.println("total products price:" + product3.totalprice());

	}

}
