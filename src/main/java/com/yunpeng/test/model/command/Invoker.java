/**
 * All rights Reserved, Designed By Letv
 * @Title:  Invoker.java
 * @Package com.yunpeng.test.model.command
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-18 下午5:51:04
 * @version 
 */  
package com.yunpeng.test.model.command;

import com.yunpeng.test.common.inter.Command;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-18下午5:51:04
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Invoker {
	private Command command;
	
	/**   
	 * @Title:  Invoker   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param command  
	 * @throws   
	 */  
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void action(){
		command.exe();
	}
	
	public static void main(String[] args) {
		Receiver receiver =new Receiver(); 
		Command command=new MyCommand(receiver);
		Invoker invoker=new Invoker(command);
		invoker.action();
	}
}
