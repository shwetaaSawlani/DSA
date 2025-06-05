public class DigitCounter {

  public static int countDigits(int n) {
      n = Math.abs(n); // Handle negative numbers
      if (n == 0) return 1; // Special case for 0

      int count = 0;
      while (n > 0) {
          n /= 10;
          count++;
      }
      return count;
  }

  public static void main(String[] args) {
      System.out.println(countDigits(4));    // Output: 1
      System.out.println(countDigits(14));   // Output: 2
      System.out.println(countDigits(0));    // Output: 1
      System.out.println(countDigits(-123)); // Output: 3
  }
}
