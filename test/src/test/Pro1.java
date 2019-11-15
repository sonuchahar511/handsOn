package test;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	input ="a,b,c,d,e,f,g,h,i";
		output = a,b,c
				 d,e,f
				 g,h,i
		*/
		
		String s1 ="a,b,c,d,e,f,g,h,i";
		String sarr[]= s1.split(",");
		
		
		/*for(int i=0 ;i<=sarr.length;i++)
		{
			System.out.print(sarr[i]+" ");
		}*/
		
		
	
		for(int i=0;i<=sarr.length-1;i++)
		{
		
		if(i%3==0)
		{
			System.out.print("\n");
		}
		System.out.print(sarr[i]+",");
		}

	}

}
