package com.gla.collection;

import java.util.*;

public class HashMaps2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {5, 7, 2, 8, 1, 7, 5, 7, 9, 2};
        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        System.out.println(map);
    }
}