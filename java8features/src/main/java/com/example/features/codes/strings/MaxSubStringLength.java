package com.example.features.codes.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxSubStringLength {
    public static void main(String[] args) {
        int ans = lengthofMaxSubString("ffabcdefabc");
        System.out.println("max count- " + ans);
        String s1 = "cat";
        Map map = new HashMap();
        map.values().stream().filter(v->(int)v<2).count();


    }

    private static int lengthofMaxSubString(String a) {
        /* sliding 2 pointers i&j, i++ if non repeating characters occurs
        * stores in set/map if char not present if same char present again
        * remove it. count -> i-j+1. max count update with count*/
        var c = a.toCharArray();
        int i = 0,j = 0, count =0, maxcount=0;
        Set set = new HashSet();
        while(i< c.length-1) {
            if (set.add(c[i])){
                i++;
                count = i-j;
            } else {
                set.remove(c[i]);
                j++;
                count = i-j;
            }
            if (maxcount < count) {
                maxcount = count;
            }
        }
        return  maxcount;
    }
}
