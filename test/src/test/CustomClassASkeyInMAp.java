package test;

import java.util.HashMap;

public class CustomClassASkeyInMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 HashMap<Employee, String> map = new HashMap<Employee, String>();
			Employee emp = new Employee();
			emp.setId(1);
			emp.setName("A");
			emp.setSalary(100.0);

			map.put(emp,"first");

			Employee emp1 = new Employee();

			emp1.setId(2);
			emp1.setName("B");
			emp1.setSalary(101.0);

			map.put(emp1,emp1.getName());
			
			System.out.println(map.get(emp1));
			
	}

}
