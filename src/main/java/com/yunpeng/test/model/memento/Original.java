/**
 * All rights Reserved, Designed By Letv
 * @Title:  Original.java
 * @Package com.yunpeng.test.model.memento
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午3:22:37
 * @version 
 */  
package com.yunpeng.test.model.memento;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午3:22:37
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Original {
	
	private String value;

	/**   
	 * @Title:  Original   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param value  
	 * @throws   
	 */  
	public Original(String value) {
		super();
		this.value = value;
	}
	
	public Mentento createMemento() {
		return new Mentento(this.value);
	}
	
	public void restoreMemento(Mentento mentento){
		
		this.value=mentento.getValue();
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
