package array.array;

public class SimpleArray {

	public int[] intArray = new int[7];
	public int[] intOngoingArray = new int[7];
	
	
	public void setArray() {
		intArray[0] =20;
		intArray[1] =10;
		intArray[2] =0;
		intArray[3] =7;
		intArray[4] =12;
		intArray[5] =17;
		intArray[6] =44;
		
		
		intOngoingArray[0] =6;
		intOngoingArray[1] =7;
		intOngoingArray[2] =8;
		intOngoingArray[3] =10;
		intOngoingArray[4] =11;
		intOngoingArray[5] =12;
		intOngoingArray[6] =13;
		
		
	}
	
	
	
	// Print array
	public void printArray(int[] anyArray) {
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
