package com.sb.practice.nowornever.collection.queue;


import com.sb.practice.nowornever.models.User;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//priority Queue
public class Pqueue {
    
    public void check() {
        Queue<Integer> minPQueue = new PriorityQueue<>();

        minPQueue.add(1);
        minPQueue.offer(25);
        minPQueue.add(5);
        minPQueue.add(0);

        minPQueue.forEach(System.out::println);

        Queue<Integer> maxPQueue = new PriorityQueue<>(Collections.reverseOrder());

        maxPQueue.add(1);
        maxPQueue.offer(25);
        maxPQueue.add(5);
        maxPQueue.add(0);

        maxPQueue.forEach(System.out::println);

        System.out.println("Min Priority Queue: " + minPQueue.peek());
        System.out.println("Max Priority Queue: " + maxPQueue.peek());

        Queue<User> userQueue = new PriorityQueue<>();
        userQueue.add(new User(25, "A"));
        userQueue.add(new User(2, "B"));
        userQueue.add(new User(0, "C"));
        while(!userQueue.isEmpty()) {
            System.out.println(userQueue.poll().getName());
        }

        Comparator<User> userComparator = Comparator.comparingInt(User::getAge);

        Queue<User> userQueue1 = new PriorityQueue<>(userComparator);
        userQueue1.add(new User(25, "A"));
        userQueue1.add(new User(2, "B"));
        userQueue1.add(new User(0, "C"));
        while(!userQueue1.isEmpty()) {
            System.out.println(userQueue1.poll().getName());
        }
    }


}
