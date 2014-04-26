/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testfib;

/**
 *
 * @author Brendan
 */
import java.math.BigInteger;

public class TestFib {

    /**
     * @param args the command line arguments
     */
    public static long recursive_fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursive_fib(n - 1) + recursive_fib(n - 2);
    }

    public static long array_fib(int n) {
        if (n <= 1) {
            return 1;
        }
        long[] F = new long[n + 1];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[n];
    }

    public static BigInteger array_fib_BI(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        BigInteger[] F = new BigInteger[n + 1];
        F[0] = BigInteger.ONE;
        F[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            F[i] = new BigInteger("0");
            F[i] = F[i].add(F[i - 1]);
            F[i] = F[i].add(F[i - 2]);
        }
        return F[n];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 1000; i++) {
            System.out.println("fib(" + i + ") = " + array_fib_BI(i));
        }
    }
}
