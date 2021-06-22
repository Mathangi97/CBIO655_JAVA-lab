class Square
{
 public int a=5;
}

class Cube extends Square
{
 int b=50;
}

class Test
{
 public static void main(String args[])
 {
  Cube C = new Cube();
  System.out.println("Base class (square) value: "+C.a);
  System.out.println("Derived class (cube) value: "+C.b);
  }
 }
  
  
 
 