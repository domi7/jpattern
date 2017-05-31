package com.domi7.dp.strategy;

public class Client {

	public static void main(String[] args) {
		double basicPrice = 159.00;
		Discounter discounter = new Discounter();
		System.out.println("基准价：" + basicPrice + " 普通折扣价:" + discounter.discount(basicPrice));
		discounter.setStrategy(new AdvancedDiscount());
		System.out.println("基准价：" + basicPrice + " 高级折扣价:" + discounter.discount(basicPrice));
		discounter.setStrategy(new VipDiscount());
		System.out.println("基准价：" + basicPrice + " vip折扣价:" + discounter.discount(basicPrice));

	}

}
