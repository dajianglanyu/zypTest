/**
 * All rights Reserved, Designed By Letv
 * @Title:  Bridge.java
 * @Package com.yunpeng.test.model.bridge
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 下午2:31:01
 * @version 
 */  
package com.yunpeng.test.model.bridge;

import com.yunpeng.test.common.inter.Sourceable;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13下午2:31:01
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public abstract class Bridge {
	private Sourceable sourceable;
	
	public void method() {
		sourceable.method();	
	}

	/**
	 * @return the sourceable
	 */
	public Sourceable getSourceable() {
		return this.sourceable;
	}

	/**
	 * @param sourceable the sourceable to set
	 */
	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
	
}
