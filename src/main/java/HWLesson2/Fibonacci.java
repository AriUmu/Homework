package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(0), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(1), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(2), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(3), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(4), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(13), true));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(34), true));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(55), true));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(16), false));
        System.out.println(SimpleUnit.assertEquals(FibonacciUnit.isFibonacci(156), false));
        System.out.println();

        System.out.println(SimpleUnit.assertNOEquals(FibonacciUnit.isFibonacci(13), false));
        System.out.println(SimpleUnit.assertNOEquals(FibonacciUnit.isFibonacci(16), true));
    }
}
