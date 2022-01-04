//program to handle the StringIndexOutOfBoundsException 
class Exception2
{
 public static void main(String args[])
 {
  try{
   String str="bunny";
   System.out.println(str.charAt(6));
  }
  catch(StringIndexOutOfBoundsException e)
  {
   System.out.println(e);
  }
 System.out.println("this statement will execute after try-catch block");
 }
}

/*OUTPUT:
java.lang.StringIndexOutOfBoundsException: String index out of range: 6
this statement will execute after try-catch block
*/