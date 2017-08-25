package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInt {

    public static void main(String[] args) {
        Function<String, Integer> init = String::length;
       // System.out.println(init.apply("Hello"));

        Person person1 = new Person("Semen", 40, Arrays.asList("Moscow", "Israel", "Kiev"));
        Person person3 = new Person("Maria", 16, Arrays.asList("Spb", "Novick", "Minsk"));
        Person person4 = new Person("Sasha", 22, Arrays.asList("Paris", "London", "Rybinsk"));
        Person person5 = new Person("Tisha", 36, Arrays.asList("Solovki", "Israel"));


    //    Consumer<Person> consumer = person -> System.out.println(person);
     //   consumer.accept(person1);

        Supplier<Person> person2 = () -> new Person("Petr", 30, Arrays.asList("Grozniy", "Tokio", "Toronto"));
     //   System.out.println(person2.get());

        BinaryOperator<String> operator = (a1,a2)->a1+a2;
       // System.out.println(operator.apply("aaa", "bbb"));

        List<Person> people = new ArrayList<>();
        people.add(person1);
       // people.add((Person) person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

      //  people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println(people);





    }
}


class Person {
    String name;
    int age;
    List<String> geoHistory = new ArrayList<>();

    public Person(String name, int age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getGeoHistory() {
        return geoHistory;
    }

    public void setGeoHistory(List<String> geoHistory) {
        this.geoHistory = geoHistory;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + geoHistory ;

    }
}