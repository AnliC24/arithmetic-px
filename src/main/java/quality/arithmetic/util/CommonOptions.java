package quality.arithmetic.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @author  cfwang
 * @description 常用方法
 * */
public class CommonOptions {

    /**
     *  map 转指定对象
     * */
    public static <T> T mapToObject(Map map, Class<T> t){
        JSONObject object = toJSONObject(map);
        return (T)JSONObject.toJavaObject(object,t);
    }

    /**
     *  javaBean 转指定对象
     * */
    public static <T> T javaBeanToObject(Object object,Class<T> t){
        JSONObject newObject = toJSONObject(object);
        return (T)JSONObject.toJavaObject(newObject,t);
    }

    /**
     *  对象转JSONObject
     * */
    public static JSONObject toJSONObject(Object object){
        String jsonStr = JSONObject.toJSONString(object);
        return JSONObject.parseObject(jsonStr);
    }

}
