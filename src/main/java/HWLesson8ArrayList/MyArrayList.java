package HWLesson8ArrayList;

import java.util.Arrays;

/**
 * Created by arina on 10.07.17.
 */
public class MyArrayList {

    private static final int DEFAULT_SIZE = 10;
    static int size = 0;

    String[] elenemts = new String[DEFAULT_SIZE];



    public void add(String string) {
        if(size == elenemts.length){
            elenemts = Arrays.copyOf(elenemts, elenemts.length * 2);
        }

        elenemts[size++] = string;
    }

    @Override
    public String toString() {
        return Arrays.toString(elenemts);
    }


    public void remove(int i) {
        if(i >= size || i < 0){
            return;
        }
        System.arraycopy(elenemts, i+1, elenemts, i, size-- -i -1 );
        elenemts[size] = null;
    }

    public String get(int i) {
        if (i > 0 && i < size){
           return elenemts[i];
        }
       return "-1";
    }

    public void set(int i, String string){
        elenemts[i] = string;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

}
