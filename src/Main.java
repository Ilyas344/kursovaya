

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee ivanov = new Employee
                ("Иванов", "Иван", "Иванович", 25000.5, 1);
        Employee petrov = new Employee
                ("Петров", "Андрей", "Иванович", 35000.4, 2);
        Employee sidorov = new Employee
                ("Сидоров", "Александр", "Иванович", 30000.1, 3);
        employees[0] = ivanov;
        employees[1] = petrov;
        employees[2] = sidorov;
        printEmpolyee();
        System.out.println("Сумма затрат за месяц " + sumSalary());
        searchMinEmployee();
        searchMaxEmployee();

        System.out.printf("Средняя зарплата: %.2f %n", searchAverageSalary());
        printFullName();

    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getSurname() + " "
                        + employees[i].getName() + " " + employees[i].getPatronymic());
            }
        }
    }

    public static void printEmpolyee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double searchMin() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = Double.min(min, employees[i].getSalary());
            }
        }
        return min;
    }

    public static double searchMax() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = Double.max(max, employees[i].getSalary());
            }
        }
        return max;
    }

    public static void searchMinEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (searchMin() == employees[i].getSalary()) {

                    System.out.printf("Минимальная зарплата: %s\n", employees[i]);
                }
            }
        }
    }

    public static void searchMaxEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (searchMax() == employees[i].getSalary()) {
                    System.out.printf("Максимальная зарплата: %s\n", employees[i]);
                }
            }
        }
    }

    public static int searchMaxSalary() {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary++;
            }
        }
        return maxSalary;
    }

    public static double searchAverageSalary() {

        double averageSalary = sumSalary() / searchMaxSalary();

        return averageSalary;
    }
}