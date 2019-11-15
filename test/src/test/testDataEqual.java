package test;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class testDataEqual {
	
	
	
	public static void main(String arg[])
	{
		testData test1= new testData();
		test1.setId(1);
		test1.setName("ABC");
		
		testData test2= new testData();
		test2.setId(1);
		test2.setName("ABC");
		
		System.out.println(test1.hashCode());
		
		System.out.println(test2.hashCode());
		
		System.out.println(test1.equals(test2));
		
	/*	System.out.println(INSTANCEOF);*/
		
		
	}

}
