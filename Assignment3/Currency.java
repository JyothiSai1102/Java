//Convert payment into US,Indian,Chinese,French currency formats
import java.util.*;
import java.text.*;
class Currency
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   double payment=sc.nextDouble();
   sc.close();
   NumberFormat France=NumberFormat.getCurrencyInstance(Locale.FRANCE);
   NumberFormat US=NumberFormat.getCurrencyInstance(Locale.US);
   NumberFormat China=NumberFormat.getCurrencyInstance(Locale.CHINA);
   NumberFormat India=NumberFormat.getCurrencyInstance(new Locale("en"));
   System.out.println("US: " +US.format(payment));
   System.out.println("India: " +India.format(payment));
   System.out.println("China: " +China.format(payment));  
   System.out.println("France: " +France.format(payment));
  }
}
/*Output:
12324.123
US: $12,324.12
India: ?12,324.12
China: ¥12,324.12
France: 12?324,12 ?
*/
