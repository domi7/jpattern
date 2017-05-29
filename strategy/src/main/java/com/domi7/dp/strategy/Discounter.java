package com.domi7.dp.strategy;

/**
 * 打折器类
 * 
 * @author domi7
 * @since 2017年5月29日
 */
public class Discounter {

	/* 设置默认打折策略 */
	private Strategy strategy = new GeneralDiscount();

	public double discount(double price) {

		return strategy.caculate(price);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
