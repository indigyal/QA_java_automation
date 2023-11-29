package Automation001;

class Shape{
    public String color;
    public Shape(String color){
        this.color = color;
    }
    public double getArea(){
        return 0.0;
    }
    @Override
    public String toString(){
        return "Shape [color ="+ color + "]";
    }
}