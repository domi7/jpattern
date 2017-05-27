package com.dp.factory.test;

import org.junit.Test;

import com.dp.factory.ProductApi;
import com.dp.factory.ProductFactory;

public class Tester {

	@Test
	public void testFactory() {
		ProductFactory p = ProductFactory.getInstance();

		ProductApi pa = p.create("pa");
		pa.print();
		ProductApi pb = p.create("pb");
		pb.print();
	}

}
