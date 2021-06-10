import java.util.*;
class Dnacompare
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first sequence: ");
  String seq1=sc.nextLine();
  System.out.println("Enter the second sequence: ");
  String seq2=sc.nextLine();
 
  System.out.println("Length of first sequence is: "+seq1.length());
  System.out.println("Length of second sequence is: "+seq2.length());  

  if(seq1.length()!=seq2.length())
  { 
   System.out.println("Sequence length mismatch!");
  }
  else
  {
   if(seq1.equalsIgnoreCase(seq2))
   {
    System.out.println("Sequences match!");
   }
   else
   {
    System.out.println("Sequences mismatch!");
   }
  }
 }
}
  