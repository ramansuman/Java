/*print:
 1
 1 2
 2 3 4
 4 5 6 7
 7 8 9 10 11
 */
import java.util.Scanner;
public class pattern65 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int x=1;
        System.out.print("Enter the size of array :");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++)
            {
                if(x<10)
                    System.out.print(" ");
                System.out.print(x+" ");    
                x++;
            }
            x--;
            System.out.println();
        }
        scan.close();
    }
}
