package com.example.features.algorithms;

public class RecursiveDemo_fibonacci {
  public static void main(String[] args) {
    int num = 5;
    // [0,1,2,3,4,5,6,]
    // 0 1 1 2 3 5 8 ...
    for (int i=0; i<num; i++) {
      System.out.print(fib(i) + " ");
    }
  }

  static int fib(int n)
  {
    // Stop condition
    if (n == 0)
      return 0;

    // Stop condition
    if (n == 1 || n == 2)
      return 1;

      // Recursion function
    else
      return (fib(n - 1) + fib(n - 2));
  }


}
