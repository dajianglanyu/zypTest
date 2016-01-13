/**
 * All rights Reserved, Designed By Letv
 * @Title:  MyCommand.java
 * @Package com.yunpeng.test.model.command
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-18 下午5:48:58
 * @version 
 */  
package com.yunpeng.test.model.command;

import com.yunpeng.test.common.inter.Command;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-18下午5:48:58
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class MyCommand implements Command{
	
	private Receiver receiver;
	
	

	/**   
	 * @Title:  MyCommand   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param receiver  
	 * @throws   
	 */  
	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	/**   
	 * <p>Title: exe</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Command#exe()   
	 */  
	public void exe() {
		receiver.action();
		
	}
}
