package test;

public class Employee {

	private Integer id;

	private String name;

	private Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Employee emp = (Employee) obj;

		return (emp.name.equals(this.name) && emp.id == this.id);

	}

	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	
	
}
