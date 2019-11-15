package com.example.demo.CodeByte;

import java.util.Scanner;

class LetterCapitalize {

  public static String LetterCapitalize(String str) {
    // code goes here  
	  
	  String str1="";
	  String strarr[] = str.split("_");
	  
	  for(int i=0 ; i<strarr.length;i++)
	  {
		  
		  
		  str1=str1+" "+strarr[i].replace(strarr[i].charAt(0), Character.toUpperCase(strarr[i].charAt(0)));
	  }
	  
	  
	  
    return str1.trim();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}

