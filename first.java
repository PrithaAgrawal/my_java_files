package myjava_stuff;
import java.util.Scanner;

public class first{
    public static void main(String[] args) {

      System.out.println("Taking Input from the user");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number 1");
      int a = sc.nextInt();
      System.out.println("Enter number 2");
      int b = sc.nextInt();
      int sum = a+b;
      System.out.println("The sum of these numbers is");
      System.out.println(sum);
    }
}