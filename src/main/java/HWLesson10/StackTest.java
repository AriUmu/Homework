package HWLesson10;

import HWLesson10.MyStack;
import HWLesson10.SimpleUnit;

/**
 * Created by arina on 13.07.17.
 */
public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        MyStack stack1 = new MyStack(7);

        System.out.println(SimpleUnit.assertEquals(stack.push("one"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("two"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "three"));

        System.out.println(SimpleUnit.assertEquals(stack.size(),2));
        System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("four"), true));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "four"));
        System.out.println(SimpleUnit.assertEquals(stack.size(),3));

        System.out.println(SimpleUnit.assertEquals(stack.push("four"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("five"), true));
        System.out.println(SimpleUnit.assertEquals(stack.push("six"), true));

        System.out.println(SimpleUnit.assertEquals(stack.tos(),"six"));


        System.out.println(SimpleUnit.assertNOEquals(stack.size(),2));
        System.out.println(SimpleUnit.assertNOEquals(stack.pop(), "four"));//three
        System.out.println(SimpleUnit.assertNOEquals(stack.size(),3)); //2


        System.out.println(SimpleUnit.assertEquals(stack1.push("one"), true));
        System.out.println(SimpleUnit.assertEquals(stack1.push("two"), true));
        System.out.println(SimpleUnit.assertEquals(stack1.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack1.pop(), "three"));


        System.out.println(stack.toString());
        System.out.println(stack1.toString());

    }
}
