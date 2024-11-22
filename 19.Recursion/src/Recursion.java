public class Recursion {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "banana";

        System.out.printf("Is %s a palindrome? %b%n", s1, isPalindrome(s1));
        System.out.printf("Is %s a palindrome? %b%n", s2, isPalindrome(s2));

        int x = 256;
        int y = 64;
        System.out.printf("The gcd of %d and %d is %d%n", x, y, gcd(x, y));

        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fib(n));
        }
    }

    /**
     * Given a String, determines if it is a palindrome.
     * That is, if the String can be read the same forwards
     * and backwards.
     *
     * @param s String to check
     * @return  true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        // TODO: Implement the method
        if (s.length() <= 1) {
            return true;
        } else {
            boolean firstMatchLast = (s.charAt(0) == s.charAt(s.length()-1));
            if (firstMatchLast) {
                String remainder = s.substring(1, s.length()-1);
                return isPalindrome(remainder);
            } else {
                return false;
            }
        }
    }

    /**
     * Given two integers, compute their greatest common
     * divisor. That is, the largest positive integer that
     * divides both numbers without remainder.
     *
     * @param x first number
     * @param y second number
     * @return  greatest common divisor of x and y
     */
    public static int gcd(int x, int y) {
        // TODO: Implement the method
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }

    /**
     * Computes the nth term in the fibonacci series. The
     * nth term in the series is defined as the sum of the
     * previous two terms, starting with 0 and 1.
     *
     * @param n the term to calculate
     * @return  the term
     */
    public static int fib(int n) {
        // TODO: Implement the method
        if (n <=1) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
         }
    }
}