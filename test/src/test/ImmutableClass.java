package test;


// immutable class 

public final class ImmutableClass {

	final Integer id;

	final String name;

	public ImmutableClass(Integer id, String name) {
		this.id = id;

		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		ImmutableClass imtClass= new ImmutableClass(1,"supriya");
		System.out.println(imtClass.name +" "+ imtClass.id);
		
	}

}
