package com.example.demo.Datastructure;

public class Queue {

	int[] queue = new int[5];

	int rear = 0;
	int front = 0;
	int size = 0;

	public void Enqueue(int data) {

		queue[rear] = data;
		rear=(rear+1)%5;
		size++;
	}

	public int Dequeue() {
		int data = queue[front];
		front=(front+1)%5;
		size--;
		return data;

	}

	public void show() {

		System.out.println("Element:");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front+i)%5] + " ");
		}
	}

}
