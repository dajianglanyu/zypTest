/**
 * All rights Reserved, Designed By Letv
 * @Title:  AbstractTarget.java
 * @Package com.yunpeng.test.model.adapter
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-11 上午11:34:59
 * @version 
 */  
package com.yunpeng.test.model.adapter;

/**
 * 抽象中间转换模型
 * @author zhaoyunpeng
 * @create time:2015-11-11上午11:34:59
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public abstract class AbstractTarget implements Target {
	 
	public void method1() {
		
	}
	
	public void method2() {
		
	}
	
	public static void main(String[] args) {
		Target target=new InterfaceAdapter1();
		target.method1();
		target.method2();
		Target target2=new InterfaceAdapter2();
		target2.method1();
		target2.method2();
	}
}
