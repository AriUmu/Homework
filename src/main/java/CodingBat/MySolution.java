package CodingBat;

public class MySolution {
    private int size = 0;
    private int size2 = 0;
    private char[] stk;
    private char[] que;
    static final int DEFAULT_MAXSIZE = 10;

    MySolution(){
        stk = new char[DEFAULT_MAXSIZE];
        que = new char[DEFAULT_MAXSIZE];
    }


    boolean pushCharacter(char c){//стек
        if(size > stk.length){
            return false;
        }
        stk[size] = c;
        size++;
        return true;
    }

    boolean enqueueCharacter(char c){ //очередь
        if(size2 > que.length){
            return false;
        }
        que[size2] = c;
        size2++;
        return true;
    }

//    char popCharacter(){ //stack
//        if(size <= 0){
//            return nul;
//        }
//        size--;
//        char c = stk[size];
//        stk[size] = null;
//        return c;
//    }
//    char dequeueCharacter(){ //que pop
//        if(size2 <= 0){
//            return null;
//        }
//
//    }


}
