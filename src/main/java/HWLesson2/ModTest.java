package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(10,2), 0));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(10,3), 1));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(1100,1000), 100));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(Integer.MAX_VALUE,2), 1));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(-10,2), 0));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(-10,5), 0));
        System.out.println(SimpleUnit.assertEquals(ModUnit.mod(-36,7), -1));
        System.out.println();

        System.out.println(SimpleUnit.assertNOEquals(ModUnit.mod(-36,-7), 0));
        System.out.println(SimpleUnit.assertNOEquals(ModUnit.mod(100,5), 3));


    }
}
