import java.util.Scanner;

public class Largest_05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the 1st number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter the 2nd number: ");
    int num2 = sc.nextInt();

    if (num1 > num2) {
      System.out.println("num1 is the greater number.");
    }

    else {
      System.out.println("num2 is the greater number.");
    }
  }
}
