/**
 * All rights Reserved, Designed By Letv
 * @Title:  ClassAdapter.java
 * @Package com.yunpeng.test.model.adapter
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-11 上午11:19:53
 * @version 
 */  
package com.yunpeng.test.model.adapter;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-11上午11:19:53
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class ClassAdapter extends Source implements Target{

	/**   
	 * <p>Title: method2</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.model.adapter.Target#method2()   
	 */  
	public void method2() {
		System.out.println("this is method2");
		
	}
	
	public static void main(String[] args) {
		Target target=new ClassAdapter();
		target.method1();
		target.method2();
	}

}
