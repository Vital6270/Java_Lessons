import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
// и телефонных номеров. В этот телефонный справочник с помощью метода add() можно
// добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class PhoneBook {
    private Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String phoneNumber, String lastName) {
        book.putIfAbsent(lastName, new ArrayList<>());
        book.get(lastName).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String lastName) {
        return book.getOrDefault(lastName, new ArrayList<>());
    }
}
