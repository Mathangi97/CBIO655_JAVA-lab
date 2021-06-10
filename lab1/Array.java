class Array
{
 public static void main(String args[])
 {
  double sum=0;
  double avg=0;
  double [] arr= {10.0,45.56,34,5,12.78,4,23.0,9,6.2,2.22};
  for(int i=0;i<arr.length;i++)
  {
   sum+=arr[i];
  }
  avg=sum/arr.length;
  System.out.print("Average of the elements: "+avg);
 }
}
  