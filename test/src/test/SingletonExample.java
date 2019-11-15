package test;

public class SingletonExample {

	public static void main(String[] args) {

		Singleton sin = Singleton.getInstance();

		sin.str = (sin.str).toUpperCase();
		System.out.println(sin.str);

	}

}

class Singleton {

	private static Singleton single_in = null;

	public String str;

	private Singleton() {
		str = "Hello Singleton";
	}

	public static Singleton getInstance() {
		if (single_in == null) {
			single_in = new Singleton();
		}

		return single_in;
	}

}