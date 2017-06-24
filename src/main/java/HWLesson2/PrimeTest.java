package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class PrimeTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(13), true));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(2), true));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(17), true));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(23), true));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(61), true));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(4), false));
        System.out.println(SimpleUnit.assertEquals(PrimeUnit.isPrime(30), false));
        System.out.println();
        System.out.println(SimpleUnit.assertNOEquals(PrimeUnit.isPrime(5), false));
        System.out.println(SimpleUnit.assertNOEquals(PrimeUnit.isPrime(8), true));

    }
}
