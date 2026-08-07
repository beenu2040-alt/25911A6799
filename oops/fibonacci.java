import java.util.Scanner;
class Fibonacci {
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
 static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(n+"th value in Fibonacci using Recursion is " + fibonacciRecursive(n));
        System.out.println(n+"th value in Fibonacci using Iteration is " + fibonacciIterative(n));
        sc.close();
    }
}
