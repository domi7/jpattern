package com.domi7.dp.strategy;

/**
 * 普通折扣
 * 
 * @author domi7
 * @since 2017年5月29日
 */
public class GeneralDiscount implements Strategy {

	public double caculate(double price) {
		// TODO Auto-generated method stub
		return price * 0.98;
	}

}
