import java.util.Locale;
import java.util.Scanner;

public class Basic_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the Operation");
        String operation = sc.next();
        switch (operation){
            case "add":
                System.out.println("Addition of two numbers " + (a +b));
                break;
            case "Sub":
                System.out.println("Subtraction of two numbers" + (a - b));
                break;
            case "multiply":
                System.out.println("Multiplication of two numbers" + (a * b));
                break;

            case "division":
                System.out.println("Division of two numbers" + (a / b));
                break;
        }


    }
}

