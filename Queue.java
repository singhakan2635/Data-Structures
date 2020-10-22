package com.practise.DataStructures;

class QueueGeneric<Item>
{
    private Object[] arr;
    private int front;
    private int rear;
    private int size;
    private int len;

    public QueueGeneric(int size) {
        arr = new Object[size];
        this.size = size;
    }
    private Object[] resize()
    {
        Object[] newArr = new Object[arr.length*2];
        for (int i=0;i<arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public boolean isEmpty()
    {
        return len==0;
    }
    public boolean isFull()
    {
        return len==size;
    }
    public void enqueue(Item i)
    {
        if (!isFull())
        {
            len++;
            arr[++rear%size] = i; // rear = (rear+1)%size
        }
        else
        {
            this.arr = resize();
            len++;
            arr[++rear%size] =i;
        }
             //Either we can call overflow or we use resize function to extend the queue to twice its size
    }
    public Item dequeue()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow");
        }

        len--;
        return (Item) arr[front++%size];
    }
    public Item peek()
    {
        if (isEmpty()){
            System.out.println("UnderFlow");
        }
        return (Item) arr[front];
    }
}

class Queue
{
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int len;

    public Queue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = 0;
        this.rear=-1;
        this.len = 0;
    }
    private int[] resize()
    {
        int[] newArr = new int[arr.length*2];
        for (int i=0;i<arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public boolean isEmpty()
    {
        return len==0;
    }
    public boolean isFull()
    {
        return len==size;
    }
    public void enqueue(int i)
    {
        if (!isFull())
        {
            len++;
            arr[++rear%size] = i; // rear = (rear+1)%size
        }
        else
            System.out.println("OverFlow"); //Either we can call overflow or we use resize function to extend the queue to twice its size
    }
    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow");
        }

        len--;
        return arr[front++%size];
    }
    public int peek()
    {
        if (isEmpty()){
            System.out.println("UnderFlow");
        }
        return arr[front];
    }
}
