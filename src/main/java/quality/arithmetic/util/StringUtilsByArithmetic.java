package quality.arithmetic.util;

import java.util.List;

/**
 * @author 王诚沣
 * @上午11:45:17
 * @description	对字符串的特殊处理
 * @version
 */
public class StringUtilsByArithmetic {
	
	/**
	 * 	头部大写
	 * */
	public static String upperCaseStart(String val) {	
		char[] b = val.toCharArray(); 
		//ASCII码对转 小转大
		b[0]-=32;
		return String.valueOf(b).toLowerCase().equals(val.toLowerCase())?String.valueOf(b):val;
	}
	
	/**
	 * 	头尾部补充
	 * */
	public static String appendStrByPreAndSuf(String prefix,String str,String suffix) {
		StringBuilder builder = new StringBuilder();
		return builder.append(prefix+str+suffix).toString();
	}
	
	public static String appendStrByPreAndSuf(String prefix,List<String> str,String suffix) {
		StringBuilder builder = new StringBuilder();
		return builder.append(prefix+String.join(",", str)+suffix).toString();
	}
}
