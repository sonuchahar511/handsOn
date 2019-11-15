package test;

public class CustomeArray {
	
	private Integer ids;

	private String email;

	private String address;

	public Integer getIds() {
		return ids;
	}

	public void setIds(Integer ids) {
		this.ids = ids;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		CustomeArray emp = (CustomeArray) obj;

		return (emp.email.equals(this.email) && emp.ids == this.ids);

	}

	
	@Override
	public int hashCode()
	{
		return ids;
	}
	
	
}
