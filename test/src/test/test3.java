package test;

	import java.util.ArrayList;
	import java.util.List;
	public class  test3 {
	public static void main (String[] argv) {

		int[] Array1 = new int[] {1,8,3,4,5};
	    int[] Array2 = new int[] {4,5,6,7,8};
	    boolean contains = false;
	    List<Integer> results = new ArrayList<Integer>();

	    for(int i=0; i<Array1.length; i++) {
	    	
	    	
	        for(int j=0; j<Array2.length; j++) {
	        	
	    	            if(Array1[i]==Array2[j]) {
	            	
	                contains = true;
	                
	                break;
	            }
	        }
	        if(!contains) {
	        	
	            results.add(Array1[i]);
	        }
	        else{
	        	results.add(Array2[i]);
	        }
	    }

	    System.out.println(results);
	}
	}
