package HWLesson10;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by arina on 13.07.17.
 */
public class MyStack {

    private String[] elements;
    private int size = 0;

    public static final int DEFAULT_MAXSIZE = 10;

    public MyStack() {
        this(DEFAULT_MAXSIZE);
    }

    public MyStack(int maxSize) {
        elements = new String[maxSize];
    }


    public boolean push(String one) {
        boolean flag = false;
       if(size >= elements.length ){
           return flag;
       }
       size++;
       elements[size] = one;
       return !flag;
    }

    public String pop(){
        String result;
        if(size > 0){
            result = elements[size];
            elements[size] = null;
            size--;
            return result;
        }
        else return null;
    }

    public int size(){
        return size;
    }

    public String tos(){
        return size <=0 ? null : elements[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements,1,size+1));
    }

}
