package com.domi7.dp.observe;

import java.util.Observable;

/**
 * 利用JDK观察者模式实现Observable类
 * 
 * @author domi7
 * @since 2017年5月31日
 */
public class ObservableTarget extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {

		this.content = content;
		this.setChanged();
		this.notifyObservers(content);
	}

}
