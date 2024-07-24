package com.example.pr1_spring_count_view.models;

public class Counter {
    private int count;

    public Counter() {}

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }
}
