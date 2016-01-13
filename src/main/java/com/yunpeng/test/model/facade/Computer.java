/**
 * All rights Reserved, Designed By Letv
 * @Title:  Computer.java
 * @Package com.yunpeng.test.model.facade
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 上午11:29:23
 * @version 
 */  
package com.yunpeng.test.model.facade;

import javax.naming.ldap.StartTlsRequest;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13上午11:29:23
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	
	
	/**   
	 * @Title:  Computer   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:    
	 * @throws   
	 */  
	public Computer() {
		super();
		this.cpu=new CPU();
		this.disk=new Disk();
		this.memory=new Memory();
	}


	public void start() {
		System.out.println("computer start");
		cpu.start();
		disk.start();
		memory.start();
	}
	
	public void shutdown() {
		System.out.println("computer shutdown");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
	}
	
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.start();
		computer.shutdown();
	}
}
