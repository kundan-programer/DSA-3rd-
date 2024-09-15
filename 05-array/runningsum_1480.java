/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

public class runningsum_1480 {
  public static void main(String[] args) {

    int arr[][] = { { 1, 2 }, { 9, 18 }, { 9, 108 } };
    int arr1[][] = {};
    int c = 0;
    // int[] array = Integer.valueOf(arr).chars().map(c -> c - '0').toArray();

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;

      for (int j = 0; j < arr[i].length; j++) {
        // arr1[i] = arr[i][j] + sum;
        sum = arr[i][j] + sum;
      }
      if (c < sum) {
        c = sum;
      }
    }
    System.out.println(c);

  }
}
