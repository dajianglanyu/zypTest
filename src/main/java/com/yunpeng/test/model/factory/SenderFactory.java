/**
 * All rights Reserved, Designed By Letv
 * @Title:  SenderFactory.java
 * @Package com.yunpeng.test.model.factory
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-25 下午3:37:12
 * @version 
 */  
package com.yunpeng.test.model.factory;

import com.yunpeng.test.common.inter.Sender;

/**
 * 静态工厂方法模式
 * @author zhaoyunpeng
 * @create time:2015-11-25下午3:37:12
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class SenderFactory {
	
	public static Sender getMailSender() {
		return new MailSender();
	}
	
	public static Sender getSmsSender() {
		return new SmsSender();
	}
}
