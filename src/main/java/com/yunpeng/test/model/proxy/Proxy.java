/**
 * All rights Reserved, Designed By Letv
 * @Title:  Proxy.java
 * @Package com.yunpeng.test.model.proxy
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 上午11:13:01
 * @version 
 */  
package com.yunpeng.test.model.proxy;


import com.yunpeng.test.common.inter.Sourceable;

/**
 * 代理模式
 * @author zhaoyunpeng
 * @create time:2015-11-13上午11:13:01
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Proxy implements Sourceable{
	
	private Source source;
	
	

	/**   
	 * @Title:  Proxy   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:    
	 * @throws   
	 */  
	public Proxy() {
		super();
		this.source=new Source();
	}



	/**   
	 * <p>Title: method</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Sourceable#method()   
	 */  
	public void method() {
		
		Before();
		source.method();
		after();
	}



	/**
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @return: void
	 * @author:zhaoyunpeng 2015-11-13上午11:15:34
	 * @update1:updater:zhaoyunpeng updatetime:2015-11-13上午11:15:34 TODO(描述修改内容)
	 */
	private void after() {
		System.out.println("before proxy");
		
	}



	/**
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @return: void
	 * @author:zhaoyunpeng 2015-11-13上午11:15:31
	 * @update1:updater:zhaoyunpeng updatetime:2015-11-13上午11:15:31 TODO(描述修改内容)
	 */
	private void Before() {
		System.out.println("after proxy");
	}
	
	public static void main(String[] args) {
		Sourceable sourceable=new Proxy();
		sourceable.method();
	}

}
