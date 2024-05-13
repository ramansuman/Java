import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        printSubstring(arr, k);
        scan.close();
    }
    static void printSubstring(int[] arr, int k) {
        boolean check = true;
        for (int size = 1; size <= arr.length; size++) {
            for (int i = 0; i <= arr.length - size; i++) {
                boolean check1 = true;
                for (int j = i; j < i + size; j++) {
                    if (arr[j] % k != 0) {
                        check1 = false;
                    }
                }
                if (check1) {
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                        check = false;
                    }
                    System.out.println();
                }
            }
        }
        if (check) {
            System.out.println("None");
        }
    }
}