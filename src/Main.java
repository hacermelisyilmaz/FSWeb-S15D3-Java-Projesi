import com.workintech.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** TASK 1: COMPANY *****");

        Employee emp1 = new Employee(1, "Melis", "Yılmaz");
        Employee emp2 = new Employee(2, "Melisa", "Yılmaz");
        Employee emp3 = new Employee(3, "Ayla", "Yılmaz");
        Employee emp4 = new Employee(1, "Behnan", "Temiz");
        Employee emp5 = new Employee(4, "Evrim", "Yılmaz");
        Employee emp6 = new Employee(5, "Miray", "Tunç");
        Employee emp7 = new Employee(2, "Nil", "Gürsoy");

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println("** FULL EMPLOYEE LIST **\n" + employeeList);

        Map<Integer, Employee> uniqueEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            uniqueEmployees.put(employee.getId(), employee);
        }
        System.out.println("** UNIQUE EMPLOYEES LIST **\n" + uniqueEmployees);

        List<Employee> recurringEmployees = new ArrayList<>(employeeList);
        recurringEmployees.removeIf(employee -> uniqueEmployees.get(employee.getId()).equalsForRecurring(employee));
        System.out.println("** RECURRING EMPLOYEES LIST **\n" + recurringEmployees);

        System.out.println("***** TASK 2: WORD COUNT *****");

        String text = "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff resistance in the battles of First and Second İnönü," + " due to İsmet Pasha's organization of an irregular militia into a regular army. " + " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara and Istanbul were represented, but Greece refused." + " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more forces on the West against the Greeks." + " They also began to receive support from Soviet Union, as well as France and Italy, who sought to check British influence in the Near East.\n" + " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, their last line of defence." + " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander in chief as well as his political duties." + " The decision was made in the Greek military command to march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." + " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, which ended in Greek withdrawal." + " Almost of year of stalemate without much fighting followed, during which Greek moral and discipline faltered while Turkish strength increased." + " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, which Mustafa Kemal refused.";

        String textWithoutPunctuation = text.replaceAll("[.,?!]", "");
        textWithoutPunctuation = textWithoutPunctuation.replaceAll("[–']", " ");
        System.out.println(textWithoutPunctuation);

        String[] words = textWithoutPunctuation.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word: words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}