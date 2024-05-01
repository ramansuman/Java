import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        minProduct(arr);
        scan.close();
    }
    static void minProduct(int[] arr)
    {
        int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest)
            {
                secondSmallest=arr[i];
            }
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        int res1=smallest*largest;
        int res2=smallest*secondSmallest;
        if(res1<res2)
            System.out.println(res1);
        else
            System.out.print(res2);

    }
}
