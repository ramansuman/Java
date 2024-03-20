import java.util.Scanner;

public class CountUniqueElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n= scan.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        scan.close();
        countUniqueElements(arr);
    }
    public static void countUniqueElements(int[] arr) {
        int count = 1;
        int uniqueCount=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } 
            else {
                if(count==1)
                    uniqueCount++;
                count=1;
            }
        }
        if(count==1)
        uniqueCount++;
        System.out.println(uniqueCount);
    }
}