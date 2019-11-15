package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Given an unsorted list of repeated elements in an array, Find the element with maximum frequency.
public class maxCountOfvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc= new Scanner(System.in);
		
		String s =sc.nextLine();
		
		/*String s = "i amm innnn loooop";*/
		int count = 0;
		char[] sch = s.toCharArray();

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Set<Character> st = new HashSet<Character>();

		for (int j = 0; j <= sch.length - 1; j++)

		{
			st.add(sch[j]);

		}

		for (Character str : st) {

			for (int i = 0; i <= sch.length - 1; i++) {

				if (sch[i] == str)

				{
					count++;

				}
				map1.put(str, count);

			}
			count = 0;
		}

		System.out.println(map1);

	}

}
