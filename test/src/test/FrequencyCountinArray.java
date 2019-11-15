package test;

public class FrequencyCountinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="i am am in in loop";
		
	char []strchar=str.toCharArray();
	
		char ch1='a' ,ch2='o';
		
		int count0=0, count1=0;
		
	for(int i=0; i<=strchar.length-1;i++)
	{
		if(strchar[i]==ch1)
		{
			count0++;
		}
		if(strchar[i]==ch2)
		{
			count1++;
		}
			
	}
	System.out.println(ch1 +"="+ count0 +","+ ch2 +"="+count1);
		
		
	}

}
