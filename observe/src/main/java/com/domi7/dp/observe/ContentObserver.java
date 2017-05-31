package com.domi7.dp.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * 利用JDK观察者模式实现Observer类
 * 
 * @author domi7
 * @since 2017年5月31日
 */
public class ContentObserver implements Observer {

	private String observeName;

	public ContentObserver() {
		super();
	}

	public ContentObserver(String observeName) {
		super();
		this.observeName = observeName;
	}

	public String getObserveName() {
		return observeName;
	}

	public void setObserveName(String observeName) {
		this.observeName = observeName;
	}

	public void update(Observable o, Object arg) {
		if (o instanceof ObservableTarget) {
			ObservableTarget target = (ObservableTarget) o;
			System.out.println(observeName + "收到" + target.getClass().getSimpleName() + "发布内容：" + arg);
		}

	}

}
