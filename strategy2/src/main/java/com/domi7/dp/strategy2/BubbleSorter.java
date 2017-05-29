package com.domi7.dp.strategy2;

/**
 * 冒泡排序
 * 
 * @author domi7
 * @since 2017年5月29日
 * @param <T>
 */
public class BubbleSorter<T> implements Sorter<T> {

	private Comparetor<T> comparetor;

	public BubbleSorter() {
	}

	public BubbleSorter(Comparetor<T> c) {
		this.comparetor = c;
	}

	public Comparetor<T> getComparetor() {
		return comparetor;
	}

	public void setComparetor(Comparetor<T> comparetor) {
		this.comparetor = comparetor;
	}

	public T[] sort(T[] arrays) {

		if (null == comparetor)
			throw new RuntimeException("未设置比较器");

		int len = arrays.length;
		for (int i = len; i > 0; i--) {
			for (int j = 0; j < len - 1; j++) {

				if (comparetor.compare(arrays[j], arrays[j + 1]) > 0) {
					swape(arrays, j, j + 1);
				}

			}

		}

		return arrays;
	}

	private void swape(T[] arrays, int index1, int index2) {

		T temp = arrays[index1];
		arrays[index1] = arrays[index2];
		arrays[index2] = temp;

	}

}
