/**
 * All rights Reserved, Designed By Letv
 * @Title:  Mybridge.java
 * @Package com.yunpeng.test.model.bridge
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 下午2:32:16
 * @version 
 */  
package com.yunpeng.test.model.bridge;


/**
 * @author zhaoyunpeng
 * @create time:2015-11-13下午2:32:16
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Mybridge extends Bridge {

	public void method() {
		getSourceable().method();
	}
	public static void main(String[] args) {
		Bridge bridge=new Mybridge();
		//调用第一个对象
		Sourceable1 sourceable1=new Sourceable1();
		bridge.setSourceable(sourceable1);
		bridge.method();
		
		//调用第二个对象
		Sourceable2 sourceable2=new Sourceable2();
		bridge.setSourceable(sourceable2);
		bridge.method();
	}
}
