import java.util.Scanner;

public class nSum_05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    int totalno = 0;
    for (int i = 0; i < num; i++) {
      totalno = sc.nextInt();
      sum = sum + totalno;
    }
    System.out.println(sum);
  }
}
