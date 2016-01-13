/**
 * All rights Reserved, Designed By Letv
 * @Title:  Tree.java
 * @Package com.yunpeng.test.model.composite
 * @Description:	TODO(用一句话描述该文件做什么)   
 * @author: zhaoyunpeng
 * @date:   2015-11-13 下午6:04:30
 * @version 
 */  
package com.yunpeng.test.model.composite;

/**
 * @author zhaoyunpeng
 * @create time:2015-11-13下午6:04:30
 * @Description:TODO(这里用一句话描述这个类的作用)
 *
 */
public class Tree {
	TreeNode root=null;
	
	public Tree(String name){
		root=new TreeNode(name);
	}
	
	public static void main(String[] args) {
		
		Tree tree= new Tree("A");
		TreeNode treeNodeB=new TreeNode("B");
		TreeNode treeNodeC=new TreeNode("C");
		treeNodeB.add(treeNodeC);
		tree.root.add(treeNodeB);
		
		System.out.println("build tree finished!");
	}
}
