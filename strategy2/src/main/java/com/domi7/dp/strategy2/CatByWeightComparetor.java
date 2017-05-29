package com.domi7.dp.strategy2;

/**
 * 猫类按重量比较器
 * 
 * @author domi7
 * @since 2017年5月29日
 */
public class CatByWeightComparetor implements Comparetor<Cat> {

	public int compare(Cat o1, Cat o2) {
		if (o1.getWeight() > o2.getWeight()) {
			return 1;
		} else if (o1.getWeight() < o2.getWeight()) {
			return -1;
		} else {
			return 0;
		}

	}

}
