package HWLesson4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by arina on 04.07.17.
 */
public class GenomeHashCode { //доделать
    private static final int GENOME_SIZE = 100;
    private static final int WORD_SIZE = 3;

    /*

    K - слово
    V - количество
     */
    public static void main(String[] args) {
        byte[] code = GeneratCode.generate(GENOME_SIZE);

       Map<String, Integer> hashMap = new HashMap();


        long start = System.nanoTime();
        for (int i = 0; i < GENOME_SIZE - WORD_SIZE; i++) {
            String word = "";
            for (int j = 0; j < WORD_SIZE ; j++) {
                word += (char) code[i + j];
            }
            System.out.println(word.toString());

            if(hashMap.containsKey(word)){
               Integer value =  hashMap.get(word);
               value++;
               hashMap.put(word,value);
            }
            else{
                hashMap.put(word, 1);
            }
        }
        long finish = System.nanoTime();
        System.out.println("Time " + (finish - start)); //2087412

        //hashMap.forEach(K, V -> System.out.println(K + " " + V));
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        System.out.println("Genome " + hashMap.entrySet() );
    }

}
