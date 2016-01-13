/**
 * All rights Reserved, Designed By Letv
 * @Title:  Subject.java
 * @Package com.yunpeng.test.common.inter
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午5:51:39
 * @version 
 */  
package com.yunpeng.test.common.inter;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午5:51:39
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public interface Subject {
	
	/** 添加观察者 **/
	void add(Observer observer);
	
	void remove(Observer observer);
	/** 通知所有的观察者 **/
	void notifyAllObservers();
	/** 自己对应的操作 **/
	void operation();	
}
