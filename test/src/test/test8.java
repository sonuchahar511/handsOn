package test;

import java.io.IOException;
import java.util.Scanner;

public class test8 {
	/* public static String uncommonBetweenCommon(int[] input1,int[] input2)
	    {
		 boolean fun = false;
		 for(int i = 0; i <  input1.length; i++)
         {
             fun = false;

             for(int j = 0; j < input2.length; j++)
             {
                 if(input1[i]==input2[j])
                 {
                     fun= true;
                 }

             }
             
                return(input1[i]+" "+"$");
          
         }
         for(int i = 0; i < input2.length; i++)
         {
             fun = false;

             for(int j = 0; j < input1.length; j++)
             {
                 if(input2[i]==input1[j])
                 {
                     fun = true;
                 }
             }
             return(input2[i]+" "+"$");
         }
        } */
	
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
	       /* output = uncommonBetweenCommon(ip1,ip2);*/
	       /* System.out.println(String.valueOf(output));*/
	    }
	 
	}



