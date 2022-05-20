package com.example.features.datastructure;

import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.add("poppy");
    linkedList.add("salem");
    linkedList.addLast("erode");
    linkedList.add(3, "atur");

    linkedList.set(2, "harur");
    linkedList.remove(2);
    System.out.println(linkedList.size());


    System.out.println(linkedList);




  }
}
