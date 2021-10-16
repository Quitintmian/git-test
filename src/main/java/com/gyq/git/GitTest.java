package com.gyq.git;

import java.util.HashMap;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello github!");
        System.out.println("hello git 3!");

        System.out.println("测试pull test");
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");

        System.out.println(map.get(1));
    }
}
