package com.zyt.javacode.demo;

import java.util.ArrayList;
import java.util.Collections;  // 导入Collections类

public class ListSortTest {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // myNumbers数组排序

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
