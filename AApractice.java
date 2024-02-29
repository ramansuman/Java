import java.util.Scanner;
class AApractice{
    public static void main(String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                for (int a = 1; a <=i+(j-1);a++)
                {
                    System.out.print(a);
                }     
                System.out.println();
            }
        }
        scan.close();
    }
}