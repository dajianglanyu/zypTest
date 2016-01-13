/**
 * All rights Reserved, Designed By Letv
 * @Title:  Sourceable1.java
 * @Package com.yunpeng.test.model.proxy
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 下午2:28:28
 * @version 
 */  
package com.yunpeng.test.model.bridge;

import com.yunpeng.test.common.inter.Sourceable;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13下午2:28:28
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Sourceable1 implements Sourceable{

	/**   
	 * <p>Title: method</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Sourceable#method()   
	 */  
	public void method() {
		System.out.println("this is sourceable1");
		
	}

}
