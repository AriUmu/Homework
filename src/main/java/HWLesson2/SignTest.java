package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(SignUnit.sign(3), 1));
        System.out.println(SimpleUnit.assertEquals(SignUnit.sign(0), 0));
        System.out.println(SimpleUnit.assertEquals(SignUnit.sign(-3), -1));
        System.out.println(SimpleUnit.assertEquals(SignUnit.sign(Integer.MIN_VALUE), -1));
        System.out.println(SimpleUnit.assertEquals(SignUnit.sign(Integer.MAX_VALUE), 1));
        System.out.println();
        System.out.println(SimpleUnit.assertNOEquals(SignUnit.sign(3), -1));
        System.out.println(SimpleUnit.assertNOEquals(SignUnit.sign(-3), 0));
        System.out.println(SimpleUnit.assertNOEquals(SignUnit.sign(0), -1));
        System.out.println(SimpleUnit.assertNOEquals(SignUnit.sign(Integer.MAX_VALUE), -1));
    }
}
