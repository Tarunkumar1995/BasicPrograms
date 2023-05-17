import javafx.animation.Animation;

public class Abstraction {
    public static void main(String[] args) {

       Shapes ss = new Circle(2.5,"Blue");
        System.out.println(ss.toString());
    }
}

abstract class Shapes{
    String color;
    abstract double area();
    public abstract String toString();
    public Shapes(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

class Circle extends Shapes{
    double radius;
    public  Circle(double radius, String color){
        super(color);
        this.radius =radius;
    }
    public double area(){
         return Math.PI * Math.pow(radius, 2);
    }
    public String toString(){
        return "Circle color is " + super.getColor()
                + " and area is : " + area();
    }
}

