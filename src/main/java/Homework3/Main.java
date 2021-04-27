package Homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        List<String> strArr = new ArrayList<>(Arrays.asList( "Masha",
                "Petya", "Katya", "Sasha", "Dasha",
                "Vova", "Sveta", "Masha", "Sasha", "Oleg",
                "Luda", "Dasha", "Masha", "Nastya", "Vera",
                "Valera", "Artem", "Oleg", "Irina", "Yura"));

        System.out.println("Весь массив: " + strArr);

        Set<String> uniqueArr = new HashSet<>(strArr);
        System.out.println("Уникальные значения: " + uniqueArr);

        Map<String, Integer> sumArr = new HashMap<>();
        for (String s : strArr) {
            int val = sumArr.getOrDefault(s,0) + 1;
            sumArr.put(s, val);
        }
        System.out.println("Сколько раз встречается каждое слово: " + sumArr);

        System.out.println();
        System.out.println("Задание 2");

        Contacts contacts = new Contacts();

        contacts.add("Askarov", "+7987654321");
        contacts.add("Askarov", "+7987654322");
        contacts.add("Khairullin", "+7987654323");
        contacts.add("Ivanov", "+7987654324");
        contacts.add("Ivanov", "+7987654325");
        contacts.add("Ivanov", "+7987654326");
        contacts.add("Pupkin", "+7987654327");
        contacts.add("Mamaev", "+7987654328");
        contacts.add("Kokorin", "+7987654329");

        System.out.println("Askarov: " +contacts.get("Askarov"));
        System.out.println("Khairullin: " +contacts.get("Khairullin"));
        System.out.println("Ivanov: " +contacts.get("Ivanov"));
        System.out.println("Pupkin: " +contacts.get("Pupkin"));
        System.out.println("Mamaev: " +contacts.get("Mamaev"));
        System.out.println("Kokorin: " +contacts.get("Kokorin"));

    }
}
