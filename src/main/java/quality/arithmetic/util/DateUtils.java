package quality.arithmetic.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author 王诚沣
 * @上午11:29:55
 * @description
 * @version
 */
public class DateUtils {
	
	public DateUtils() {
		throw new AssertionError("工具类,无需实例化");
	}
	
	public static String dateFormat(long time) {
		Date date = new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		date.setTime(time);
		return sdt.format(date);
	} 
	
	public static String dateFormat(String time,String formatter) throws ParseException {
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdt.parse(time); 		
		return sdt.format(date);
	} 
	
	
	public static Date stringToDate(String time) throws ParseException {
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdt.parse(time); 
	}
	
	/**
	 * 	特殊时间 格式 转换  2020-03-04T05:12:06.000+0000
	 * */
	public static String dealDateFormat(String oldDate) {
        Date date1 = null;
        DateFormat df2 = null;
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date date = df.parse(oldDate);
            SimpleDateFormat df1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
            date1 = df1.parse(date.toString());
            df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return df2.format(date1);
    }
	
	public static Timestamp StringChangeToTimestamp(String time) {
		return Timestamp.valueOf(time);   
	}
	
	public static String dateChangeToString(Date date) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 
		return sdf.format(date); 
	}
	
	public static String stringChangeToTimestamp(Timestamp time) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
	}
	
	/**
	 * 	Double 转 String
	 * */
	public static String doubleToString(Double d) {
		BigDecimal b = new BigDecimal(d);
		String str = String.valueOf(b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		return str;
	}
}
