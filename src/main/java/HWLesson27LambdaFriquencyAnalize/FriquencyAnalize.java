package HWLesson27LambdaFriquencyAnalize;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class FriquencyAnalize {


    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("src/main/java/WarAndPease.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+")); //слово

        long count = words.stream().distinct().count();
        long countWithRepeat = words.stream().count();
        System.out.println("Слов всего " + countWithRepeat);
        System.out.println("Уникальных слов  " + count);

        Arrays.asList(contents.split("[\\P{L}]+"))
                .stream()
                .collect(toMap(s -> s, n -> 1, (old, newO) -> Integer.sum(old,newO)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(item -> System.out.println(item.getKey() + " " + item.getValue()));
    }
}
