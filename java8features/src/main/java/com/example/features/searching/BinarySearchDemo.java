package com.example.features.searching;

import java.util.Scanner;

public class BinarySearchDemo {

  public static void main(String[] args) {
    int arr[] = {2,5,8,12,15};

    Scanner scanner = new Scanner(System.in);
    int tosearch = scanner.nextInt();

    

    int index = searchValue(arr, 0, arr.length, tosearch);

    if(index == -1) {
      System.out.println("not found");
    } else {
      System.out.println("found at index "+ index);
    }


  }

  private static int searchValue(int[] arr, int l, int r, int tosearch) {

    if (l<=r) {
      int m = (r+l)/2;

      if (arr[m] == tosearch) {
        return m;
      }

      if (arr[m]>tosearch) {
        return searchValue(arr, m+1, r, tosearch);
      } else {
        return searchValue(arr, l, m-1, tosearch);
      }
    }

    return -1;
  }
}
