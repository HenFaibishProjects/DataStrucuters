package linkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
    
    public void addToFront(Employee employee) {
    	EmployeeNode employeeNode = new EmployeeNode(employee);
    	employeeNode.setNext(head);
    	head = employeeNode;
   }
    

}
