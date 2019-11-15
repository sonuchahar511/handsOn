package test;

import java.util.HashSet;

public class test5 {
	static void printDistinct(int arr[])
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<Integer>();

        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If not present, then put it in hashtable and print it
            if (!set.contains(arr[i]))
            {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printDistinct(arr);
    }

}
