package com.imooc;

/**
 * Created by William on 2015/10/8.
 */
public class Test {

    public static void main(String[] args) {
        //饿汉模式
//        Singleton s1 = Singleton.instance;
//        Singleton s2 = Singleton.instance;
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();


        if (s1 == s2) {
            System.out.println("s1与s2为同一个实例");
        } else {
            System.out.println("12不是一个实例");
        }

        //懒汉模式
        //Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if (s3 == s4) {
            System.out.println("s3与s4为同一个实例");
        } else {
            System.out.println("34不是一个实例");
        }

    }
}
