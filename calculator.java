import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter from the following functions ('+','-','*','/': ): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double result;
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.print("The sum is:" + result);
                break;
            
            case '-':
                result = num1 - num2;
                System.out.print("the difference is: " + result);
                break;
            
            case '*':
                result = num1 * num2;
                System.out.print("the product is: " + result);
                break;
            
            case '/':
                result = num1 / num2;
                System.out.print("The result is: " +result);
                break;

            default:
                System.out.print("ERROR:Invalid operator!!!");
        }
    }
}