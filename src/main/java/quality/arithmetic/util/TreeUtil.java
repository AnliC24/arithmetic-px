package quality.arithmetic.util;

import quality.arithmetic.domain.TreeNode;
import quality.arithmetic.domain.match.DataValueMatch;
import java.util.List;

/**
 * @author  cfwang
 * @description 对表达式解析树的使用
 * @see 'TreeNode.class'
 * */
public class TreeUtil {

    public final static int RELATION_TREE_NODE = 0;

    public final static int VALUE_TYPE_NODE = 1;

    /**
     *  中序遍历节点
     * */
    public static void inOrder(TreeNode tree){
        if(tree != null){
            inOrder(tree.getLeftNode());
            System.out.print(tree.getNodeValue()+"->");
            inOrder(tree.getRightNode());
        }
    }

    /**
     *  先序遍历节点
     * */
    public static void preOrder(TreeNode tree){
        if(tree != null){
            System.out.print(tree.getNodeValue()+"->");
            preOrder(tree.getLeftNode());
            preOrder(tree.getRightNode());
        }
    }

    /**
     *  后序遍历节点
     * */
    public static void afterOrder(TreeNode tree){
        if(tree != null){
            afterOrder(tree.getLeftNode());
            afterOrder(tree.getRightNode());
            System.out.print(tree.getNodeValue()+"->");
        }
    }

    /**
     *  初始化树结构
     * */
    public static TreeNode initTree(Object value){
        return new TreeNode(value);
    }

    /**
     *  根据List生成树结构
     * */
    public static TreeNode createTreeByList(List t){
        if(t.size() <= 0){
            return null;
        }
        //初始化树结构
        TreeNode root = initTree(t.hashCode());
        //创建当前指针指向的TreeNode
        TreeNode currentNode;
        if(t.size() <= 1){
            //当只有一颗叶子节点
            TreeNode leftNode = new TreeNode(1,t);
            root.setLeftNode(leftNode);
        }else{
            currentNode = root;
            for(int i = 0;i<t.size()-1;i++){
                currentNode.setNodeValue(0,t.get(i+1).hashCode());
                currentNode.setLeftNode(new TreeNode(1,t.get(i)));
                currentNode.setRightNode(new TreeNode(1,t.get(i+1)));
                currentNode = currentNode.getRightNode();
            }
        }
        return root;
    }

}
