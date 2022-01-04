//program to handle the ArrayIndexOutOfBoundsException 
class Exception3
{
 public static void main(String args[])
 {
 try {
 int[] a=new int[10];
 a[0]=120;
 a[40]=45;
 System.out.println(a[0]);
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}

/*OUTPUT:
java.lang.ArrayIndexOutOfBoundsException: Index 40 out of bounds for length 10
*/