/**
 * All rights Reserved, Designed By Letv
 * @Title:  AbstractHandler.java
 * @Package com.yunpeng.test.common.responsibility
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-18 下午5:16:47
 * @version 
 */  
package com.yunpeng.test.model.responsibility;

import com.yunpeng.test.common.inter.Handler;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-18下午5:16:47
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public abstract class AbstractHandler {
	
	private Handler handler;

	/**
	 * @return the handler
	 */
	public Handler getHandler() {
		return this.handler;
	}

	/**
	 * @param handler the handler to set
	 */
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
