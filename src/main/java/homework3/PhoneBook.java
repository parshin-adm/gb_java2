package homework3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private ArrayList<String> phoneNumbers;
    private final Map<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String family, String... numbers) {
        checkFamily(family);
        for (String number : numbers) {
            addPhoneNumbers(family, number);
        }

    }
    public void add(String family, String number) {
            checkFamily(family);
            addPhoneNumbers(family, number);

    }

    private void addPhoneNumbers(String family, String number) {
            if (isPhoneNumbers(number)) {
                phoneNumbers.add(number);
                phoneBook.put(family, phoneNumbers);
            }
    }

    private boolean isFamilyNotNull(String family) {
        if(Objects.equals(family, null)) {
            System.out.println("Ошибка добавления фамилии! Фамилия не может быть равна null");
            return false;
        }
        return true;

    }

    private boolean isNumberNotNull(String number) {
        if(Objects.equals(number, null)) {
            System.out.println("Ошибка добавления номера! Номер не может быть равен null");
            return false;
        }
        return true;

    }

    private void checkFamily(String family) {
        if(isFamilyNotNull(family)) {
            if (isCreateFamily(family)) {
                phoneNumbers = new ArrayList<>();
            } else {
                phoneNumbers = phoneBook.get(family);
            }
        }
    }

    private boolean isCreateFamily(String family) {
        for (String f : phoneBook.keySet()){
            if(f.equals(family))
                return false;
        }
        return true;
    }

    public void getPhoneBook(String family){
        for(Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            if(family.equals(entry.getKey())){
                System.out.print(family + " - тел.: ");
                entry.getValue().forEach(e -> System.out.print(e + ";  "));
            }
        }
    }


    private boolean isPhoneNumbers(String number){ //простейшая проверка на может ли строка быть номером
        if(isNumberNotNull(number)) {
            char[] charsNumber = number.trim().toCharArray();
            Pattern p = Pattern.compile("[\\d]|-|\\+|\\)|\\(");
            Matcher m;
            for (char c : charsNumber) {
                m = p.matcher(String.valueOf(c));
                if (!m.matches()) {
                    System.out.println(number + " - не является номером");
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}
