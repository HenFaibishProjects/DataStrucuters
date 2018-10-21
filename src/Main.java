import array.array.BubbleSort;
import array.array.SelectionSort;
import array.array.SimpleArray;

public class Main {
	
        public static SimpleArray simplearray = new SimpleArray();
        public static BubbleSort bubbleSort = new BubbleSort();
        public static SelectionSort selectionSort = new SelectionSort();
	
        
        
        public static void main(String args[]) {
          simplearray.overAllArray();
          selectionSort.sortBySelection(simplearray.intArray);
          simplearray.printArray(simplearray.intArray);
          bubbleSort.sortByBubble(simplearray.intArray);
          simplearray.printArray(simplearray.intArray);
          
          
        }
	
	

	

}
