package com.example.task32_queue;

public class Queue {
    int front;
    int rear;
    int[] array;
    int counter;
    int capacity;

    public Queue(int size) {
        array = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
        counter = 0;

    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    //to get from the queue
    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        front = (front + 1) % capacity;
        counter--;
    }

    public void enqueue(int number) {
        if (counter == capacity) {
            return;
        } else {
            rear = (rear + 1) % capacity;
            array[rear] = number;
            counter++;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return array[front];
    }

}
