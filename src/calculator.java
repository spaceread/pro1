import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);
        //dialog
        System.out.println("apa operator: +, -, *, or /");
        operator = input.next().charAt(0);


        System.out.println("Pilihan pertama");
        number1 = input.nextDouble();

        System.out.println("Pilihan kedua");
        number2 = input.nextDouble();
        //operator


        switch (operator) {


             case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

             case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

             case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

             case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

             default:
                System.out.println("operator apa itu?");
                break;
        }
    }
}