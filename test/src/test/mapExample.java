package test;

import java.util.Scanner;

public class mapExample {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
           
            System.out.printf("%-14s %03d\n", s1, x);
            
            System.out.println();
            System.out.printf(s1+" "+(x<100? 000+x:x));
        }
        System.out.println("================================");*/
        
        int x=sc.nextInt();
        int y=0;
        for(int i=1 ; i<=10 ; i++)
        {
        	y=x*i;
        	
        	System.out.println(x+" "+"x"+" "+i+" "+"="+" "+ y);
        }
        
        

}
}
