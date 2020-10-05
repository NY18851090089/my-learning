package com.ny.java.week1;

/**
 * @ClassName Factorial
 * @Description TODO
 * @Author ny
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        //定义一个整型变量
        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(n + "n的阶乘是：" + result);
    }
    /**
     * hello方法
     * @param input
     * @return String
     */
// public  String void hello(String input){

 //}
}
