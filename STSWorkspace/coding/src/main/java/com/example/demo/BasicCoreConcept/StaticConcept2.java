package com.example.demo.BasicCoreConcept;

public class StaticConcept2 {


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unknown un = new Unknown();
		/* un.i=10; */
		un.show();
		
		
	}

}
class Unknown
{
	
	public void show1()
	{
		int i=2;
		System.out.println(i);
		
	}
	
	public static void show()
	{
		 int j=10;
	System.out.println(j);
	}
}