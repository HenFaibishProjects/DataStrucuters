package linkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinedList {

	public LinkedList<Employee> list = new LinkedList<>();
	public static Employee Jane = new Employee("Jane", "Jones", 123);
	public static Employee John = new Employee("John", "Doe", 4567);
	public static Employee Mary = new Employee("Mary", "Smith", 22);
	public static Employee Mike = new Employee("Mike", "Wilson", 3245);
	public static Employee Oren = new Employee("Oren", "Sheli", 7462);



	public JdkLinedList() {
		addDataToList();
	}

	public void addDataToList() {
		list.addFirst(Jane);
		list.addFirst(John);
		list.addFirst(Mary);
		list.addFirst(Mike);
	}

	public void addToFront(Employee employee) {
		list.addFirst(employee);
	}

	public void printTheList() {
		Iterator iter = list.iterator();
		System.out.println("HEAD->");
		while (iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println("<>");
		}
		System.out.println("null");
	}

	public void addtail() {
		Employee bill = new Employee("bill", "lavi", 7462);
		list.addLast (bill); 
	}

	public void removeFirst() {
		list.removeFirst(); 
	}

	public void removeLast() {
		list.removeLast(); 
	}

	public void removeSpecific(Employee employee) {
		list.remove(employee); 
	}
	
}
