package test;

public class DoubleCheckLockingInSigleton {

	public static void main(String[] args) {

		DoubleCheck dbc = DoubleCheck.getInstance();

		System.out.println(dbc.str);

	}

}

class DoubleCheck {

	private volatile static DoubleCheck check = null;

	String str = "I am from double check singleton Class";

	private String s;

	private DoubleCheck() {
		s = str;
	}

	public static DoubleCheck getInstance() {
		if (check == null)

			synchronized (DoubleCheck.class) {
				if (check == null) {
					check = new DoubleCheck();
				}
			}

		return check;

	}

}