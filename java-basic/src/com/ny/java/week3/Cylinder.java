package com.ny.java.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author ny
 * @Date 2020/10/19
 **/
public class Cylinder  extends Circle{
    private  int h;

    public Cylinder (int x,int y,int r,int h){
        super(x,y,r);
        this .h = h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆柱体带体积："+super .getArea());
    }
}
