package array.array;

public class SimpleArray {

	public int[] intArray = new int[10];
	public int[] intOngoingArray = new int[7];
	
	
	public void setArray() {
		intArray[0] =-5;
		intArray[1] =-6;
		intArray[2] =-7;
		intArray[3] =8;
		intArray[4] =9;
		intArray[5] =10;
		intArray[6] =0;
		intArray[7] =-44;
		intArray[8] =1;
		intArray[9] =-215;
		

		
		
		
	
	}
	
	
	
	// Print array
	public static void printArray(int[] anyArray) {
		for (int i=0 ; i< anyArray.length ; i++) {
			System.out.println(anyArray[i]);
		}		
	}

    // Find the value 7
	public void findIndexOfSpecificValue(int[] anyArray,int valueToSearch) {
		int index=-1;
		for (int i=0 ; i< anyArray.length ; i++) {
			if(anyArray[i]==valueToSearch)
				index=i;
			    break;
		}		
		System.out.println(index);
	}

	public int[] getIntArray() {
		return intArray;
	}



	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	
	
	
    public void overAllArray() {
    	setArray();
    	//findIndexOfSpecificValue(intArray, 7);
    	//printArray(intArray);
    	
    }


	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] =tmp;
	}
	
	
}
