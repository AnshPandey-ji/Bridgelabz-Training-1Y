package com.gla.collection;

import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Sarthak", 99);
        map.put("Satyam", 95);
        map.put("Ashish", 97);
        map.put("Ansh", 98);
        map.put("Sarthak", 100);

        System.out.println(map);
        System.out.println(map.get("Sarthak"));
        System.out.println(map.containsKey("Ansh"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        for (String key : map.keySet()) {
            System.out.println(map.get(key)+" ");
        }
    }
}