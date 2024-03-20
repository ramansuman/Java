import java.util.Scanner;

public class RotationalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n= scan.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the values in new Array : ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print("Enter the value at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the number of rotations needed in array : ");
        int k = scan.nextInt();
        scan.close();
        arrayRotation(arr,k);
    }
    static void arrayRotation(int[] arr, int k)
    {
        int newIndex;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newIndex= (i+k)%arr.length;
            newArr[newIndex]=arr[i];
        }
        System.out.println("After rotating array by "+k+" the new array is : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
