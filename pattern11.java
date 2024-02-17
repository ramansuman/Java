/*print:-
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/
public class pattern11 {
    public static void main(String[] args) {
        int i,j,k;
        int n=5;
        for ( i = 1; i <=n; i++) {
            k=i;
            for ( j = 1; j <=n; j++) {
                if(k<10){
                    System.out.print("0");
                }
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
