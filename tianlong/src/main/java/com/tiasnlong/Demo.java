package com.tiasnlong;

import java.util.HashMap;

/**
 * @Author : tianlong
 * @ClassName :Demo
 * @Date 2019/9/22
 * @Description TODO
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("哈哈哈");
        System.out.println("66666666666666666");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("张三",18);
        map.put("张三3",18);
        map.put("张三2",18);
        System.out.println(map);
        fun();
        for (int i = 0; i <10 ; i++) {
            System.out.println("哈哈哈哈");
        }
    }

    public static void fun(){
        System.out.println("777777777");
    }
}
