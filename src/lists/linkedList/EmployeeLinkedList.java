package lists.linkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
    
    public void addToFront(Employee employee) {
    	EmployeeNode employeeNode = new EmployeeNode(employee);
    	employeeNode.setNext(head);
    	head = employeeNode;
   }

    
    public void addToEnd(Employee employee,EmployeeNode node) {
    	EmployeeNode employeeNode = new EmployeeNode(employee);
    	head = node ;
    	while (head.getNext() != null) {
    		head=head.getNext();
    	}
    	head.setNext(employeeNode);
   }
    
    
    public int sizeOfLinkedLit(EmployeeNode head) {
        int size = 0;   
    	while (head != null) {
    		   head = head.getNext();
        	   size++;
    	    }
    	return size;
    }
    
	public EmployeeNode getHead() {
		return head;
	}

	public void setHead(EmployeeNode head) {
		this.head = head;
	}
    
	public  EmployeeNode removeFromFront(EmployeeNode employeeHead) {
		return  employeeHead.getNext();
	}

	public  void removeFromEnd(EmployeeNode employeeHead) {

	}

	public  void removespecificName(EmployeeNode employeeHead,String name) {

	}

}
