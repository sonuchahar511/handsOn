package test;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		  double s=0.0;
		  String sr="";
		  int j=0;
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
		
            for(j=0; j<=n;j++)
            {
            	 System.out.println(""+sr+""+j+"="+a+(Math.pow(2, t))*b +"="+s );
         
            }
        
		
	}

}
	
	
	
	
}






