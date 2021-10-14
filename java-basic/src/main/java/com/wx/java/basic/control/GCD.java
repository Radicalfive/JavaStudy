package com.wx.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:最大公约数记为 GCD （greatest common divisor）
 * 欧几里德算法，又称辗转相除法
 * @author wx
 * @date :2021/10/1
 */

@Slf4j
public class GCD {
    public static void main(String[] args){
        int resultByLoop = getGCDByLoop(12,36);
        log.info("12和36的最大公约数是:{}",resultByLoop);
        int resultByRecurison=getGCDByRecurison(35,21);
        log.info("35和21的最大公约数是:{}",resultByRecurison);
    }

    /**
     * 使用循环实现
     *
     * @param a 参数a
     * @param b 参数b
     * @return  a和b的最大公约数
     */
    public static int getGCDByLoop(int a , int b ){
        if (a < 0 || b < 0){
            //数学上不考虑负数的约数
            return -1;
        }
        if (b == 0){
            return a;
        }
        //辗转相除法
        while (a % b!=0){
            int temp = a%b;
            a = b ;
            b = temp;
        }
        return b;

    }
    /**
     * 使用循环实现
     *
     * @param a 参数a
     * @param b 参数b
     * @return  a和b的最大公约数
     */
    public static int getGCDByRecurison(int a, int b ){
        if(a<0||b<0){
            return  -1;

        }
        if (b==0){
            return a;

        }
        return a%b==0 ? b:getGCDByRecurison(b,a%b);
    }
}
