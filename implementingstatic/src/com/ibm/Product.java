package com.ibm;

public class Product {
	private String productId;
	private String productName;
	private static Double productPrice;
	private static Integer noOfProduct;
	private static double tprice = 0;

	static {
		noOfProduct = 0;
	}

	public void createProduct(String id, String name, Double price) {
		noOfProduct++;
		productId = id;
		productName = name;
		productPrice = price;
	}

	public static Double getProductPrice() {
		return productPrice;
	}

	public static Integer getNumberOfProduct() {
		return noOfProduct;
	}

	public static double discount() {

		double discountval = (2 * productPrice) / 100;
		double total = productPrice - discountval;
		tprice = tprice + total;

		return total;

	}

	public double totalprice() {

		return tprice;

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}
