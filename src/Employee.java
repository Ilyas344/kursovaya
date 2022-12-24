import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


public class Employee {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private String surname;
    private String name;
    private String patronymic;
    private double salary;
    private int department;
    private final int id;


    public Employee(String surname, String name, String patronymic, double salary, int department) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        id = COUNTER.getAndIncrement();

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(salary, employee.patronymic);
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + ": " + surname +
                " " + name +
                " " + patronymic +
                ", зарплата = " + salary +
                ", отдел = " + department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, department);
    }

}
