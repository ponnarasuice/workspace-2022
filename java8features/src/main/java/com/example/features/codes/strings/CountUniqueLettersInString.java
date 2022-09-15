package com.example.features.codes.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountUniqueLettersInString {
  public static void main(String[] args) {
    String input = "bubble is blast";

    count_unique_letters(input);

    count_unique_letters_java8(input);


  }

  private static void count_unique_letters_java8(String input) {
//    convert map using streams
    char[] arr;
    arr = input.toCharArray();

    Map map = input.chars().mapToObj(c->
            (char)c).collect(Collectors.groupingBy(c->c
                    , Collectors.counting()));
    System.out.println("****************");
    map.forEach((k,v)-> System.out.println("key:"+k+"value:"+v));
  }

  private static void count_unique_letters(String input) {

    var inputArr = input.toCharArray();
    int size = 1;

    Map<Character, Integer> map = new HashMap();
    for (char val: inputArr) {
      if (map.containsKey(val)) {
        var sizeval = (Integer)map.get(val) ;
        var ddd =sizeval+1;
        map.put(val, ddd);
      }else {
        map.put(val, size);
      }

    }

    System.out.println(map);

    map.forEach((k,v) -> {
      System.out.println("key:" +k + "   val:" +v);
    });


    for (Map.Entry<Character, Integer> e : map.entrySet()) {
      if (e.getValue()>1) {
        System.out.println(e);
      }
    }

    var sss= map.entrySet().stream()
            .filter(c->c.getValue()>1).collect(Collectors.toSet());
    System.out.println(sss);

    // another way
    char[] chars1 = input.toCharArray();

  }
}
