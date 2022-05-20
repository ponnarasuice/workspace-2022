package com.example.features.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    Scanner scanner  = new Scanner(System.in);
    boolean isbreakInput = false;
    System.out.println("enter 5 numbers to sort");

    for (int i =0; i<6; i++){
      list.add(scanner.nextInt());
    }

    System.out.println("given input : "+list);

    List sortedList = bubbleSort(list);

    sortedList.stream().forEach(v -> System.out.println(v));

    System.out.println("insert sort");
    List insertSortList = insertionSort(list);

    insertSortList.forEach(v-> System.out.println(v));
  }

  private static List bubbleSort(List<Integer> list) {
    for (int j=0; j<list.size()-1; j++) {
      for (int i=0; i<list.size()-1;i++) { // o(n^2)
        if(list.get(i)>list.get(i+1)) {
          int temp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, temp);
        }
      }
    }
    return list;
  }

  private static List insertionSort(List<Integer> list) {

    for(int i=0;i<list.size();i++){ // n    order - n^2 space -- same
      for(int j=0;j<list.size();j++) { //n
        if(list.get(i) > list.get(j)) {
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list;
  }
}
