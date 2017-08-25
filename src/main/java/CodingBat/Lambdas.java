package CodingBat;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(a -> a+a+a);
        return strings;
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(a -> a % 10);
        return nums;
    }

    public List<String> lower(List<String> strings) {
        strings.replaceAll(a -> a.replaceAll("x", ""));
        return strings;
    }

    public List<String> noYY(List<String> strings) {

        strings.removeIf(a -> a.substring(a.length()-1, a.length()).equals("y"));
        strings.removeIf(a-> a.contains("yy"));
        strings.replaceAll(a -> a +"y");
        return strings;
    }



    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");

        List<Integer> list1 = Arrays.asList(1,22,34,55);

        rightDigit(list1);



        //System.out.println(copies3(list));
        System.out.println(list1);
    }
}
