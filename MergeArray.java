import java.util.Scanner;

/**
User will give us two new sorted array. We need to merge them and create a new sorted array.
*/
public class MergeArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int n= scan.nextInt();
        System.out.print("Enter the size of second array : ");
        int m= scan.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        System.out.print("Enter the values in first array(ascending order) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the values in second array(ascending order) : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scan.nextInt();
        }
        scan.close();
        arrayMerge(arr,arr1);
    }
    static void arrayMerge(int[] arr, int[] arr1)
    {
        int[] res = new int[arr.length+arr1.length];
        int i=0, j=0;
        int index=0;
        for (; i < arr.length&& j<arr1.length; index++) 
        {
            if(arr[i]<arr1[j])
            {
                res[index]=arr[i];
                i++;
            }
            else
            {
                res[index]=arr1[j];
                j++;
            }
        }
        while(i<arr.length)
        {
            res[index]=arr[i];
            i++;
            index++;
        }
        while(arr1.length>j)
        {
            res[index]=arr1[j];
            index++;
            j++;
        }
        System.out.println("The new merged array is : ");
        for (index = 0; index < res.length; index++) {
            System.out.print(res[index]+" ");
        }
    }
}