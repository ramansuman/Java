/*Task is to return the maxmimum sum and minimum sum possible of n-1 elements of an array */

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of new array : ");
        int n=scan.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        scan.close();
        printSum(arr);
    }
    static void printSum(int[] arr)
    {
        int min=arr[0];
        int max=arr[0];
        int maxSum=0;
        int minSum=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]>max)
                max=arr[i];
            sum+=arr[i];
        }
        minSum=sum-max;
        maxSum=sum-min;
        System.out.println("Minimum sum of "+(arr.length-1)+" elemnts is : "+ minSum);
        System.out.println("maximum sum of "+(arr.length-1)+" elments is : "+ maxSum);
    }
}
