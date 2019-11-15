package test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryandMap {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
    /*        
        String [] str= str.split("\\s+");*/
            
           map.put(name, phone) ;
            
            // Write code here
        }
        
        
        while(in.hasNext()){
            String s = in.next();
            
            System.out.println(s);
            // Write code here
        }
        in.close();
        
	}

}
