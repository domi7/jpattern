package com.dp.factory;

import java.io.IOException;
import java.util.Properties;

/**
 * 简单工厂类
 * 
 * @author domi7
 * @since 2017年5月31日
 */
public class ProductFactory {

	private static final Properties prop = new Properties();

	private static class ProductFactoryHold {
		private static final ProductFactory INSTANCE = new ProductFactory();
	}

	public static ProductFactory getInstance() {
		return ProductFactoryHold.INSTANCE;
	}

	private ProductFactory() {

		try {

			prop.load(ProductFactory.class.getResourceAsStream("/factory.properties"));

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
