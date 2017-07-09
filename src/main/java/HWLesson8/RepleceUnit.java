package HWLesson8;

import java.util.Arrays;

/**
 * Created by arina on 09.07.17.
 */
public class RepleceUnit {
    public static String test(String hello, char l, char p) {
        String result = "";
        if(hello.length() == 0){
            return result;
        }
        char[] word = hello.toCharArray();
        for(int i = 0; i < word.length; i++){

            if (l == (word[i])){
                word[i] = p;
            }
            result += word[i];
        }

        return result;
    }
}
