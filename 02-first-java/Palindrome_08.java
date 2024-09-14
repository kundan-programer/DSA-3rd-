import java.util.Scanner;

public class Palindrome_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = "Moom";
    String str2 = "";
    String str3 = str1.toLowerCase();

    // reverse the string...
    for (int i = 0; i < str3.length(); i++) {
      str2 = str3.charAt(i) + str2;
    }

    // check the condition either it is equal or not...
    if (str3.equals(str2)) {
      System.out.println("Yes, \"" + str1 + "\" is a valid palindrome");
    } else {
      System.out.println("No, " + str1 + " is  not a valid palindrome");
    }
  }
}
