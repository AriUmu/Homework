package HackerRank;

import java.util.*;

public class Solutions {


    public static void main(String[] args) {

        final String EMAIL_REGEX = ".*@gmail.com$";

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String email = scanner.next();
            person[i] = new Person(name, email);

        }

        Arrays.stream(person).filter(person4 -> person4.email.matches(EMAIL_REGEX)).sorted((person1, person2) -> person1.name.compareTo(person2.name)).forEach(person3 -> System.out.println(person3.name));
        scanner.close();

    }

}

class Person {
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}