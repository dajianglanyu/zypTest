/**
 * All rights Reserved, Designed By Letv
 * @Title:  TestFactory.java
 * @Package com.yunpeng.test.model.factory
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-25 下午3:46:08
 * @version 
 */  
package com.yunpeng.test.model.factory;

import com.yunpeng.test.common.inter.Sender;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-25下午3:46:08
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class TestFactory {

	/**
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return: void
	 * @author:zhaoyunpeng 2015-11-25下午3:46:08
	 * @update1:updater:zhaoyunpeng updatetime:2015-11-25下午3:46:08 TODO(描述修改内容)
	 */
	public static void main(String[] args) {
		Sender sender=SenderFactory.getMailSender();
		sender.send();

	}

}
