package com.practise.DataStructures;

public class MainQueue
{
    public static void main(String[] args) {
        //Implementing int Queue
        Queue queue=new Queue(3);
        int i=1;
        while (!queue.isFull())
        {
            queue.enqueue(i);
            i++;
        }
        while (!queue.isEmpty())
        {
            System.out.print(queue.dequeue()+" ");
        }
        System.out.println();

        //Implementing GenericQueue
        QueueGeneric<String> queueGeneric = new QueueGeneric<>(2);
        queueGeneric.enqueue("akdb");
        queueGeneric.enqueue("uidsg");
        queueGeneric.enqueue("sdfsds");

        while (!queueGeneric.isEmpty())
            System.out.print(queueGeneric.dequeue()+" ");

    }
}
