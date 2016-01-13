/**
 * All rights Reserved, Designed By Letv
 * @Title:  TreeNode.java
 * @Package com.yunpeng.test.model.composite
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 下午5:57:56
 * @version 
 */  
package com.yunpeng.test.model.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13下午5:57:56
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class TreeNode {
	
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children=new Vector<TreeNode>();
	
	public TreeNode(String name){
		this.name=name;
	}
	
	public void add(TreeNode treeNode) {
		children.add(treeNode);
	}
	
	public void remove(TreeNode treeNode) {
		children.remove(treeNode);
	}
	
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parent
	 */
	public TreeNode getParent() {
		return this.parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}
}
