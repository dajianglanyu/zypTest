/**
 * All rights Reserved, Designed By Letv
 * @Title:  AbstractSubject.java
 * @Package com.yunpeng.test.model.strategy
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午5:53:44
 * @version 
 */  
package com.yunpeng.test.model.observer;

import java.util.Enumeration;
import java.util.Vector;

import com.yunpeng.test.common.inter.Observer;
import com.yunpeng.test.common.inter.Subject;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午5:53:44
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public abstract class AbstractSubject implements Subject {
	
	private Vector<Observer> observers=new Vector<Observer>();//用来存储所有的观察者
	
	public void add(Observer observer) {	
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObservers() {
		Enumeration<Observer> observersEnumeration=observers.elements();
		while (observersEnumeration.hasMoreElements()) {
			observersEnumeration.nextElement().update();
		}
	}
}
