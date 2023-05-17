public class Inheritance {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.show();
    }
}

class ParentClass{
    void display(){
        System.out.println("Hii this is parent class");
    }

    void display(String n){
    System.out.println("HI this is Parametrized Parent class");
    }
}

class SubClass extends ParentClass{

    void display(){
        System.out.println("Hii this is Sub Class");
    }

    void show(){
        super.display("Tarun");
        System.out.println("Hi this is a method of a subclass");
        display();
    }
}
