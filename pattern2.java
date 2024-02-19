/* print a hollow square using *, size of square is given once in program.
* * * * * 
*       *
*       *
*       *
* * * * *
*/
public class pattern2 {
    public static void main(String[] args) {
        int i,j;
        int m=5;
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                if(i==1||i==m||j==1||j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }    
}
