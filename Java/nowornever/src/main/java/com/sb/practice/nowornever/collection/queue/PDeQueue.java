package com.sb.practice.nowornever.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PDeQueue {

    public void check() {

        Deque<Integer> deQueue = new ArrayDeque<>();
        deQueue.addFirst(2);
        deQueue.addLast(3);
        deQueue.offerFirst(1);
        deQueue.offerLast(4);
        deQueue.add(5);

        deQueue.forEach(System.out::println);

        System.out.println("Peek First: " + deQueue.peekFirst());
        System.out.println("Peek Last: " + deQueue.peekLast());
        System.out.println("Poll First: " + deQueue.pollFirst());
        System.out.println("Poll Last: " + deQueue.pollLast());
        System.out.println("Peek In General: " + deQueue.peek());


    }
}
