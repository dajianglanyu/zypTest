/**
 * All rights Reserved, Designed By Letv
 * @Title:  MyVisitor.java
 * @Package com.yunpeng.test.model.visitor
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午5:19:25
 * @version 
 */  
package com.yunpeng.test.model.visitor;

import com.yunpeng.test.common.inter.Home;
import com.yunpeng.test.common.inter.Visitor;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午5:19:25
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class MyVisitor implements Visitor {

	/**   
	 * <p>Title: visite</p>   
	 * <p>Description: </p>   
	 * @param home   
	 * @see com.yunpeng.test.common.inter.Visitor#visit(com.yunpeng.test.common.inter.Home)   
	 */  
	public void visit(Home home) {
		System.out.println("visit the home :"+home.getHomeAttribute());
		
	}

}
