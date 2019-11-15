package com.example.demo.Datastructure;

public class StakRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();

		st.push(6);
		st.push(10);
		System.out.println(st.peek());
		st.push(16);
		st.push(20);

		System.out.println(st.pop());
		st.show();
	}

}
