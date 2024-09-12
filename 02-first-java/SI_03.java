import java.util.Scanner;

public class SI_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principle: ");
    int principle = sc.nextInt();

    System.out.print("Enter the rate: ");
    int rate = sc.nextInt();

    System.out.print("Enter the time: ");
    int time = sc.nextInt();

    int SI = (principle * rate * time) / 100;

    System.out.println("The SI is: " + SI);
  }
}
