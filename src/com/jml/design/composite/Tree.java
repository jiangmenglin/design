package com.jml.design.composite;

import java.util.Enumeration;

public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public void addNode(TreeNode node) {
        node.setParent(root);
        root.add(node);
    }

    public TreeNode getRoot() {
        return root;
    }

    public static void main(String[] args) {
        Tree root = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        root.addNode(nodeB);
        TreeNode nodeC = new TreeNode("C");
        root.addNode(nodeC);
        TreeNode nodeD = new TreeNode("D");
        nodeB.add(nodeD);
        TreeNode nodeE = new TreeNode("E");
        nodeB.add(nodeE);
        TreeNode nodeF = new TreeNode("F");
        nodeC.add(nodeF);
        System.out.println(String.format("root:{}", root.getRoot().getName()));
        Enumeration<TreeNode> rootChild = root.getRoot().getChildren();
        if (rootChild.hasMoreElements()) {
            TreeNode item = rootChild.nextElement();
            System.out.println(item.getName());
        }
    }
}
