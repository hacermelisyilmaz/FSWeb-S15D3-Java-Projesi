import com.workintech.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Melis", "Yılmaz");
        Employee emp2 = new Employee(2, "Melisa", "Yılmaz");
        Employee emp3 = new Employee(3, "Ayla", "Yılmaz");
        Employee emp4 = new Employee(1, "Behnan", "Temiz");
        Employee emp5 = new Employee(4, "Evrim", "Yılmaz");
        Employee emp6 = new Employee(5, "Miray", "Tunç");
        Employee emp7 = new Employee(2, "Nil", "Gürsoy");

        List<Employee> employeeList = new LinkedList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);

        Map<Integer, Employee> uniqueEmployees = new HashMap<>();
        for (Employee employee: employeeList) {
            uniqueEmployees.put(employee.getId(), employee);
        }
        System.out.println(uniqueEmployees);

        List<Employee> recurringEmployees = new ArrayList<>(employeeList);
        recurringEmployees.removeIf(employee -> uniqueEmployees.get(employee.getId()).equalsForRecurring(employee));
        System.out.println(recurringEmployees);
    }
}