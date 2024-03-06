/*create a two dimentional array . */

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of rows needed in the new array : ");
        int n=scan.nextInt();
        System.out.println("Enter the size of columns needed in the new array : ");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value of array at "+i+" row "+j+" column : ");
                arr[i][j]=scan.nextInt();
            }
        }
        scan.close();
        System.out.println("The new created array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
