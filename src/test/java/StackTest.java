import HWLesson10.MyStack;

/**
 * Created by arina on 13.07.17.
 */
public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(SimpleUnit.assertEquals(stack.push("one"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("two"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "three"));

        System.out.println(SimpleUnit.assertEquals(stack.size(),2));
        System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("four"), true));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "four"));
        System.out.println(SimpleUnit.assertEquals(stack.size(),3));


        System.out.println(SimpleUnit.assertNOEquals(stack.size(),2));
        System.out.println(SimpleUnit.assertNOEquals(stack.pop(), "four"));
        System.out.println(SimpleUnit.assertNOEquals(stack.size(),3));


        System.out.println(stack.toString());

    }
}
