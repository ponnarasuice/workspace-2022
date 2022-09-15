package com.example.features.codes.strings;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CharAsciiDemo {
  public static void main(String[] args) {
    String s1 = "bubbles";

    char[] charArr;
    charArr = s1.toCharArray();

    System.out.println(charArr);
    System.out.println(charArr[0]);

    int intarr[] =  new int[256];

    for (int i=0; i<s1.length();i++) {
      intarr[s1.charAt(i)] = intarr[s1.charAt(i)]+1;
    }

    var ascii= s1.getBytes(StandardCharsets.US_ASCII);

    List<Integer> intList = new ArrayList<>();
    for (byte b:ascii) {
      int asc = (int) b;
      intList.add(asc);
    }

    System.out.println(intList);

    System.out.println((char)98);
    return ;

  }
}
