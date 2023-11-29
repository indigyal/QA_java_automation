package Automation001;

public class Rectangle extends Shape {
    public double width;
    public double height;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectangle [Color= " + color + ", width" + width + ", height"
                + height + "]";
    }
}
