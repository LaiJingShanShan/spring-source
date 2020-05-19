package com.shan.spring.source.base.map;

import org.junit.Test;

import java.util.HashMap;

public class MapTest {

    @Test
    public void hashMapTest () {
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        String put = objectObjectHashMap.put("123", "7987");



        // 左边移动就是乘法， 右边移动就是除法
        System.out.println(160 >>> 16);
        System.out.println(16 >>> 16);
        System.out.println(hash(160));
        System.out.println(hash(161));
        System.out.println(hash(64));
        System.out.println(hash(63));
        System.out.println(hash(16));
    }

    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
