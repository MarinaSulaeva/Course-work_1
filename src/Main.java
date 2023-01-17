import CourseWork.Employee;
import CourseWork.EmployeeBook;

public class Main {
    public static void main(String[] args) {
        // создаем сотрудников
        Employee theFirst = new Employee("Иванов Иван Иванович", 4, 43000.00);
        Employee theSecond = new Employee("Cеменов Семен Семенович", 1, 55000.00);
        Employee theThird = new Employee("Никитин Никита Никитьевич", 2, 61000.00);
        Employee theFourth = new Employee("Федоров Федор Федорович", 2, 35000.00);
        Employee theFifth = new Employee("Васильев Василий Васильевич", 3, 74000.00);
        Employee theSixth = new Employee("Викторов Виктор Викторович", 5, 86000.00);
        Employee theSeventh = new Employee("Дмитриев Дмитрий Дмитриевич", 4, 28000.00);
        //создаем книгу сотрудников и добавляем туда сотрудников
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployeeBook(theFirst);
        employeeBook.addEmployeeBook(theSecond);
        employeeBook.addEmployeeBook(theThird);
        employeeBook.addEmployeeBook(theFourth);
        employeeBook.addEmployeeBook(theFifth);
        employeeBook.addEmployeeBook(theSixth);
        employeeBook.addEmployeeBook(theSeventh);
        //проверяем работу методов книги сотрудников
        System.out.println(employeeBook);
        employeeBook.calculateMaxSalary();
        employeeBook.calculateMinSalary();
        employeeBook.calculateSumSalaries();
        employeeBook.calculateAverageSalary();
        employeeBook.printFullName();
        employeeBook.indexSalaries(7);
        employeeBook.indexSalariesForDepartment(2,4);
        employeeBook.calculateAverageSalaryForDepartment(4);
        employeeBook.calculateMinSalaryForDepartment(2);
        employeeBook.calculateMaxSalaryForDepartment(4);
        employeeBook.calculateSumSalariesForDepartment(2);
        employeeBook.printFullNameForDepartment(4);
        employeeBook.findEmployeesWithSalaryLower(50000);
        employeeBook.findEmployeesWithSalaryHigher(40000);
        employeeBook.removeEmployee(3);
        System.out.println(employeeBook);
        employeeBook.changeSalary("Дмитриев Дмитрий Дмитриевич", 35000);
        employeeBook.changeDepartment("Иванов Иван Иванович", 5);
        System.out.println(employeeBook);
        employeeBook.printEmployeesByDepartment();


    }
}