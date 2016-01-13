/**
 * All rights Reserved, Designed By Letv
 * @Title:  Home.java
 * @Package com.yunpeng.test.common.inter
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-24 下午5:15:57
 * @version 
 */  
package com.yunpeng.test.common.inter;

import java.nio.channels.AcceptPendingException;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-24下午5:15:57
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public interface Home {
	void accept(Visitor visitor);
	String getHomeAttribute();
}
