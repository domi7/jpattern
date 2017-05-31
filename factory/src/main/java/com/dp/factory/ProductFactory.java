package com.dp.factory;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductFactory {

	private static final Lock lock = new ReentrantLock();
	private static final Properties prop = new Properties();

	private static class ProductFactoryHold {
		private static final ProductFactory INSTANCE = new ProductFactory();
	}

	public static ProductFactory getInstance() {
		return ProductFactoryHold.INSTANCE;
	}

	private ProductFactory() {

		try {

			lock.lock();
			prop.load(ProductFactory.class
					.getResourceAsStream("/factory.properties"));
			lock.unlock();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String getProductClass(String procductName) {
		return prop.getProperty(procductName);

	}

	public ProductApi create(String procductName) {
		ProductApi productApi = null;
		try {
			Class<?> clazz = Class.forName(getProductClass(procductName));
			productApi = (ProductApi) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return productApi;
	}
}
