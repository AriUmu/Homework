package HWLesson8ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by arina on 10.07.17.
 */
public class UseStringArrayList {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");

        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);

        System.out.println(myArrayList.get(1));
        myArrayList.set(1, "five");

        System.out.println(myArrayList);

        System.out.println(myArrayList.size());

        myArrayList.remove(0);
        myArrayList.remove(0);

        myArrayList.remove(0);

        System.out.println(myArrayList);

        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.get(3));






    }
}
