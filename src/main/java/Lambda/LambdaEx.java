package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("o");
        list.add("f");
        list.add("t");
        list.add("l");
        list.add("m");

        list.sort(String::compareTo);

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();

        list1.add(6);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(1);
        list1.sort(Integer::compareTo);

        System.out.println(list1);

    }
}
