/**
 * All rights Reserved, Designed By Letv
 * @Title:  AbstractCalculator.java
 * @Package com.yunpeng.test.model.composite
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午5:00:36
 * @version 
 */  
package com.yunpeng.test.model.strategy;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-16下午5:00:36
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public abstract class AbstractCalculator {
	
	public int[] split(String expression, String regex) {
		int[] array=new int[2];
		String[] arrayStrings=expression.split(regex);
		array[0]=Integer.parseInt(arrayStrings[0]);
		array[1]=Integer.parseInt(arrayStrings[1]);
		return array;
	}
}
