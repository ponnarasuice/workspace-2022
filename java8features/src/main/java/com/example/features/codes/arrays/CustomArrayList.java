package com.example.features.codes.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Dynamic array
public class CustomArrayList {

    private int count=0;
    private int capacity = 5;
    private Object[] list = new Object[5];

    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.insert(5);
        arrayList.insert(15);
        arrayList.insert(52);
        arrayList.insert(15);
        arrayList.insert(35);
        arrayList.insert(65);
        arrayList.insert(53);
        arrayList.insert(54);

        System.out.println("count:" + arrayList.count + "array length:" + arrayList.list.length);

        printList(arrayList);

        deleteElement(arrayList, 35);

        System.out.println("after deletion");
        printList(arrayList);

    }

    private static void deleteElement(CustomArrayList arrayList, int in) {
        int deleteIndex =0;
        for (int i=0;i<arrayList.count;i++) {
            if (arrayList.list[i] == (Integer)in) {
                deleteIndex = i;
                break;
            }
        }

        for(int i =deleteIndex; i< arrayList.count;i++){
            arrayList.list[i] = arrayList.list[i+1];
        }
    }

    private static void printList(CustomArrayList arrayList) {
        for (int i=0; i< arrayList.count; i++) {
            System.out.println(arrayList.list[i]);
        }
    }

    private void insert(int in) {
        if (list.length == count) {
            Object[] newArr = new Object[capacity*2];

            // Iterating over new array using for loop
            for (int i = 0; i < count; i++) {
                newArr[i] = list[i];
            }
            list = newArr;
        }
        list[count++] = (Integer)in;

    }
}
