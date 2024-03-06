import java.util.Scanner;

/**
 * DynamicDimensionalArray
 */
public class DynamicDimensionalArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Dimension of array needed(between 1 to 4) : ");
        int dimension = scan.nextInt();
        while (dimension>4||dimension<=0) {
            if(dimension<0)
                System.out.println("Dimension can never be negative!!! ");
            if(dimension>4)
                System.out.println("Please enter Dimention between 1 to 4 !!! ");
            if(dimension==0)
                System.out.println("Dimention can never be ZERO!!!");
            System.out.print("Enter the new Dimension : ");
            dimension= scan.nextInt();
        }
        switch (dimension) {
            case 1:
                oneDimensionArray();
                break;
            case 2:
                twoDimensionArray();
                break;
            case 3:
                threeDimensionArray();
                break;
            case 4:
                fourDimensionArray();
                break;
        }
        scan.close();
    }
    static void oneDimensionArray()
    {
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
    static void twoDimensionArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of rows needed in the new array : ");
        int n=scan.nextInt();
        System.out.print("Enter the size of columns needed in the new array : ");
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
    static void threeDimensionArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of blocks needed in the new array : ");
        int x=scan.nextInt();
        System.out.print("Enter the number of rows needed in the new array : ");
        int y = scan.nextInt();
        System.out.print("Enter the number of columns needed in the new array : ");
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
    static void fourDimensionArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of memory needed in the new array in fourth dimension : ");
        int w =scan.nextInt();
        System.out.print("Enter the number of blocks needed in the new array : ");
        int x=scan.nextInt();
        System.out.print("Enter the number of rows needed in the new array : ");
        int y = scan.nextInt();
        System.out.print("Enter the number of columns needed in the new array : ");
        int z= scan.nextInt();
        int[][][][] arr = new int[w][x][y][z];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        System.out.println("Enter the value at "+i+" memory "+j+" block "+k+" row "+l+"column : ");
                        arr[i][j][k][l]=scan.nextInt();
                    }
                }
            }
        }
        scan.close();
        System.out.println("Created array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        System.out.print(arr[i][j][k][l]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}