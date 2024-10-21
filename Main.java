// Задание 2. Создать массив из 5 сотрудников. Пример: вначале объявляем массив объектов
// Person[] persArray = new Person[5]; потом для каждой ячейки массива задаем объект
// persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// persArray[1] = new Person(...); ... persArray[4] = new Person(...);

public class Main {
    public static void main(String[] args) {

        Park park1 = new Park("The Greatest", 5.8,15);
        Park.Attraction attr1 = new Park.Attraction("Карусель", "09.00 - 18.00", 2.5);
        Park.Attraction attr2 = new Park.Attraction("Лодочка", "10.00 - 18.00", 1.5);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "+892312312", 3000, 30);
        persArray[1] = new Employee("Sidorov Petr", "Tester",
                "sidorov@mailbox.com", "+872315348", 2800, 28);
        persArray[2] = new Employee("Grebenko Evgeni", "Teacher",
                "evgeni1@mailbox.com", "+872315348", 950, 35);
        persArray[3] = new Employee("Petrova Irina", "Student",
                "irinap@mailbox.com", "+872315348", 200, 18);
        persArray[4] = new Employee("Avdeenko Petr", "Driver",
                "avdeenkop@mailbox.com", "+872315348", 2300, 54);

        Employee employee1 = new Employee("Anisimov Petr", "Tester",
                "anp1@mailbox.com", "+872310044", 1200, 19);

        Employee employee2 = new Employee("Simonova Galina", "SMM specialist",
                "simgalya@yandex.ru","+375297161514", 450, 23);

        // проверяем работу метода getEmployeeInfo()
        employee1.getEmployeeInfo();
        System.out.println("---------NEXT---------");
        persArray[2].getEmployeeInfo();
        System.out.println("---------NEXT---------");
        employee2.getEmployeeInfo();

    }
}
