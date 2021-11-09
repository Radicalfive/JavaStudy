package com.wx.java.basic.reflection;

import io.vavr.collection.Map;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author : radical
 * @description :通过反射获取泛型信息
 * @data : 2021/11/9
 **/
@Slf4j
public class ReflectDemo2 {
    public void method1(Map<String , User> map , List<User> list) {
        log.info("method1");
    }
    public Map<String , User> method2() {
        log.info("method");
        return null;
    }

    public static void main(String[] args) throws Exception{
        //通过反射获取方法参数信息
        Method method = ReflectDemo2.class.getMethod("method1", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            log.info("泛型参数类型:{}" , genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType)
                        genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    log.info("实际类型：{}", actualTypeArgument);
                }
            }
        }
        //通过反射获取方法返回值信息
        method = ReflectDemo2.class.getMethod("method2" , null);
        Type genericReturnType = method.getGenericReturnType();
        if (genericReturnType instanceof  ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType)genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                log.info("实际参数类型{}" , actualTypeArgument);
            }
        }
    }
}
