import java.util.Scanner;
import java.lang.Math.*;
public class Armstrong
{
 public static void main(String[] args)
 {
 System.out.println("Enter a number");
 Scanner input = new Scanner(System.in);
 int number = input.nextInt();
 int length = 0;
 int tempNumber = number;

 while (tempNumber !=0) 
 {
  length++;
  tempNumber = tempNumber/10;
 }
  boolean result = ArmstrongNumber(number, length);
  if(result)
  {
   System.out.println("The given number is Armstrong number");
  } 
  else 
  {
   System.out.println("The given number is not an Armstrong number");
  }
 }
	
 static boolean ArmstrongNumber(int number, int length)
 {
   int temp=number, sum=0;
   while (temp!=0)
   {
    int n = temp%10;
    sum = sum + (int) Math.pow(n,length);
    temp = temp/10;
   }
     return (sum == number);
  }
}
