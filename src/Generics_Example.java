public class Generics_Example {
    public static void main(String[] args) {
        Foo<Integer> foo = new Foo<>(5);
        System.out.println(foo.print());
        Foo<String> foo1 = new Foo<>("HIi");
        System.out.println(foo1.print());
    }
}

class Foo <T>{
     private T parameter;
    public Foo(T params){
        this.parameter = params;
    }

    public T print(){
        return parameter;
    }
}
