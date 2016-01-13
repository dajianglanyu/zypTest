/**
 * All rights Reserved, Designed By Letv
 * @Title:  MySubject.java
 * @Package com.yunpeng.test.model.observer
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午6:09:50
 * @version 
 */  
package com.yunpeng.test.model.observer;

import com.yunpeng.test.common.inter.Observer;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午6:09:50
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class MySubject extends AbstractSubject{

	/**   
	 * <p>Title: operation</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Subject#operation()   
	 */  
	public void operation() {
		System.out.println("MySubject operation");
		notifyAllObservers();
	}
	
	public static void main(String[] args) {
		Observer observer=new Observer1();
		Observer observer1=new Observer2();
		
		MySubject mySubject =new MySubject();
		mySubject.add(observer);
		mySubject.add(observer1);
		mySubject.operation();
	}
}
