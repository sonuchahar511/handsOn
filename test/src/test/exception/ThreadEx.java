package test.exception;

public class ThreadEx {

	public static void main(String[] args) {

		ThreadExMain th = new ThreadExMain();

		th.start();
	}

}

class ThreadExMain extends Thread {

	public void run() {
		System.out.println("Inside a run method");
	}

}
