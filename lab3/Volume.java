import java.util.*;
class Box
{
 public double height;
 public double width;
 public double depth;
 
 public void box()
 {
  height=5;
  width=10;
  depth=15;
 }
 
 public double calculateVolume(double height, double width, double depth)
 {
  this.height=height;
  this.width=width;
  this.depth=depth;
  
  return height*width*depth;
 }
}
 
 class Volume
 {
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter height: ");
   double h= sc.nextDouble();
   System.out.println("Enter width: ");
   double w= sc.nextDouble();
   System.out.println("Enter depth: ");
   double d= sc.nextDouble();
   
   Box b=new Box();
   double volume = b.calculateVolume(h,w,d);
   System.out.println("Volume is: "+volume);
   }
  }
  