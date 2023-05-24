public class Generics_Example2 {
    public static void main(String[] args) {
        Calc<Integer, String> cal = new Calc<>(5, "Five");
        cal.myPrint();

    }
}

class Calc <T, V>{
    T data;
    V type;
    public Calc(T data, V type){
        this.data =data;
        this.type = type;
    }
    public void myPrint(){
        System.out.println(data + " " + type);
    }

}
