public class Enums_Examples {
    Size pizzaSize;
    public Enums_Examples(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }
    public void OrderPizaa(){
        switch (pizzaSize){
             case SMALL:
                 System.out.println("I ordered a small size pizza.");
                 break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }

    public static void main(String[] args) {
         Enums_Examples ee = new Enums_Examples(Size.SMALL);
         ee.OrderPizaa();
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
}
