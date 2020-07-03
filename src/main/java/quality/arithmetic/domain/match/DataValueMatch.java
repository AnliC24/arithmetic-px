package quality.arithmetic.domain.match;

/**
 * @author cfwang
 * @description 数值格式 规则类
 * */
public class DataValueMatch {

    /**
     *  规则直接的关系
     *  and/or
     * */
    private String relation;

    /**
     *  偏移起始位
     * */
    private int startOffset;

    /**
     *  偏移终止位
     * */
    private int endOffset;

    /**
     *  正则类型
     *  系统/自定义
     * */
    private String regxType;

    /**
     *  正则表达式
     * */
    private String regx;

    /**
     *  匹配结果
     * */
    private boolean matchResult;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(int startOffset) {
        this.startOffset = startOffset;
    }

    public int getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(int endOffset) {
        this.endOffset = endOffset;
    }

    public String getRegxType() {
        return regxType;
    }

    public void setRegxType(String regxType) {
        this.regxType = regxType;
    }

    public String getRegx() {
        return regx;
    }

    public void setRegx(String regx) {
        this.regx = regx;
    }

    public boolean isMatchResult() {
        return matchResult;
    }

    public void setMatchResult(boolean matchResult) {
        this.matchResult = matchResult;
    }
}
