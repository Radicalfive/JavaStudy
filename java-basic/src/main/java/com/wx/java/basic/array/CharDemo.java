package com.wx.java.basic.array;

public class CharDemo {
    public static void main (String[] args){
        char[][] a = new char[4][];
        a[0]=new char[]{'春','眠','不','觉','晓'};
        a[1]=new char[]{'春','眠','不','觉','晓'};
        a[2]=new char[]{'春','眠','不','觉','晓'};
        a[3]=new char[]{'春','眠','不','觉','晓'};
        for (int i =0;i<a.length;i++){
            for (int j=0;j<5;j++){
                System.out.println(a[i][j]);
            }
            if(i%2==0){
                System.out.println("，");
            }else{
                System.out.println("。");
            }
        }
        System.out.println("=================");
        for(int j=0;j<5;j++){
            for (int i=3;i>=0;i--){
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("。，。，");
    }
}
