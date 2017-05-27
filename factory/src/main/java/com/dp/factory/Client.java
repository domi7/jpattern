package com.dp.factory;


public class Client {

	public static void main(String[] args) {
		ProductFactory p = ProductFactory.getInstance();

		ProductApi pa = p.create("pa");
		pa.print();
		ProductApi pb = p.create("pb");
		pb.print();

	}

}
