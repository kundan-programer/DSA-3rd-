public class shuffle_1470 {

  // public static void odd() {
  // for (int i = 0; i < n; i++) {
  // if (i % 2 != 0) {
  // arr1[i] = arr[i];
  // even();
  // break;
  // }
  // }
  // }

  // public static void even() {
  // for (int i = n + 1; i < 2 * n; i++) {
  // if (i % 2 == 0) {
  // arr1[i] = arr[i];
  // odd();
  // break;
  // }
  // }
  // }

  // public static void array() {

  // for (int i = 0; i < 2 * n; i++) {
  // System.out.print(arr1[i] + " ");
  // }
  // }

  static int arr[] = { 1, 2, 3, 4, 5, 6 };
  static int n = 3;

  static int arr1[] = new int[(2 * n) - 1];

  static int arr2[] = new int[n];
  static int arr3[] = new int[n];

  public static void div() {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = arr.length; j < 2 * n - 1; j++) {
        arr1[i] = arr[i];
        arr2[j] = arr[j];
      }
    }

    for (int i = 0; i < 2 * n - 1; i++) {
      System.out.print(arr1[i] + " ");
      System.out.print(arr2[i] + " ");
    }
  }

  public static void main(String[] args) {
    // odd();
    // array();
    div();
  }

}