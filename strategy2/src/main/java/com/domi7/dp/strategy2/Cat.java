package com.domi7.dp.strategy2;

public class Cat {

	private int age;
	private int weight;

	public Cat() {
	}

	public Cat(int age, int weight) {
		this.age = age;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int compareTo(Object o) {
		Cat cat = (Cat) o;
		if (this.weight > cat.getAge()) {
			return 1;
		} else if (this.weight < cat.getAge()) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weight=" + weight + "]";
	}

}
