/*print:-
 01 02 03 04 05
 06 07 08 09 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 */
public class pattern10 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int count=1;
        for(i = 1;i<=n; i++) {
            for ( j = 1; j <=n; j++) {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
