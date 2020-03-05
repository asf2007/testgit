package les3;

import java.util.Set;

public class Main3Task2 {



        public static void main(String[] args) {
            ITelBook phoneBook = new TelBook();
            phoneBook.add("Semenov", "222-77-77");
            phoneBook.add("Sysoev", "333-33-55");
            phoneBook.add("Flyagin", "111-11-11");
            phoneBook.add("Senichev", "555-32-86");

            Set<String> allSurnames = phoneBook.getAllSurnames();
            for (String surname : allSurnames) {
                Set<String> phones = phoneBook.get(surname);
                System.out.printf("%s: %s%n", surname, phones);
            }
        }

    }

