package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class frequencycount {
	public static void main(String args[])
	{
	/*	InputStream input = new FileInputStream (new File( "C:/Users/user1/Desktop/file.pdf")); */
	 // InputStream fis=new FileInputStream(new File( "C:/Users/user1/Desktop/file.pdf"));
	 
		String s="abc abc how are you.";
		String []str =s.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String st:str)
		{
			Integer count=map.get(st);
			if(count==null)
			{
				map.put(st,1);
			}
			else
			map.put(st, count+1);
		}
		System.out.println(map);
		
	}

}
