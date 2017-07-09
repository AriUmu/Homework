package HWLesson8;

/**
 * Created by arina on 09.07.17.
 */
public class ReplaceTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(RepleceUnit.test("Hello", 'l','p'), "Heppo"));
        System.out.println(SimpleUnit.assertEquals(RepleceUnit.test("", 'l','p'), ""));
        System.out.println(SimpleUnit.assertEquals(RepleceUnit.test("Welcome", 'b','p'), "Welcome"));
    }
}
