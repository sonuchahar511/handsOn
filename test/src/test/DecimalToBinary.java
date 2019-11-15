package test;

import java.util.*;

public class DecimalToBinary {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

		int n=439;

		int count = 1;
		int binary[] = new int[32];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) {

			String str = String.valueOf(i);
			
		String ar[]=str.split("0");
			
		if(ar.length>1)
		{
			count++;
		}
		/*	
			if (binary[j] == 1 && binary[j + 1] == 1) {
				count++;
			}

			System.out.print(binary[j]);
*/
		}
		System.out.print(count);
		/*scanner.close();*/
	}

}
