/**
 * All rights Reserved, Designed By Letv
 * @Title:  Decorator.java
 * @Package com.yunpeng.test.model.decorator
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 上午10:39:00
 * @version 
 */  
package com.yunpeng.test.model.decorator;

import com.yunpeng.test.common.inter.Sourceable;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13上午10:39:00
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Decorator implements Sourceable{
	
	private Sourceable source;
	
	
	/**   
	 * @Title:  Decorator   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param source  
	 * @throws   
	 */  
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}


	/**   
	 * <p>Title: method</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Sourceable#method()   
	 */  
	public void method() {
		System.out.println(" before decorator");
		source.method();
		System.out.println("after decorator");
	}
	
	public static void main(String[] args) {
		Sourceable source=new Source();
		Sourceable objSourceable=new Decorator(source);
		objSourceable.method();
	}

}
