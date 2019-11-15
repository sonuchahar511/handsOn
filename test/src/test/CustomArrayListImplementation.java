package test;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer ids[] = { 1, 2, 3, 4 };
		String email[] = { "A", "B", "C", "D" };
		String address[] = { "xyz", "lmn", "opq", "abc" };
	
		addValues(ids, email, address);

	}

	public static void addValues(Integer ids[], String email[], String address[]) {
		List<CustomeArray> listCust = new ArrayList<CustomeArray>();

		

		for (int i = 0; i <= 3; i++) {
			CustomeArray cust = new CustomeArray();
			cust.setIds(ids[i]);
			cust.setEmail(email[i]);
			cust.setAddress(address[i]);
			listCust.add(cust);
		}

		printValues(listCust);

	}

	public static void printValues(List<CustomeArray> listCust) {

		 CustomeArray custID=null;
		
          for(int i=0; i<listCust.size();i++)
          {
        	  custID =listCust.get(i);
        	 
        	    System.out.println(custID.getIds()+" "+ custID.getEmail() +" "+custID.getAddress());    
        	  
          }
      
           
          
	}

}
