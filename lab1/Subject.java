class Subject
{
 public static void main(String args[])
 {
  float avg;
  int maths=78;
  int phy=56;
  int chem=69;
  int bio=88;
  int lang=45;

  avg=(maths+phy+chem+bio+lang)/5;
  System.out.print("Average of marks: "+avg+" - ");
  if(avg>=50.0)
  {
   System.out.print("Pass");
  }
  else
  {
   System.out.print("Fail");
  }
 }
}