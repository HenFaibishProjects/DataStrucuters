package lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static List<Employee> employeeList = new ArrayList<>();
	
	public static void createEployeeListWithData() {
		
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
  
	}
	
	public static void printEployeeList() {
		employeeList.forEach(employee -> System.out.println(employee));
	}
	
	
	public static void replaceEmployee() {
		employeeList.set(1, new Employee("John", "Adams", 3235));
	}
	
	public static void replaceEmployeeWithAnotherFromTheList(int existingEmployeeIndex , int newEmployeeIndex) {
		employeeList.set(existingEmployeeIndex,employeeList.get(newEmployeeIndex));
	}
	
	public static void addTpspecificIndex() {
	employeeList.add(2, new Employee("John", "Adams", 3235));
	}
	
	public static void createArrayObjectFromAnotherArray() {
			Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		}
	
	public static void removeIdexFromlist(int indexNumber) {
		employeeList.remove(indexNumber);
		
	}
	
}
