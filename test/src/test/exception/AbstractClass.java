package test.exception;

abstract class AbstractClass {

	abstract void show();

	abstract void show1();

	void run() {
		System.out.println("hello");
	}

}

class abstractive extends AbstractClass {

	void show() {
		System.out.println("Hello i am in abstract method");
	}

}

class mainMethod {
	public static void main(String[] args) {

		AbstractClass ab = new abstractive();
		ab.show();

	}
}