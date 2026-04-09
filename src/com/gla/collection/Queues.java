package com.gla.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(76);
        q.add(90);
        q.add(23);
        //56 76 90 23

        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.element());

        q.remove();
        q.poll();

        System.out.println(q);
    }
}
