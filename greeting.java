import java.util.Scanner;

public class greeting{
    public static void main(String[] args) {
        Scanner pritha= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = pritha.nextLine();
        System.out.println("Hello, "+ name + "!");
    }

}
