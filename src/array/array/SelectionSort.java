package array.array;

public class SelectionSort {

	/*
	 *  in-palce algorith (we dont create another array)
	 *  O(n^2) complexity
	 */
	
	public void sortBySelection(int[] array) {
	
		     for(int i= array.length-1 ; i>0 ; i--) {
		    	 int largestIndex = 0;
		    	 
		    	 for (int j=1 ; j<=i ; j++) {
		    		 if(array[j]> array[largestIndex]) {
		    			 largestIndex = j;
		    			 
		    		 }
		    	 }
		    	 SimpleArray.swap(array,largestIndex,i);
		     }
	}
	
}
