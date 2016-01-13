/**
 * All rights Reserved, Designed By Letv
 * @Title:  Source.java
 * @Package com.yunpeng.test.model.decorator
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 上午10:37:47
 * @version 
 */  
package com.yunpeng.test.model.decorator;

import com.yunpeng.test.common.inter.Sourceable;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13上午10:37:47
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Source implements Sourceable{

	/**   
	 * <p>Title: method</p>   
	 * <p>Description: </p>      
	 * @see com.yunpeng.test.common.inter.Sourceable#method()   
	 */  
	public void method() {
		System.out.println("this is orginal method!");
		
	}

}
