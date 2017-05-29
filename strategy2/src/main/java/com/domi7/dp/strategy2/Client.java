package com.domi7.dp.strategy2;

/**
 * 实现客户端对不同的比较器进行灵活设置
 * 
 * @author domi7
 * @since 2017年5月29日
 */
public class Client {
	public static void main(String[] args) {
		Cat[] cats = { new Cat(2, 3), new Cat(5, 2), new Cat(4, 4), new Cat(3, 5) };
		Sorter<Cat> sorter = new BubbleSorter<Cat>();
		sorter.setComparetor(new CatByAgeComparetor());
		Cat[] sortedCats = sorter.sort(cats);

		for (Cat c : sortedCats) {
			System.out.print("按年龄排序:" + c);

		}

		sorter.setComparetor(new CatByWeightComparetor());

		Cat[] sortedWeigthCats = sorter.sort(cats);
		System.out.println();
		System.out.println("########################################################################################");

		for (Cat c : sortedWeigthCats) {
			System.out.print("按重量排序:" + c);

		}
	}
}
