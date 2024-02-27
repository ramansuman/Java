/*print:-
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/
import java.util.Scanner;
class pattern11{
    public static void main(String args[]){
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n+i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}