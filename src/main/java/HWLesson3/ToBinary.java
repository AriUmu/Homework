package HWLesson3;

/**
 * Created by arina on 03.07.17.
 */
public class ToBinary {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(NumberUnit.toBinary(12),"1100"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toBinary(4),"100"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toBinary(256),"100000000"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toBinary(10),"1010"));


        System.out.println(SimpleUnit.assertNOEquals(NumberUnit.toOctalString(256),"450"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toOctalString(95),"137"));

        System.out.println(SimpleUnit.assertNOEquals(NumberUnit.toOctalString(256),"4560"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toOctalString(1366),"2526"));


        System.out.println(SimpleUnit.assertEquals(NumberUnit.toHexString(31),"1F"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toHexString(136),"88"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toHexString(0),"0"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toHexString(Integer.MAX_VALUE),"7FFFFFFF"));
        System.out.println(SimpleUnit.assertEquals(NumberUnit.toHexString(Integer.MIN_VALUE),"8463847412-"));

        System.out.println(SimpleUnit.assertNOEquals(NumberUnit.toHexString(666),"30A"));


    }
}
