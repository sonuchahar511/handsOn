package test.exception;

public class RunnableExample {
	public static void main(String[] args) {
		RunExam rnE = new RunExam();
		Thread th = new Thread(rnE);

		th.start();

	}

}

class RunExam implements Runnable {
	public void run() {
		System.out.println("Inside the runnable interface");
	}
}