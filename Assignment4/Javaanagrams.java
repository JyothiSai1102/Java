//program to test the given strings javaanagrams are not
import java.io.*;
import java.util.*;
class Javaanagrams 
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner (System.in);
  String a=sc.nextLine();
  String b=sc.nextLine();
  if(checkAnagram(a,b))
  {
   System.out.println("They are Anagrams");
  }
  else
  {
   System.out.println("They are not Anagrams");
  }
  sc.close();
 }
public static boolean checkAnagram(String a,String b)
{
 a=a.replaceAll(" ","");
 b=b.replaceAll(" ","");
 if(a.length()!=b.length())
  {
  return false;
  }
else
  {
  //converting to character from string
  char[]array1=(a.toLowerCase()).toCharArray();
  char[]array2=(b.toLowerCase()).toCharArray();
  Arrays.sort(array1);
  Arrays.sort(array2);
  return(Arrays.equals(array1,array2));
  }
}
}
/*output:
ra t
tar
They are Anagrams
output2:
man men
They are not Anagrams
*/