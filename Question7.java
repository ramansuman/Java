import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n= scan.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the sum required");
        int k= scan.nextInt();
        longestSubarrayWithSum(arr,k);
        scan.close();
    }
    static void longestSubarrayWithSum(int[] arr,int k)
    {
        for (int size = arr.length; size >=1; size--) {
            for (int i = 0; i <arr.length-size; i++) {
                int sum=0;
                for (int j = i; j < i+size; j++) {
                    sum+=arr[j];
                }
                if(sum==k)
                {
                    for (int j = i; j < i+size; j++) {
                        System.out.print(arr[j]+" ");
                    }
                    return;
                }
            }
        }
    }
}
