public class Interface_Example {
    public static void main(String[] args) {
      Tallperosn tp = new Tallperosn();
      tp.greet();
      tp.speak();
    }
}

interface Person{
    String species = "Homo Sapiens";

    public void speak();
    public void greet();
}

class Tallperosn implements Person{
    public void speak(){
        System.out.println("Hii I'm a tall person");
        }
      public void greet(){
        System.out.println("Hello");
        }
}



