class Fib
{
 public static void main(String args[])
 {
  long n1=0;
  long n2=1;
  long n3;
  long end=50;
  
  System.out.print(n1+" , "+n2+" , ");
  for(int i=2;i<end;i++)
  {
   n3=n1+n2;
   System.out.print(n3+" , ");
   n1=n2;
   n2=n3;
  }
 }
}