public class StairCase {

  public static String[] practiceStairs(int n) {
    String[] st = new String[n];
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {

        System.out.print("*");
      }
      System.out.println();
    }

  }
}
