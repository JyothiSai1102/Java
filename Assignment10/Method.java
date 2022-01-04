import java.lang.String;
import java.util.*;
class Method
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(str.trim());
System.out.println(str.toUpperCase());
System.out.println(str.trim().toUpperCase());
System.out.println(str.toLowerCase());
System.out.println(str.trim().toLowerCase());
System.out.println(str.length());
System.out.println(str.charAt(2));
System.out.println(str.charAt(1));
System.out.println(str.charAt(str.length()-1));
System.out.println(str.startsWith("S"));
System.out.println(str.endsWith("g"));
}
}

/*
Output:
 StrIng  //given input
StrIng   //trim()
 STRING  //toUpperCase()
STRING   //trim().toUpperCase()
 string  //toLowerCase()
string   //trim().toLowerCase()
7        //length()
t        //charAt(2)
S        //charAt(1)
g        //charAt(str.length()-1)
false    //startsWith("S")
true     //endsWith("g")

Methods used:
.trim()-this method delete the spaces before and after the string
.toUpperCase()-this method converts the string into uppercase letters
.trim().toUpperCase()-this method will trim and converts the string into uppercase letters
.toLowerCase()-this method converts the string into lowercase letters
.trim().toLowerCase()-this method will trim and converts the string into lowercase letters
.length()-this method returns length of the string
.charAt()-this method returns a character at specified index
.startsWith()-this method checks whether the string starts with the letters passed as arguments and returns true or false
.endsWith()- this method checks whether the string ends with the letters passed as arguments and returns true or false
*/