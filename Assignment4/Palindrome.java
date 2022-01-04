//Program to check to the given string is palindrome or not
import java.util.*;
import java.io.*;
class Palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String k=sc.nextLine();
int i=0;
int j=k.length()-1;
while(i<j)
{
 if(k.charAt(i)!=k.charAt(j))
  {
  System.out.println("given string is not palindromes");
  System.exit(0);
  }
  i++;
  j--;
}
System.out.println("Given string is a palindrome");
}
}
output:
madam
Given string is a palindrome