package CourseWork;

import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployeeBook(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Невозможно добавить сотрудника, закончилось место");
        }
        for (int i = 0; i <= size; i++) {
            if (Objects.isNull(employees[i])) {
                employees[i] = employee;
            }
        }
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("ФИО: " + employees[i].getFullName() + ",отдел №" + employees[i].getDepartment() + ", зарплата " + employees[i].getSalary() + " рублей, id:" + employees[i].getId() + "\n");
        }
        return sb.toString();
    }

    public void calculateMaxSalary() {
        double max = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxIndex = i;
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой: " + employees[maxIndex].toString());
    }

    public void calculateMinSalary() {
        double min = employees[0].getSalary();
        int minIndex = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minIndex = i;
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой: " + employees[minIndex].toString());
    }

    public int getCurrentSize() {
        return size;
    }

    public void calculateSumSalaries() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Суммарные затраты на зарплату сотрудников в месяц: " + sum + " рублей");

    }

    public void calculateAverageSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary();
        }
        double averageSalary = sum / size;
        System.out.printf("Средняя зарплата в компании составила %.2f рублей \n", averageSalary);
    }

    public void printFullName() {
        for (int i = 0; i < size; i++) {
            System.out.println("ФИО: " + employees[i].getFullName());
        }
    }

    public void indexSalaries(double index) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            employees[i].setSalary(employees[i].getSalary() * (1 + index / 100));
            System.out.println("ФИО: " + employee.getFullName() + ", новая зарплата после индексации " + employee.getSalary());
        }
    }

    public void calculateMaxSalaryForDepartment(int department) {
        double maxSalaryForDepartment = 0;
        int indexOfMaxSalaryForDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalaryForDepartment) {
                    maxSalaryForDepartment = employees[i].getSalary();
                    indexOfMaxSalaryForDepartment = i;
                }
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой в департаменте №" + department + ": " + employees[indexOfMaxSalaryForDepartment].toString());
    }

    public void calculateMinSalaryForDepartment(int department) {
        double minSalaryForDepartment = 0;
        //запускаем цикл для определения зарплаты первого сотрудника в департаменте, чтобы принять за минимальное значение для сравнения
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                minSalaryForDepartment = employees[i].getSalary();
                break;
            }
        }
        int indexOfMinSalaryForDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalaryForDepartment) {
                    minSalaryForDepartment = employees[i].getSalary();
                    indexOfMinSalaryForDepartment = i;
                }
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой в департаменте №" + department + ": " + employees[indexOfMinSalaryForDepartment].toString());
    }

    public void calculateSumSalariesForDepartment(int department) {
        double sumSalariesForDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalariesForDepartment = sumSalariesForDepartment + employees[i].getSalary();
            }
        }
        System.out.println("Суммарные затраты на зарплату сотрудников для отдела №" + department + " составили " + sumSalariesForDepartment + " рублей");
    }

    public void calculateAverageSalaryForDepartment(int department) {
        int numberEmployeesInDepartment = 0;
        double sumSalariesForDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                numberEmployeesInDepartment++;
                sumSalariesForDepartment = sumSalariesForDepartment + employees[i].getSalary();
            }
        }
        double averageSalary = sumSalariesForDepartment / numberEmployeesInDepartment;
        System.out.print("Средняя зарплата в отделе №" + department + " составила ");
        System.out.printf("%.2f рублей \n", averageSalary);
    }

    public void indexSalariesForDepartment(int department, double index) {
        System.out.println("Индексация зарплат в отделе №" + department);
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * (1 + index / 100));
                System.out.println("ФИО: " + employees[i].getFullName() + ", новая зарплата после индексации " + employees[i].getSalary());
            }
        }
    }

    public void printFullNameForDepartment(int department) {
        System.out.println("В департаменте №" + department + " работают: ");
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("ФИО: " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей, id:" + employees[i].getId());
            }
        }
    }

    public void findEmployeesWithSalaryLower(double salary) {
        System.out.println("Список сотрудников с зарплатой, ниже " + salary + " рублей");
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("ФИО: " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей, id:" + employees[i].getId());
            }
        }
    }

    public void findEmployeesWithSalaryHigher(double salary) {
        System.out.println("Список сотрудников с зарплатой, выше " + salary + " рублей");
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("ФИО: " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей, id:" + employees[i].getId());
            }
        }
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                for (int j = 0; j < size - i - 1; j++) {
                    employees[j + i] = employees[i + j + 1];
                }
            }
        }
        employees[size - 1] = employees[size];
        employees[size] = null;
        size = size - 1;
        System.out.println("Сотрудник " + fullName + " удален из книги сотрудников");
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                for (int j = 0; j < size - i - 1; j++) {
                    employees[j + i] = employees[i + j + 1];
                }
            }
        }
        employees[size - 1] = employees[size];
        employees[size] = null;
        size = size - 1;
        System.out.println("Сотрудник с id" + id + " удален из книги сотрудников");
    }

    public void changeSalary(String fullName, double newSalary) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(newSalary);
                index = i;
            }
        }
        System.out.println("Сотрудник " + fullName + ", новая зарплата: " + employees[index].getSalary());
    }

    public void changeDepartment(String fullName, int newDepartment) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDepartment);
                index = i;
            }
        }
        System.out.println("Сотрудник " + fullName + ", новый отдел: " + employees[index].getDepartment());
    }

    public void printEmployeesByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники отдела №"+i);
            for (int j = 0; j < size; j++) {
                if (employees[j].getDepartment() == i) {
                    System.out.println("ФИО: "+employees[j].getFullName());
                }
            }
        }
    }
}

