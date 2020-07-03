package quality.arithmetic.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 *  Json 常用操作
 * */
public class JsonMapper {

    /**
     *  map 转 指定javaBean对象
     * */
    public static <T> T MapToJavaBean(Map map,Class<T> t){
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
