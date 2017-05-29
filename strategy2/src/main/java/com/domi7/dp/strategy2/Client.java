package com.domi7.dp.strategy2;

public class Client {
	public static void main(String[] args) {
		Cat[] cats = { new Cat(2, 2), new Cat(5, 5), new Cat(4, 4), new Cat(3, 3) };
		Sorter<Cat> sorter = new BubbleSorter<Cat>(new CatComparetor());

		Cat[] sortedCats = sorter.sort(cats);

		for (Cat c : sortedCats) {
			System.out.print(c);

		}
	}
}
