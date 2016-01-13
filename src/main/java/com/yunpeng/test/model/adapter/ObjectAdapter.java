/**
 * All rights Reserved, Designed By Letv
 * @Title:  ObjectAdapter.java
 * @Package com.yunpeng.test.model.adapter
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-11 上午11:24:13
 * @version 
 */  
package com.yunpeng.test.model.adapter;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-11上午11:24:13
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class ObjectAdapter implements Target {
	
	private Source source;

	/**   
	 * <p>Title: method1</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.model.adapter.Target#method1()   
	 */  
	public void method1() {
		source.method1();
		
	}

	/**   
	 * <p>Title: method2</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.model.adapter.Target#method2()   
	 */  
	public void method2() {
		System.out.println("this is method2");
		
	}

	/**
	 * @return the source
	 */
	public Source getSource() {
		return this.source;
	}

	/**   
	 * @Title:  ObjectAdapter   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param source  
	 * @throws   
	 */  
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Source source) {
		this.source = source;
	}
	
	public static void main(String[] args) {
		Source source=new Source();
		Target target=new ObjectAdapter(source);
		target.method1();
		target.method2();
	}
}
