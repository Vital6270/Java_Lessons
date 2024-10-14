// Задание 2. Создать массив из 5 сотрудников. Пример: вначале объявляем массив объектов
// Person[] persArray = new Person[5]; потом для каждой ячейки массива задаем объект
// persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// persArray[1] = new Person(...); ... persArray[4] = new Person(...);

public class Main {
    Park park1 = new Park("Great", 5.8,15);
    Park.Attraction attr1 = new Park.Attraction("Карусель", "09.00 - 18.00", 2.5);
    Park.Attraction attr2 = new Park.Attraction("Лодочка", "10.00 - 18.00", 1.5);

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Sidorov Petr", "Tester",
                "sidorov@mailbox.com", "872315348", 20000, 40);
        persArray[2] = new Employee("Grebenko Evgeni", "Teacher",
                "evgeni1@mailbox.com", "872315348", 24000, 35);
        persArray[3] = new Employee("Petrova Irina", "Student",
                "irinap@mailbox.com", "872315348", 26000, 18);
        persArray[4] = new Employee("Avdeenko Petr", "Driver",
                "avdeenkop@mailbox.com", "872315348", 10000, 54);

        Employee employee1 = new Employee("Anisimov Petr", "Tester",
                "anp1@mailbox.com", "872310044", 12000, 19);

        // проверяем работу метода
        employee1.getEmployeeInfo(employee1);
        persArray[2].getEmployeeInfo(persArray[2]);

    }
}
