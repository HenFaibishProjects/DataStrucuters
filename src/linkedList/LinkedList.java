package linkedList;



public class LinkedList {

	public static Employee Jane = new Employee("Jane", "Jones", 123);
	public static Employee John = new Employee("John", "Doe", 4567);
	public static Employee Mary = new Employee("Mary", "Smith", 22);
	public static Employee Mike = new Employee("Mike", "Wilson", 3245);
	public static Employee Oren = new Employee("Oren", "Sheli", 7462);
	
	public static EmployeeNode head;
	
	public static void createEployeeLinkedList() {
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		employeeLinkedList.addToFront(Jane);
		employeeLinkedList.addToFront(John);
		employeeLinkedList.addToFront(Mary);
		employeeLinkedList.addToFront(Mike);
		head = employeeLinkedList.getHead();
		
	}
	
	public static void addEployeeLinkedList() {
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		employeeLinkedList.addToEnd(Oren,head); 
		}
	
	public static void removeFirstItem() {
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		head = employeeLinkedList.removeFromFront(head);
		
	}
	
	
	public static void revertLinkedList(EmployeeNode employeeHead) {
		
		EmployeeNode newNode = null;
		EmployeeNode tmp = head;
		
		    while (tmp.getNext()!=null) {
		    	EmployeeNode node = new EmployeeNode();
		    	node.setEmployee(tmp.getEmployee());
		    	node.setNext(newNode);
			    newNode = node ;
			    tmp = tmp.getNext();
		}
	}
	
	public boolean isEmpty(EmployeeNode employeeHead) {
		if ((employeeHead.getEmployee()==null))
			return true;
		return false;
	}
	
	
	public static void printSizeOfLinkedList() {
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		System.out.println(employeeLinkedList.sizeOfLinkedLit(head));
		
	}
	
	public static void printLinkedList() {
		EmployeeNode current = head;
		System.out.print("H e a d =   ");
		   System.out.print(head.toString()+  " " + "->" + " " );
     	 while(head.getNext() != null){
     		   current = current.getNext();
     		   head = current;
     		   System.out.print(current.toString() + " " + "->" + " " );
     	 }
     	System.out.print("null");
	}
	

	
}
