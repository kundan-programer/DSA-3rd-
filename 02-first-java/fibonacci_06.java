import java.util.Scanner;

public class fibonacci_06 {
  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3;

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(n1 + " " + n2 + " ");

    for (int i = 2; i < n; i++) {
      n3 = n1 + n2;
      System.out.print(n3 + " ");
      n1 = n2;
      n2 = n3;
    }
  }
}
