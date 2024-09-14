import java.util.Scanner;

public class Armstrong_Number_09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int num1 = num;
    int c = 0, rem;

    while (num > 0) {
      rem = num % 10;
      c = (rem * rem * rem) + c;
      num = num / 10;
    }

    if (num1 == c) {
      System.out.println("Yes");
    }

    else {
      System.out.println("No");
    }
  }
}
