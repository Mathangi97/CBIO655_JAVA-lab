import java.util.Scanner;
public class Reverse
{
 public static void main(String[] args) 
 {
  String input = "MATHANGI";
  String reversedStr = reverseString(input);
  System.out.println("The original string : "+input);
  System.out.println("The reversed string : "+reversedStr);
 }

 static String reverseString(String input)
 {
  String output="";
  char[] charArr = input.toCharArray();
  for (int i = charArr.length - 1; i >= 0; i--)
  {
   output += charArr[i];
  }
   return output;
 }
}
