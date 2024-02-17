/*print:-
 1
 2 3
 4 5 6
 7 8 9 10
 */
public class pattern7 {
    public static void main(String[] args) {
        int i,j,k=1;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j<=i){
                    if(k<10){
                        System.out.print("0");
                    }
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
