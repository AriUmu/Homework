package HWLesson15;

public class UseDictionaryPath2 {

    public static void main(String[] args) {

        Dictionary<String, Integer> callbook = new Dictionary<>();

        callbook.put("Anna", 234);
        callbook.put("Harry", 876);
        callbook.put("Simon", 321);

        for (Dictionary.Pair pair : callbook) {
            System.out.println(pair.key + " счет " + pair.value);
        }

        callbook.delete("Anna");
        callbook.delete("Simon");
        System.out.println();

        for (Dictionary.Pair pair : callbook) {
            System.out.println(pair.key + " счет " + pair.value);
        }

    }
}
