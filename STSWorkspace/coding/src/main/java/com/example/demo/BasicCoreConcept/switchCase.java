package com.example.demo.BasicCoreConcept;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=3;
		String daytype;
		
		switch(day)
		{
		case 1:
			daytype="monday";
		
		case 3:
			daytype="tues";
		case 4:
			daytype="wedness";
		case 5:
			daytype="thurday";
			
			default:
			daytype="invalid daytype";
		}
		System.out.println(daytype);

	}

}
