/**
 * All rights Reserved, Designed By Letv
 * @Title:  Storage.java
 * @Package com.yunpeng.test.model.memento
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午3:32:24
 * @version 
 */  
package com.yunpeng.test.model.memento;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午3:32:24
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Storage {
	
	private Mentento mentento;

	/**   
	 * @Title:  Storage   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param mentento  
	 * @throws   
	 */  
	public Storage(Mentento mentento) {
		super();
		this.mentento = mentento;
	}

	/**
	 * @return the mentento
	 */
	public Mentento getMentento() {
		return this.mentento;
	}

	/**
	 * @param mentento the mentento to set
	 */
	public void setMentento(Mentento mentento) {
		this.mentento = mentento;
	}
	
	public static void main(String[] args) {
		Original original=new Original("egg");
		
		Storage storage=new Storage(original.createMemento());
		System.out.println("初始值是"+original.getValue());
		original.setValue("aaaa");
		System.out.println("修改后的值是"+original.getValue());
		
		original.restoreMemento(storage.getMentento());
		
		System.out.println("恢复后的值"+original.getValue());
	}
}
