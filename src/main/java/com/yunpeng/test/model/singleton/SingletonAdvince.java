/**
 * All rights Reserved, Designed By Letv
 * @Title:  SingletonAdvince.java
 * @Package com.yunpeng.test.model
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-25 下午3:17:33
 * @version 
 */  
package com.yunpeng.test.model.singleton;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-25下午3:17:33
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class SingletonAdvince {

	private static  SingletonAdvince instance;
	
	/** 构造方法私有化 **/
	private SingletonAdvince() {
		
	}
	/** 高效且线程安全的单例模式 **/
	public SingletonAdvince getInstance() {
		if(null==instance){
			synchronized (SingletonAdvince.this) {
				if (null == instance) {
					instance=new SingletonAdvince();
				}
			}
		}
		return instance;
	}
}
