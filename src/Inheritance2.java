import java.awt.*;

// Inheritance examples Accessing the Constructor
public class Inheritance2 {
    public static void main(String[] args) {
         Traingle tt = new Traingle("Traingle Beta", "Sky Blue");
          System.out.println(tt.color);
          System.out.println(tt.name);
    }
}

class Shape{
    String name;
   public Shape(String name){
       System.out.println("Paramaterized Constructor");
       this.name = name;

   }
}

class Traingle extends Shape{
    int sides =3;
    String color ;

    public Traingle(String name , String color){

        super(name);
        this.color = color;
    }

}


