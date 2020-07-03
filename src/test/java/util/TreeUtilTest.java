package util;

import quality.arithmetic.domain.TreeNode;
import quality.arithmetic.domain.match.DataValueMatch;
import quality.arithmetic.match.TreeUtilByMatch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  cfwang
 * */
public class TreeUtilTest {

    private final static String AND = "AND";

    private final static String OR = "OR";

    public static void main(String[] args) {
        List<DataValueMatch> all = new ArrayList<>();
        DataValueMatch test1 = new DataValueMatch();
        test1.setRelation(AND);
        test1.setMatchResult(Boolean.TRUE);

        DataValueMatch test2 = new DataValueMatch();
        test2.setRelation(OR);
        test2.setMatchResult(Boolean.TRUE);

        DataValueMatch test3 = new DataValueMatch();
        test3.setRelation(AND);
        test3.setMatchResult(Boolean.FALSE);

        all.add(test1);
        all.add(test2);
        all.add(test3);

        TreeNode tree = TreeUtilByMatch.createTreeByMatch(all);
        tree.inOrderNode();
        boolean result = TreeUtilByMatch.computeResultByRoot(tree);
        System.out.println("最终结果:"+result);
    }
}
