package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test7 {
	 public static String uncommonBetweenCommon(int[] input1,int[] input2)
	    {
		 boolean contains = false;
		    List<Integer> results = new ArrayList<Integer>();


		    for(int i=0; i< input1.length; i++) {
		        for(int j=0; j<input2.length; j++) {
		            if(input1[i]==input2[j]) {
		                contains = true;
		                break;
		            }
		        }
		        if(!contains) {
		            results.add(input1[i]);
		        }
		        else{
		        	 results.add(input2[i]);
		        }
		    }
		    String list="";
		    for(Integer st: results){
		    	list+=(list.equals("")?"":"$")+st;
		    }

		    return(list);
	    }
	
	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        String output;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip1 = new int[ip1_size];
	        int ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	            ip1[ip1_i] = ip1_item;
	        }
	        int ip2_size = 0;
	        ip2_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip2 = new int[ip2_size];
	        int ip2_item;
	        for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
	            ip2_item = Integer.parseInt(in.nextLine().trim());
	            ip2[ip2_i] = ip2_item;
	        }
	        output = uncommonBetweenCommon(ip1,ip2);
	        System.out.println(String.valueOf(output));
	    }
	 
	}


