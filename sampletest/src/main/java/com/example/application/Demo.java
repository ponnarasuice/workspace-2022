package com.example.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    for (int i=0; i<5; i++) {
      list.add(scanner.nextInt());

    }

    Integer[] array;
    array = (Integer[]) list.toArray();

    var arrayList = sortInteger(array);

    System.out.println(arrayList);
  }

  private static Integer[] sortInteger(Integer[] array) {

    for (int i=0; i<array.length; i++) {
      for (int j=0; j<array.length-1; j++) {
        if (array[j] > array[j + 1]) {
          var temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;
        }
      }
    }

    return array;
  }
}
