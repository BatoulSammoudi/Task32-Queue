package com.example.task32_queue;

public class LinkedListQueue {
    private Node front, rear;
    private int currentSize;

    public LinkedListQueue() {
        front = null ;
        rear = null ;
        currentSize = 0 ;
    }
    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    public int dequeue()
    {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        currentSize--;
        return data;
    }

    public void enqueue(int data)
    {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty())
        {
            front = rear;
        }
        else
        {
            oldRear.next = rear;
        }
        currentSize++;
    }
}
