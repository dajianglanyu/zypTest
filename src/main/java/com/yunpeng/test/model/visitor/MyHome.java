/**
 * All rights Reserved, Designed By Letv
 * @Title:  MyHome.java
 * @Package com.yunpeng.test.model.visitor
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午5:22:10
 * @version 
 */  
package com.yunpeng.test.model.visitor;

import com.yunpeng.test.common.inter.Home;
import com.yunpeng.test.common.inter.Visitor;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午5:22:10
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class MyHome implements Home{

	/**   
	 * <p>Title: accept</p>   
	 * <p>Description: </p>   
	 * @param visitor   
	 * @see com.yunpeng.test.common.inter.Home#accept(com.yunpeng.test.common.inter.Visitor)   
	 */  
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**   
	 * <p>Title: getHomeAttribute</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.yunpeng.test.common.inter.Home#getHomeAttribute()   
	 */  
	public String getHomeAttribute() {
		return "Love";
	}
	
	public static void main(String[] args) {
		Visitor visitor=new MyVisitor();
		Home home=new MyHome();
		home.accept(visitor);
	}
}
