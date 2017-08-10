package HWLesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary<T, U> implements Iterable<Dictionary.Pair> {

    public static final int MAX = 4;
    private int sizeOfMap = 0;
    private int capacity = 0;

    List<Pair>[] data;

    public Dictionary(int maxSize) {
        capacity = maxSize;
        data = new List[maxSize];
    }

    public Dictionary() {
        this(MAX);
    }

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Pair>() {

            int currentElement = -1;
            Iterator<Pair> listiterator = null;

            @Override
            public boolean hasNext() { //определяет есть ли след значение

                if (listiterator != null && listiterator.hasNext()) {
                    return true;
                }

                listiterator = null;


                for (++currentElement; listiterator == null && currentElement < data.length; currentElement++) { //находим первое вхождение
                    List<Pair> list = data[currentElement];
                    if (list == null) {
                        continue;
                    }
                    listiterator = list.iterator();
                    if (!listiterator.hasNext()) {
                        continue;
                    }
                    return listiterator.hasNext();
                }
                return false;
            }

            @Override
            public Pair next() {
                return listiterator.next();
            }
        };
    }

    public static class Pair<T, U> {
        T key;
        U value;

        public Pair(T key, U value) {
            this.key = key;
            this.value = value;
        }
    }


    /*
    переделать в дженерик +
    Если в таблицу не хватает места - расширить таблицу +
    Избавиться от повторного высчитывания хэш-кода
    banchmark - скорость выполнения от 1000 до 100_000
     */


    public void put(T key, U value) {

        if (sizeOfMap > capacity * 0.75) {
            data = resize(capacity);
        }

        //2 version
//        List<String> list = data[index];
//        if(list == null){
//            list = new ArrayList<>();
//            data[index] = list;
//        }
//        list.add();




        int index = hash(key); //вычисляем индекс пары

        if (data[index] == null) { //избавиться от повторного высчитывания хэш-кода
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(key);//тут тоже вычисляем хэш
        if (pair == null) {
            data[index].add(new Pair(key, value));
            sizeOfMap++;
            return;
        }
        pair.value = value;
    }

    private List<Pair>[] resize(int capacity) {

        List<Pair>[] data1 = new List[capacity * 2]; //новая карта

        data1 = data;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                for (Pair pair : data[i]) {
                    int m = 0;
                    Pair buff = data[i].get(m); //получаем пару
                    m++;

                    int index = hash((T) buff.key);

                    if (data1[index] == null) {
                        data1[index] = new ArrayList<>();
                    }

                    Pair pair1 = getPair((T) buff.key); //записываем в новую карту пары
                    if (pair1 == null) {
                        data1[index].add(new Pair(buff.key, buff.value));
                        sizeOfMap++;
                    }
                    pair1.value = buff.value;
                }
            }
        }
        return data;
    }

    private int hash(T key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    public U get(T key) {
        Pair pair = getPair(key);
        return pair == null ? null : (U) pair.value;

    }

    public Pair getPair(T key) {

        int index = hash((T) key);


        List<Pair> list = data[index];
        if (list == null) {
            return null;
        }
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }
        return null;
    }


}









