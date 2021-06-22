import Arithmetic.*;
import java.util.*;
class ArithmeticOperation
{
public static void main(String args[])
{
int a,b;
Addition ad=new Addition();
Subtraction sb=new Subtraction();
Multiplication ml=new Multiplication();
Division dv=new Division();
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
a=sc.nextInt();
System.out.println("Enter second number: ");
b=sc.nextInt();

ad.add(a,b);
sb.sub(a,b);
ml.mult(a,b);
dv.div(a,b);
}
}
