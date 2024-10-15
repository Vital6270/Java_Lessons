// Задание 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// Конструктор класса должен заполнять эти поля при создании объекта. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void getEmployeeInfo (){
            System.out.println("Employee's name is: " + name + "\nAge: " + age
                    + "\nPosition: " + position + "\nEmail: " + email + "\nPhone number: " +
                    phoneNumber + "\nSalary: " + salary);
    }
}
