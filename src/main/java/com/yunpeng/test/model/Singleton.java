/**
 * All rights Reserved, Designed By Letv
 * @Title:  Singleton.java
 * @Package com.yunpeng.test.model
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-10 上午9:28:55
 * @version 
 */  
package com.yunpeng.test.model;

/**
 * 高效通用的单例模式
 * @author zhaoyunpeng
 * @create time:2015-11-10上午9:28:55
 *
 */
public class Singleton {
	
	/** 构造方法私有化，防止被实例化 */
	private Singleton(){}
	
	/** 静态工厂构建一个实例*/
	private static class SingletonFactory {
		private static Singleton instance=new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	/** 保证对象序列化先后保持一致**/
	public Object readResolve() {
		return getInstance();
	}
}

