package test;

import java.io.*;
import java.util.LinkedList;

public class LinkedListImplementation {
	// TODO Auto-generated method stub

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static LinkedListImplementation Insert(LinkedListImplementation list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		}

		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;

	}

	public static void printLinkedList(LinkedListImplementation list) {

		Node currN = list.head;

		System.out.println("LinkedList :");
		while (currN.next != null) {
			System.out.println(currN.data + " ");

			currN = currN.next;

		}

	}

	public static void main(String[] args) {

		LinkedListImplementation list = new LinkedListImplementation();
		list = Insert(list, 1);
		list = Insert(list, 2);
		list = Insert(list, 3);

		printLinkedList(list);

	}

}
