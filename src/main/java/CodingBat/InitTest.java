package CodingBat;

import java.util.Stack;

public class InitTest{
    public InitTest(){
        s1 = sM1("1");
    }
    static String s1 = sM1("a");
    String s3 = sM1("2");{
        s1 = sM1("3");
    }
    static{
        s1 = sM1("b");
    }
    static String s2 = sM1("c");
    String s4 = sM1("4");
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
}


 class TestClass
 {    public static void main(String args[ ] ){       int i, j, k;       i = j = k = 9;       System.out.println(i);    } }



class TestClass1{

    public static void main(String args[]){
        Stack s1 = new Stack ();
        Stack s2 = new Stack ();
        processStacks (s1,s2);
        System.out.println (s1 + "    "+ s2);
    }
    public static void processStacks(Stack x1, Stack x2){
        x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
        x2 = x1;
    }
}



class StringFromChar {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };
        String newStr = "";
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

        System.out.println(newStr);
        System.out.println(myStr);
    } }
