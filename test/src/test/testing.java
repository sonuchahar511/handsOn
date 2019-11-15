package test;

import java.util.Arrays;

public class testing {
	public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        int cal=0;
        boolean contains = false;
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
