package com.imooc;

/**
 * Created by William on 2015/10/8.
 */
public class Test {

    public static void main(String[] args) {
        //����ģʽ
//        Singleton s1 = Singleton.instance;
//        Singleton s2 = Singleton.instance;
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();


        if (s1 == s2) {
            System.out.println("s1��s2Ϊͬһ��ʵ��");
        } else {
            System.out.println("12����һ��ʵ��");
        }

        //����ģʽ
        //Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if (s3 == s4) {
            System.out.println("s3��s4Ϊͬһ��ʵ��");
        } else {
            System.out.println("34����һ��ʵ��");
        }

    }
}
