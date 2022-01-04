// Pattern program for hollow diamond
import java.io.*;
import java.util.*;
public class HollowDiamond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==1 || k==1 || k==n || i==k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                if(i==n || k==1 || k==n || i==k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
            }
            System.out.println( );
        }
        sc.close();
    }
    
}
/*Output:

5
     *
    * *
   *   *
  *     *
 *       *
 *       *
  *     *
   *   *
    * *
     *

*/
