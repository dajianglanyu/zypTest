/**
 * All rights Reserved, Designed By Letv
 * @Title:  MailSender.java
 * @Package com.yunpeng.test.model.factory
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-25 下午3:35:21
 * @version 
 */  
package com.yunpeng.test.model.factory;

import com.yunpeng.test.common.inter.Sender;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-25下午3:35:21
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class SmsSender implements Sender{

	/**   
	 * <p>Title: send</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Sender#send()   
	 */  
	public void send() {
		System.out.println("this is smsSender");
		
	}

	

}
