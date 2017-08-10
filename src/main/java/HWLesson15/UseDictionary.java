package HWLesson15;

import java.util.Random;

public class UseDictionary {
    public static void main(String[] args) {
        Dictionary<String, Integer> callbook = new Dictionary<>();

        long start = System.nanoTime();

        callbook.put("Anna", 234);
        callbook.put("Harry", 876);
        callbook.put("Simon", 321);

        long finish = System.nanoTime();

        System.out.println("Time 1 " + (finish  -start));

//        for (Dictionary.Pair pair : callbook){
//            System.out.println(pair.key + " счет " + pair.value);
//        }


        Dictionary<String, String> d = new Dictionary();
        start  = System.nanoTime();
        d.put("Pin", "NY");
        d.put("John", "Boston");
        d.put("Ari", "Spb");
        d.put("Ari", "London");

        d.put("Masha", "Spb");
        d.put("Poli", "Paris");

        d.put("Archi", "Spb");
        d.put("Sonia", "Chicago");
        d.put("Ivan", "Moscow");
        d.put("Ed", "Tokio");
        finish = System.nanoTime();
        System.out.println("Time 2 " + (finish - start));

//        for (Dictionary.Pair pair : d){
//            System.out.println(pair.key + " : " + pair.value);
//        }

        Dictionary<Integer, Integer> integerDictionary = new Dictionary<>();

        Random r = new Random();
        start  = System.nanoTime();
        for (int i = 0; i < 1000 ; i++) {
            integerDictionary.put(r.nextInt(100), r.nextInt(100));
        }
        finish = System.nanoTime();
        System.out.println("Time 3 " + (finish - start));

        start  = System.nanoTime();
        for (int i = 0; i < 10_000 ; i++) {
            integerDictionary.put(r.nextInt(100), r.nextInt(100));
        }
        finish = System.nanoTime();
        System.out.println("Time 4 " + (finish - start));

        start  = System.nanoTime();
        for (int i = 0; i < 100_000 ; i++) {
            integerDictionary.put(r.nextInt(100), r.nextInt(100));
        }
        finish = System.nanoTime();
        System.out.println("Time 5 " + (finish - start));

        start  = System.nanoTime();
        for (long i = 0; i < 1_000_000 ; i++) {
            integerDictionary.put(r.nextInt(100), r.nextInt(100));
        }
        finish = System.nanoTime();
        System.out.println("Time 6 " + (finish - start));






    }
}
