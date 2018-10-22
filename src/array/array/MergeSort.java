package array.array;

public class MergeSort {
	
	public static  SimpleArray simplearray = new SimpleArray();
//	public static void mergeSortImplement(int [] array ) {
//		mergeSortImplement(array,new int[array.length] , 0,array.length-1);
//	}
//	
	public static void mergeSortImplement(int [] array, int[] tmpArray,int leftStart ,int rightStart) {
		if (leftStart>= rightStart) {
			simplearray.printArray(array);
			return;
		}
		int middle = (leftStart + rightStart) /2;
		mergeSortImplement(array ,tmpArray ,leftStart, middle);
		mergeSortImplement(array ,tmpArray,middle+1, rightStart);
		mergeHalves(array ,tmpArray,leftStart, rightStart);
		simplearray.printArray(tmpArray);
		
		
	}

	private static void mergeHalves(int[] array,int[] tmpArray, int leftStart, int rightEnd) {
         int leftEnd = (rightEnd + leftStart) /2;
         int rightStrat = rightEnd +1;
         int size = rightEnd - leftStart;
         
         int left = leftStart;
         int right = rightStrat;
         int index = leftStart;
         
         
         while (left<=leftEnd && right <= rightEnd) {
        	 if (array[left] <= array[right]) {
        		 tmpArray[index] = array[right];
        		 right++;
        	 }
        	 index++;
         }
         System.arraycopy(array,    left,      tmpArray, index, leftEnd - left  +1);
         System.arraycopy(array,    right,     tmpArray, index, rightEnd - right  +1);
         System.arraycopy(tmpArray, leftStart, array, leftStart, size);

         
	}
       
}
