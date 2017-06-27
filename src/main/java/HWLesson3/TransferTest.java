package HWLesson3;

/**
 * Created by arina on 27.06.17.
 */
public class TransferTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(32,8),"40"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(0,2),"0"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(12,2),"1100"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(95,8),"137"));

        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(31,16),"1F"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(15,8),"17"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(1234,8),"2322"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(1234,16),"4D2"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(0,16),"0"));

        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(256,16),"100"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(256,8),"400"));
        System.out.println(SimpleUnit.assertEquals(Number.toBinaty(256,2),"100000000"));

        System.out.println(SimpleUnit.assertNOEquals(Number.toBinaty(256,16),"150"));
        System.out.println(SimpleUnit.assertNOEquals(Number.toBinaty(256,8),"450"));
        System.out.println(SimpleUnit.assertNOEquals(Number.toBinaty(256,2),"100500000"));
    }
}
