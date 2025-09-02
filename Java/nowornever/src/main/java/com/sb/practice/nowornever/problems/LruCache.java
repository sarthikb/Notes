package com.sb.practice.nowornever.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }


    public int get(int i) {
        return super.get(i);
    }

    public void put(int i, int k) {
        super.put(i, k);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
        return size() > capacity;
    }

}
