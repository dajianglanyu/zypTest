/**
 * All rights Reserved, Designed By Letv
 * @Title:  MyHandler.java
 * @Package com.yunpeng.test.common.responsibility
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-18 下午5:19:07
 * @version 
 */  
package com.yunpeng.test.model.responsibility;

import com.yunpeng.test.common.inter.Handler;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-18下午5:19:07
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class MyHandler extends AbstractHandler implements Handler {
	
	private String name;
	/**   
	 * @Title:  MyHandler   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param name  
	 * @throws   
	 */  
	public MyHandler(String name) {
		super();
		this.name = name;
	}
	
	/**   
	 * <p>Title: operation</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Handler#operation()   
	 */  
	public void operation() {
		System.out.println(name+"deal!");
		if(null != getHandler()){
			getHandler().operation();
		}
		
	}
	
	public static void main(String[] args) {
		MyHandler h1=new MyHandler("h1");
		MyHandler h2=new MyHandler("h2");
		MyHandler h3=new MyHandler("h3");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operation();
		h2.operation();
	}

}
