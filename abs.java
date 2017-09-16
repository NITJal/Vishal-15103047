public abstract class shape {
    abstract void Side();
}

public class Trapezoid extends shape{
    public void Side(){
      System.out.println("Trapezoid have 4 sides");
    }
 }
 
 public class Triangle extends shape{
     public void Side()
     {
      System.out.println("Trapezoid have 3 sides");  
     }
 } 
 
 public class Hexagon extends shape{
    pubic void Side{
      System.out.println("Trapezoid have 6 sides");
    }
 }
 
 public class Demo{
 
   public static void main(String[] arg)
   {
     shape S;
     Trapezoid T = new Trapezoid();
     Triangle Tr = new Triangle();
     Hexagon H = new Hexagon();
     s=T;
     s.Side();
     s=Tr;
     s.Side();
     s=H;
     s.Side();
   }
 }
