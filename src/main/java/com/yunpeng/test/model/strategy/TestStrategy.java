/**
 * All rights Reserved, Designed By Letv
 * @Title:  TestStrategy.java
 * @Package com.yunpeng.test.model.strategy
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-16 下午5:12:42
 * @version 
 */  
package com.yunpeng.test.model.strategy;

import com.yunpeng.test.common.inter.Calculator;

/**
 * 策略模式的测试
 * @author zhaoyunpeng
 * @create time:2015-11-16下午5:12:42
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class TestStrategy {
	public static void main(String[] args) {
		Calculator calculator=new Plus();
		int result = calculator.calculator("6+8");
		System.out.println(result);
		calculator=new Multiple();
		result=calculator.calculator("6*8");
		System.out.println(result);
	}
}
