package test;

import java.util.ArrayList;
import java.util.List;

public class uniquePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "dog,cat,apple,apricot,first";

		String[] spl = str.split(",");

		int count = 0;

		List<String> lists = new ArrayList<String>();

		for (int i = 0; i <= spl.length - 1; i++) {

			if (i < spl.length - 1) {

				if (spl[i].charAt(0) != spl[i + 1].charAt(0)) {

					lists.add(String.valueOf(spl[i].charAt(0)));
			

				}
				else
				{ 
				
					count++;
					while (count > 0) {

						if (spl[i].charAt(count) != spl[i + 1].charAt(count)) {

							lists.add(spl[i].substring(0, count+1));
						
							count = 0;
							continue;
						}

						count++;

					}

			}
			}

		}
		System.out.println(lists);
		
	}
}
