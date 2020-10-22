package com.practise.DataStructures;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

class StackGeneric<Item> {
    private int maxSize;
    private Object[] arr;
    private int top;

    public StackGeneric(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new Object[maxSize];
        this.top=-1;
    }
    private Object[] resize()
    {
        int newSize = arr.length*2;
        Object[] newArr = new Object[newSize];
        for (int i=0;i<arr.length;i++)
        {
            newArr[i] = this.arr[i];
        }
        return newArr;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return maxSize==top+1;
    }

    public void push(Item item)
    {
        if (!this.isFull())
        {
            arr[++top] = item;
        }
        else {
            this.arr = resize();
            arr[++top] = item;
        }
    }
    public Item pop()
    {
        if (isEmpty())
            throw new EmptyStackException();
        return (Item) arr[top--];
    }

}

class Stack
{
    private int size;
    private int top;
    private int[] arr;

    public Stack(int n)
    {
        this.size=n;
        this.top =-1;
        arr = new int[n];
    }
    private int[] resize()
    {
        int[] newArr = new int[arr.length*2];
        for (int i=0;i<arr.length;i++)
        {
            newArr[i] =arr[i];
        }
        return newArr;
    }

    public void push(int i)
    {
        if (!isFull())
        {
            arr[++top]=i;
        }
        else{
            this.arr=resize();
            arr[++top]=i;
        }
    }
    public int pop()
    {
        return arr[top--];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return size==top+1;
    }
}

