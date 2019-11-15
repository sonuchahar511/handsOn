package test;

public class testData {
	
	private Integer id;
	
	private String name;

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

	//@Override
	 /* public boolean equals(Object obj) {
		
		if(obj==null)
			return false;
		
		if(obj==this)
		
			return true;
	
		  return this.getId()==((testData)obj).getId();
	    }*/

//@Override
/*public int hashCode() {
    return id;
}*/

public int compare(testData s1, testData s2)
{
	if(s1.getId().equals(s2.getId()))
	{
		return 1;
	}
	
	
	return 0;
	
}
	
	
}
