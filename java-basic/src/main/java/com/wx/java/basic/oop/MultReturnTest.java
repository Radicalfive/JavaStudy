package com.wx.java.basic.oop;

import io.vavr.Tuple;
import io.vavr.Tuple3;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.javatuples.Triplet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * @ description: 方法返回多个结果
 * 用可变长参数传入多个整数，同时返回最大值和最小值、求和等结果
 * @ author radical
 * @ date 2021/10/14
 */
@Slf4j
public class MultReturnTest {
    public static void main(String[] args) {
        int[] resultArr = multReturnMethod1(4,3,5);
        log.info(Arrays.toString(resultArr));
        log.info("*********************************************");
        Map<String , Integer> resultMap = multReturnMethod2(4,3,5);
        log.info(String.valueOf(resultMap));
        log.info("*********************************************");
        ReturnObject resultObject = multReturnMethod3(4,3,5);
        log.info(resultObject.toString());
        log.info("*********************************************");
        Tuple tuple3 = multReturnMethod4(4,3,5);
        log.info(String.valueOf(tuple3));
        log.info("*********************************************");
        Triplet<Integer , Integer , Integer> triplet = multReturnMethod5(4,3,5);
        log.info(String.valueOf(triplet));
    }
    /**
     * 可变长参数 + 整型数组返回
     *
     * @ param args 可变长参数
     * @ return int[]
     */
    public static int[] multReturnMethod1(int... args){
        int[] arr = new int[3];
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        arr[0] = max.getAsInt();
        arr[1] = min.getAsInt();
        arr[2] = sum;
        return arr;
    }
    /**
     * @param args 可变长参数
     * @return Map
     */

    public static Map<String , Integer> multReturnMethod2(int... args){
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        //初始化集合建议最好指定大小
        Map<String, Integer>Map = new HashMap<>(4);
        Map.put("max" , max.getAsInt());
        Map.put("max" , min.getAsInt());
        Map.put("sum" , sum);
        return Map;
    }
    /**
     * @param args 可变长参数
     * @return 封装的结果对象
     */
    public static ReturnObject multReturnMethod3(int... args){
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return new ReturnObject(max.getAsInt(), min.getAsInt(), sum);
    }

    /**
     * @param args 可变长参数
     * @return Tuple3
     * 使用Tuple需要添加依赖
     */
    public static Tuple3<Integer , Integer , Integer> multReturnMethod4(int... args){
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return Tuple.of(max.getAsInt(), min.getAsInt(),sum);
    }

    /**
     * @param args 可变长参数
     * @return Triplet
     * 需要添加依赖
     */
    public static Triplet<Integer , Integer , Integer> multReturnMethod5(int... args){
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return new Triplet<Integer , Integer , Integer>(max.getAsInt(), min.getAsInt(), sum);
    }
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class ReturnObject {
        private Integer max;
        private Integer min;
        private Integer sum;

        @Override
        public String toString(){
            return "{" +
                    "max=" + max +
                    ", min=" +min +
                    ", sum=" +sum +
                    '}';

        }
    }

}
