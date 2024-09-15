import java.util.Scanner;

public class Armstrong_Number_09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int num1 = num;
    int[] arr = String.valueOf(num).chars().map(c -> c - '0').toArray();
    int sum = 0, mul = 1, diff;
    // for (int i = 0; i < array.length; i++) {
    // System.out.println(array[i] + " ");
    // }

    for (int i = 0; i < arr.length; i++) {
      sum = arr[i] + sum;
      mul = arr[i] * mul;
    }

    System.out.println(sum);
    // int c = 0, rem;

    // while (num > 0) {
    // rem = num % 10;
    // c = (rem * rem * rem) + c;
    // num = num / 10;
    // }

    // if (num1 == c) {
    // System.out.println("Yes");
    // }

    // else {
    // System.out.println("No");
    // }
  }
}
