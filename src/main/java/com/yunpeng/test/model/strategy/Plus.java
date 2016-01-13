/**
 * All rights Reserved, Designed By Letv
 * @Title:  Plus.java
 * @Package com.yunpeng.test.model.strategy
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午5:08:02
 * @version 
 */  
package com.yunpeng.test.model.strategy;

import com.yunpeng.test.common.inter.Calculator;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午5:08:02
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Plus extends AbstractCalculator implements Calculator{

	/**   
	 * 多种策略的具体实现方式
	 * <p>Title: calculator</p>   
	 * <p>Description: </p>   
	 * @param expression
	 * @return   
	 * @see com.yunpeng.test.common.inter.Calculator#calculator(java.lang.String)   
	 */  
	public int calculator(String expression) {
		int[] array=split(expression, "\\+");
		return array[0]+array[1];
	}

}
