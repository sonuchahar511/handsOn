package test;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s3="test";
		
		      String s4="test";
		// Compairing hashcode
		if(s3==s4)
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		
		//comparing content
		if(s3.equals(s4))
			
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		
		
		System.out.println("===================================================");
		
		
		
		//Using New keyword
		String s1=new String("code");
		
		String s2=new String("code");
		// Compairing hashcode
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		
		//comparing content
		if(s1.equals(s2))
			
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		//assingn value
		s1=s2;
		
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		
		System.out.println("===================================================");
		System.out.println(s1.hashCode());
		s1.concat("geek1").hashCode();
		System.out.println(s1);
		System.out.println(s1.concat("geek1"));
		System.out.println(s1.concat("geek1").hashCode());
		System.out.println(s1.hashCode());
		
		
		System.out.println("===================================================");
		//make string mutable using StringBuffer
		
		StringBuffer stb= new StringBuffer(s1);
		
		System.out.println(stb.hashCode());
		
		stb.append("geek");
		
		System.out.println(stb.hashCode());
		
		System.out.println(stb);
		

	}

}
