package HWLesson9;

import java.util.LinkedList;

/**
 * Created by arina on 12.07.17.
 */
public class LinkedListTest {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");

        System.out.println(linkedList.toString());

        System.out.println(linkedList.remove(0));

        System.out.println(linkedList.toString());

        linkedList.remove(2);

        System.out.println(linkedList.toString());


    }
}
