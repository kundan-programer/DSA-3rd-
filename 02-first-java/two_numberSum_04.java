import java.util.Scanner;

public class two_numberSum_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter the 2nd number: ");
    int num2 = sc.nextInt();

    int output = 0;

    System.out.print("Choose the operator ==> ['+' ,'-', 'x' , '/'] ");
    char operator = sc.next().charAt(0);

    switch (operator) {
      case '+':
        output = num1 + num2;
        break;
      case '-':
        output = num1 - num2;
        break;
      case '*':
        output = num1 * num2;
        break;
      case '/':
        output = num1 / num2;
        break;

      default:
        System.out.println("Error...");
        break;
    }
    System.out.print("The output is: " + output);
  }
}
