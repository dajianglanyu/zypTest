/**
 * All rights Reserved, Designed By Letv
 * @Title:  Mentento.java
 * @Package com.yunpeng.test.model.memento
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午3:26:33
 * @version 
 */  
package com.yunpeng.test.model.memento;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午3:26:33
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Mentento {
	private String value;

	/**   
	 * @Title:  Mentento   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param value  
	 * @throws   
	 */  
	public Mentento(String value) {
		super();
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}
