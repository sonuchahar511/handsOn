package test.exception;

interface MultipleInterface {

	void run();

	void show();

}

// you have to override all abstract method define in interface

public class implementInterface implements MultipleInterface {

	public void run() {
		System.out.println("i am in method of run");
	}

}