public class concatination {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    int arr1[] = new int[2 * arr.length];

    for (int i = 0; i < arr.length; i++) {
      arr1[i] = arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      arr1[i + arr1.length] = arr[i];
    }

    // int len = (2 * arr.length) - 1;
    for (int i = 0; i < arr1.length - 1; i++) {
      System.out.print(arr1[i] + " ");
    }
    // if (i == len) {
    // i = 0;
    // } else {
    // continue;
    // }
    // }
  }
}
