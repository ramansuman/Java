import java.util.Scanner;

public class CommonElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the required number of elements in array 1 : ");
        int N= scan.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements in array 1 : ");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the required number of elements in array 2 : ");
        int M = scan.nextInt();
        System.out.print("Enter the elements in array 2 : ");
        int[] arr1 = new int[M];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scan.nextInt();
        }
        scan.close();
        System.out.println("Common Elements in array 1 and 2 is : ");
        printCommonElement(arr,arr1);
    }
    /*
     * arr= [2,4,5,5,7,8]
     * arr1= [2,3,5,5,6,7,8]
     * output: 2,5,7,9
     */
    static void printCommonElement(int[] arr, int[] arr1)
    {
        int i=0,j=0;
        while(i<arr.length&&j<arr1.length)
        {
            if(arr[i]==arr1[j])
            {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
            else if(arr[i]<arr1[j])
                i++;
            else
                j++;

        }
    }
}
