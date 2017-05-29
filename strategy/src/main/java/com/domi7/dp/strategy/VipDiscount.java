package com.domi7.dp.strategy;

/**
 * Vip折扣
 * 
 * @author domi7
 * @since 2017年5月29日
 */
public class VipDiscount implements Strategy {

	public double caculate(double price) {

		return price * 0.85;
	}

}
