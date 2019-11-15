package test;
import java.util.*;
public class test6 {
   public static void main(String args[] ) throws Exception {

 Scanner sc=new Scanner(System.in);

     if(sc.hasNextInt())
         System.out.println("This input is  of type Integer");
     else if(sc.hasNextFloat())
         System.out.println("This input is  of type Float");
         else if(sc.hasNext())
            System.out.println("This input is  of type String");
     else
         System.out.println("This is something else");
   }
}


