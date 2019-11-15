package test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class uniquePrefixNew {

	public static void main(String[] args) {

		String str = "dog,cat,apple,apricot,first";

		String[] spl = str.split(",");

		Set<String> list1 = new CopyOnWriteArraySet<String>();
		list1.add("1");
		Set<String> sets = new HashSet<String>();

		int count = 0;

		for (int i = 0; i <= spl.length - 1; i++) {
			for (int j = i + 1; j <= spl.length - 1; j++) {

				if (spl[i].charAt(0) != spl[j].charAt(0)) {

					{

						if (!list1.contains(String.valueOf(spl[i].charAt(0)))) {

							sets.add(String.valueOf(spl[i].charAt(0)));
							list1.add(String.valueOf(spl[i].charAt(0)));

						}
						
					}

				}

				else {
					list1.add(String.valueOf(spl[i].charAt(0)));

					count++;
					while (count > 0) {
						if (spl[i].charAt(count) != spl[j].charAt(count)) {

							if (!list1.contains(String.valueOf(spl[i].charAt(count)))) {
								if (spl[i].charAt(count) != spl[j].charAt(count)) {
									sets.add(spl[i].substring(0, count + 1));
									list1.add(spl[i].substring(0, count + 1));
								}

							}
							list1.add(spl[i].substring(0, count + 1));
							count = 0;

							break;

						}

						count++;
					}

				}
			}
			/*
			 * count= spl[i].length();
			 * 
			 * for(int j=0; j<=count; j++) {
			 * 
			 * sets.add(spl[i].substring(0, j));
			 * 
			 * 
			 * } sets.removeAll(list );
			 */

			/*
			 * if() {
			 * 
			 * }
			 */

		}

		/*
		 * for (int i = 0; i <= spl.length; i++) {
		 * 
		 * for (int j = i + 1; j <=spl.length-1; j++) {
		 * 
		 * if (spl[i].charAt(count)!= spl[j].charAt(count)) {
		 * 
		 * sets.add(String.valueOf(spl[i].charAt(0)));
		 * 
		 * }
		 * 
		 * else{ count++;
		 * 
		 * while (count > 0) {
		 * 
		 * if (spl[i].charAt(count) != spl[j].charAt(count)) {
		 * 
		 * sets.add(spl[i].substring(0, count+1)); count = 0; continue; }
		 * 
		 * count++;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */

		System.out.println(sets);

	}

}
