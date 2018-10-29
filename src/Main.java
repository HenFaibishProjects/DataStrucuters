import array.array.ArrayInterviewQuestions;
import array.array.BubbleSort;
import array.array.MergeSort;
import array.array.Recorsion;
import array.array.SelectionSort;
import array.array.SimpleArray;

public class Main {
	
        public static SimpleArray simplearray = new SimpleArray();

        
        
        public static void main(String args[]) {
          simplearray.overAllArray();
//          selectionSort.sortBySelection(simplearray.intArray);
//          simplearray.printArray(simplearray.intArray);
//          bubbleSort.sortByBubble(simplearray.intArray);
//          simplearray.printArray(simplearray.intArray);
//        	System.out.println(Recorsion.interivelFindHowManyZeroOnArray(simplearray.intArray));
//          ArrayInterviewQuestions.findMissingNumber(simplearray.intOngoingArray);       	
//          ArrayInterviewQuestions.findLargestAndSmallest(simplearray.intArray);
            ArrayInterviewQuestions.findAllPairsEqualToSum(simplearray.intArray,1);
      
        }
	
	

	

}
