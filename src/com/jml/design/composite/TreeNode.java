package com.jml.design.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(TreeNode node) {
        this.parent = node;
    }

    public TreeNode getParent() {
        return this.parent;
    }

    //添加子节点
    public void add(TreeNode node) {
        node.setParent(this);
        children.add(node);
    }

    //删除子节点
    public void remove(TreeNode node) {
        children.remove(node);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }
}
