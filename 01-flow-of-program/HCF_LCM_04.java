import java.util.Scanner;

public class HCF_LCM_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the num2: ");
    int num2 = sc.nextInt();
    int n1 = num1;
    int n2 = num2;
    int rem = 0;
    while (num1 % num2 != 0) {
      rem = num1 % num2;
      num2 = num1;
      num1 = rem;
    }

    int lcm = (n1 * n2) / num1;
    System.out.println("The hcf is: " + num1);
    System.out.println("The lcm is: " + lcm);
  }
}
