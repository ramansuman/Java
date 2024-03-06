import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of blocks needed in the new array : ");
        int x=scan.nextInt();
        System.out.println("Enter the number of rows needed in the new array : ");
        int y = scan.nextInt();
        System.out.println("Enter the number of columns needed in the new array : ");
        int z= scan.nextInt();
        int[][][] arr = new int[x][y][z];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the value at "+i+" block "+j+" row "+k+" column : ");
                    arr[i][j][k]=scan.nextInt();                    
                }
            }
        }
        scan.close();
        System.out.println("Created array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
