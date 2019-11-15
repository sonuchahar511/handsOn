package test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapWithCustomClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Employee> maps = new HashMap();

		CustomeArray cust= new CustomeArray();
				
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("A");
		emp.setSalary(100.0);

		maps.put(1, emp);

		Employee emp1 = new Employee();

		emp1.setId(2);
		emp1.setName("B");
		emp1.setSalary(101.0);

		maps.put(2, emp1);

		for (Map.Entry<Integer, Employee> custom : maps.entrySet())

		{
			Integer unit = custom.getKey();

			Employee emp3 = custom.getValue();

			System.out.println(unit.intValue() + " " + emp3.getId() + " "+ emp3.getName());

		}

	}

}
