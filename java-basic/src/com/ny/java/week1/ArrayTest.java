package com.ny.java.week1;
impoet.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author ny
 * @Date 2020/10/5
 **/
public class ArrayTest {
    final static int MAX = 5;
    public static void main(String[] args) {
      int[] a = new int[MAX];
      Random random = new Random();
      for(int i = 0;i< MAX;i++){
          a[i] = Random.nextInt(100);
          Syatem.out.println(a[i] +"");
      }
      //1.用一次循环把最大值，最小值，和求出来；
        //2.排序
    }

}
