package homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 - уникальные слова
        List<String> arrayListWords = new ArrayList<>();
        Collections.addAll(arrayListWords, "рама", "ротор", "переключатель", "обод",
                "ротор", "руль", "втулка", "гидролиния", "колодки", "переключатель", "рама", "вилка",
                "колодки", "седло", "вынос", "руль");
        printDistinctWords(arrayListWords);

        //2 - Телефонный Справочник
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Паршин", "8(915)745-01-40", "+9(965)090-16-01");
        phoneBook.add("Паршин", "45-13-18");
        phoneBook.add("Иванов", "001");
        phoneBook.getPhoneBook("Паршин");


    }
    public static void printDistinctWords(List<String> words) {
        if(words.isEmpty()) {
            System.out.println("Список слов пустой!");
        }
        else {
            HashSet<String> distinctWords = new HashSet<>(words); //была мысль Map использовать,
            // но решение с Set показалось лаконичнее, т.к. наша задача просто вывести уникальные слова и их количество
            System.out.println("Список уникальный слов и количество их повторений:");
            for (String distinctWord : distinctWords) {
                int countWord = 0;
                for (String word : words) {
                    if (distinctWord.equals(word)) {
                        countWord++;
                    }
                }

                System.out.printf("%s - %d%n", distinctWord, countWord);
            }
        }
    }

}
