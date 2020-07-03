package quality.arithmetic.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cfwang
 * @description 表达式解析树
 * T 值域节点类型
 * K 关系节点类型
 * Z 对象节点类型
 * 表达式 T K T K T K T
 * 布尔表达式 true and/or false and/or false and/or true
 * 算法表达式 1 +，-，*，/ 1
 * .......
 * */
public class TreeNode<T,K> {

    /**
     *  节点类型
     *  0 关系节点
     *  1 值域节点
     * */
    private int nodeType;

    /**
     *  节点存放值
     * */
    private T nodeValue;

    /**
     *  左节点引用
     * */
    private TreeNode leftNode;

    /**
     *  右节点引用
     * */
    private TreeNode rightNode;

    /**
     *  当前最终结果
     * */
    private T nodeResult;

    public TreeNode(){}

    public TreeNode(T value){
        this.nodeType = 0;
        this.nodeValue = value;
    }

    public TreeNode(int type,T value){
        this.nodeType = type;
        this.nodeValue = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void setNodeValue(int type,T value){
        this.nodeType = type;
        this.nodeValue = value;
    }

    public void setNodeResult(int type,T value){
        this.nodeType = type;
        this.nodeResult = value;
    }

    public T getNodeValue() {
        return nodeValue;
    }

    public T getNodeResult() {
        return nodeResult;
    }

    /**
     *  先序遍历
     * */
    public void preOrderNode(){
        List<String> expression = new ArrayList<>();
        if(this != null){
            expression.add(this.nodeValue.toString());
            if(this.leftNode != null){
                this.leftNode.preOrderNode();
            }
            if(this.rightNode != null){
                this.rightNode.preOrderNode();
            }
        }
        System.out.println(String.join("->",expression));
    }

    /**
     *  中序遍历
     * */
    public void inOrderNode(){
        List<String> expression = new ArrayList<>();
        if(this != null){
            if(this.leftNode != null){
                this.leftNode.inOrderNode();
            }
            expression.add(this.nodeValue.toString());
            if(this.rightNode != null){
                this.rightNode.inOrderNode();
            }
        }
        System.out.println(String.join("->",expression));
    }

    /**
     *  后序遍历
     * */
    public void afterOrderNode(){
        List<String> expression = new ArrayList<>();
        if(this != null){
            if(this.leftNode != null){
                this.leftNode.afterOrderNode();
            }
            if(this.rightNode != null){
                this.rightNode.afterOrderNode();
            }
            expression.add(this.nodeValue.toString());
        }
        System.out.println(String.join("->",expression));
    }
}
