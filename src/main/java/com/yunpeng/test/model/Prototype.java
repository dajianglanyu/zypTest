/**
 * All rights Reserved, Designed By Letv
 * @Title:  Prototype.java
 * @Package com.yunpeng.test.model
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-10 下午5:15:26
 * @version 
 */  
package com.yunpeng.test.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 简单的原型模型
 * @author zhaoyunpeng
 * @create time:2015-11-10下午5:15:26
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Prototype implements Cloneable,Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -5599776428140252590L;

	private String string;
	
	private SerializableObj obj;
	
	/**
	 * 浅层次的复制
	 * <p>Title: clone</p>   
	 * <p>Description: </p>   
	 * @return
	 * @throws CloneNotSupportedException   
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype=(Prototype)super.clone();
		return prototype;
	}
	
	/**
	 *深层次的复制 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @return: Object
	 * @author:zhaoyunpeng 2015-11-10下午5:32:07
	 * @update1:updater:zhaoyunpeng updatetime:2015-11-10下午5:32:07 TODO(描述修改内容)
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		/** 将当前对象写入到二进制流*/
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		/** 将对象从二进制流中读取 */
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject();
	}
	
	/**
	 * @return the string
	 */
	public String getString() {
		return this.string;
	}

	/**
	 * @param string the string to set
	 */
	public void setString(String string) {
		this.string = string;
	}

	/**
	 * @return the obj
	 */
	public SerializableObj getObj() {
		return this.obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(SerializableObj obj) {
		this.obj = obj;
	}

	class SerializableObj implements Serializable{

		private static final long serialVersionUID = 1L;
		
	}
}
