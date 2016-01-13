/**
 * All rights Reserved, Designed By Letv
 * @Title:  Observer1.java
 * @Package com.yunpeng.test.model.observer
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午6:06:55
 * @version 
 */  
package com.yunpeng.test.model.observer;

import com.yunpeng.test.common.inter.Observer;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午6:06:55
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Observer1 implements Observer {
	
	/**   
	 * <p>Title: update</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Observer#update()   
	 */  
	public void update() {
		System.out.println("observer1 has update");
		
	}
}
