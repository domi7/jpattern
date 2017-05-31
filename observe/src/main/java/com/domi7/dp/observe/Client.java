package com.domi7.dp.observe;

/**
 * 观察者模式测试类
 * 
 * @author domi7
 * @since 2017年5月31日
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标类
		ObservableTarget target = new ObservableTarget();
		// 创建观察者类
		ContentObserver observer1 = new ContentObserver("观察者1");
		ContentObserver observer2 = new ContentObserver("观察者2");
		ContentObserver observer3 = new ContentObserver("观察者3");

		// 注册观察者
		target.addObserver(observer1);
		target.addObserver(observer2);
		target.addObserver(observer3);
		// 发布内容
		target.setContent("我的地盘我做主！");
	}

}
