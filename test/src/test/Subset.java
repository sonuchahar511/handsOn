package test;

public class Subset {
	

    static void method(int arr[], int value[], int start, int end, int index, int a)
    {
        if(index == a)
        {
            for(int i = 0; i<a; i++)

                System.out.print(value[i]+ " " );

            System.out.println(" ");

            return;
            }
        for(int j= start; j<=end && end-j+1 >=a-index;j++)
        {
            value[index] = arr[j];

            method(arr, value, j+1 , end,index+1,a);

        }
    }
    static void print(int arr[], int l ,int a)
    {
        int value[]= new int[a];
        method(arr, value,0,l-1,0,a);
    }
    public static void main(String [] args)
    {
        int arr[] = {1,3,6,8,10,11};
        //int sum = 0;
        int a = 3;
        int l = arr.length;
        print(arr,l,a);
    } 
	
	

}
