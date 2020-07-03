package quality.arithmetic.match;

import quality.arithmetic.domain.TreeNode;
import quality.arithmetic.domain.match.DataValueMatch;
import quality.arithmetic.util.TreeUtil;

import java.util.List;

/**
 * @author cfwang
 * */
public class TreeUtilByMatch extends TreeUtil {

    private final static String AND = "AND";

    private final static String OR = "OR";


    /**
     *  根据DataValueMatch 生成表达式二叉树
     * */
    public static TreeNode createTreeByMatch(List<? extends DataValueMatch> t){
        if(t.size() <= 0){
            return null;
        }
        //初始化树结构
        TreeNode root = initTree(AND);
        //创建当前指针指向的TreeNode
        TreeNode currentNode;
        if(t.size() <= 1){
            //当只有一颗叶子节点
            TreeNode leftNode = new TreeNode(VALUE_TYPE_NODE,t.get(0).isMatchResult());
            root.setLeftNode(leftNode);
        }else{
            currentNode = root;
            for(int i = 0;i<t.size()-1;i++){
                currentNode.setNodeValue(RELATION_TREE_NODE,t.get(i+1).getRelation());
                currentNode.setLeftNode(new TreeNode(VALUE_TYPE_NODE,t.get(i).isMatchResult()));
                currentNode.setRightNode(new TreeNode(VALUE_TYPE_NODE,t.get(i+1).isMatchResult()));
                currentNode = currentNode.getRightNode();
            }
        }
        return root;
    }


    /**
     *  根据DataValueMatch 生成的二叉表达树 ,计算最终结果
     * */
    public static boolean computeResultByRoot(TreeNode tree){
        if(tree == null){
            return false;
        }
        if(tree.getRightNode() != null){
            boolean result = computeResultByRoot(tree.getRightNode());
            tree.getRightNode().setNodeResult(RELATION_TREE_NODE,result);
            if(!(tree.getNodeValue() instanceof String)){
                throw new ClassCastException("关系节点只支持String类型");
            }
            String relation = (String)tree.getNodeValue();
            switch (relation.toUpperCase()){
                case AND:
                    if(tree.getLeftNode().getNodeValue() instanceof Boolean){
                        if((boolean)tree.getLeftNode().getNodeValue()&&result){
                            tree.setNodeResult(RELATION_TREE_NODE,Boolean.TRUE);
                            return true;
                        }else{
                            tree.setNodeResult(RELATION_TREE_NODE,Boolean.FALSE);
                            return false;
                        }
                    }
                    break;
                case OR:
                    if(tree.getLeftNode().getNodeValue() instanceof Boolean){
                        if((boolean)tree.getLeftNode().getNodeValue()||result){
                            tree.setNodeResult(RELATION_TREE_NODE,Boolean.TRUE);
                            return true;
                        }else{
                            tree.setNodeResult(RELATION_TREE_NODE,Boolean.FALSE);
                            return false;
                        }
                    }
                    break;
            }
        }
        if(tree.getRightNode() == null){
            if(tree.getLeftNode() == null){
                return (boolean)tree.getNodeValue();
            }else{
                return (boolean)tree.getLeftNode().getNodeValue();
            }
        }
        return (boolean)tree.getNodeResult();
    }

}
