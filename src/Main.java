

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee ivanov = new Employee
                ("Иванов", "Иван", "Иванович", 25000.0, 1);
        Employee petrov = new Employee
                ("Петров", "Андрей", "Иванович", 35000.0, 2);
        Employee sidorov = new Employee
                ("Сидоров", "Александр", "Иванович", 30000.0, 3);
        employees[0] = ivanov;
        employees[1] = petrov;
        employees[2] = sidorov;
        printEmpolyee(employees);
        System.out.println("Сумма затрат за месяц " + sumSalary(employees));
        searchMinEmployee(employees, searchMin(employees));
        searchMaxEmployee(employees, searchMin(employees));

        System.out.println("Средняя зарплата: " +
                (searchAverageSalary(searchMaxGetId(employees), sumSalary(employees))));
        printFullName(employees);

    }

    public static void printFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getSurname() + " "
                        + employees[i].getName() + " " + employees[i].getPatronymic());
            }
        }
    }

    public static void printEmpolyee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double sumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double searchMin(Employee[] employees) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = Double.min(min, employees[i].getSalary());
            }
        }
        return min;
    }

    public static double searchMax(Employee[] employees) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = Double.max(max, employees[i].getSalary());
            }
        }
        return max;
    }

    public static void searchMinEmployee(Employee[] employees, double min) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (searchMin(employees) == employees[i].getSalary()) {

                    System.out.printf("Минимальная зарплата: %s\n", employees[i]);
                }
            }
        }
    }

    public static void searchMaxEmployee(Employee[] employees, double max) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (searchMax(employees) == employees[i].getSalary()) {
                    System.out.printf("Максимальная зарплата: %s\n", employees[i]);
                }
            }
        }
    }

    public static int searchMaxGetId(Employee[] employees) {
        int MaxId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                MaxId++;
            }
        }
        return MaxId;
    }

    public static double searchAverageSalary(int MaxId, double sum) {

        double averageSalary = sum / MaxId;

        return averageSalary;
    }
}