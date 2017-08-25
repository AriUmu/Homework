package HWLesson27Lambda;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.stream.Collectors;



public class FriquencyAnalize {


    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("WarAndPease.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+")); //слово

        long count = words.stream().distinct().count();
        long countWithRepeat = words.stream().count();
        System.out.println("Слов всего " + countWithRepeat);
        System.out.println("Уникальных слов  " + count);

        words.stream().collect(Collectors.toMap(s -> s, n -> 1, (old, newO) -> Integer.sum(old,newO))).forEach((k,v) -> System.out.println(k +" " + v));

    }
}
