package Automation001;

public class Circle extends Shape {
  public double radius;
  public Circle(String color, double radius){
      super (color);
      this.radius = radius;
  }
  public double getArea(){
      return Math.PI * radius * radius;
  }

  @Override
    public String toString(){
      return "Circle [Color= "+ color + ", radius= " + radius + "]";
  }
}
