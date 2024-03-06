/*create a one dimensional array : */

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array needed : ");
        int n=scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of array at index "+i+" : ");
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.print("The created array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
