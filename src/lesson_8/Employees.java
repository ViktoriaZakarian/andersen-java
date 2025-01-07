package lesson_8;

public class Employees {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "director", "ivanov@gmail.com",
                "+375297778800", 5000, 55);
        employees[1] = new Employee("Yakovlev Andrei Nikolaevich", "manager", "andre@gmail.com",
                "+375254316755", 3000, 32);
        employees[2] = new Employee("Kotova Anna Alexandrovna", "marketolog", "kotanna@gmail.com",
                "+375336578974", 3000, 28);
        employees[3] = new Employee("Vasiliev Dmitriy Georchievich", "engineer", "dmvasiliev@gmail.com",
                "+375446112578", 2500, 47);
        employees[4] = new Employee("Andreeva Irina Sergeevna", "administrator", "asirina@gmail.com",
                "+375254672290", 2500, 30);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }
        }
    }
}
