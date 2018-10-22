package array.array;

public class ArrayInterviewQuestions {
	
	public static BubbleSort bubbleSort = new BubbleSort();       
	
	        // 1. How to find the missing number in integer array of 1 to 100? 
	         public static int findMissingNumber(int [] array) {
	        	 for(int i=0 ; i<array.length ; i++) {
	        		 if (!(array[i]+1 == (array[i+1]))) {
	        			 System.out.println(array[i]);
	        			 return array[i];
	        		 }
	        	 }
	        	 System.out.println(-1);
				return -1;
	         }

	        
	         
	        // 2. How to find duplicate number on Integer array in Java?
	                
	        
	        
	        	
			//3. How to check if array contains a number in Java? 
	         public static void sortByBubble(int[] array) {
	        	 int smallest = 0;
	        	 int largest = 0;
	        	 for (int i = 0; i < array.length; i++) {
	        		 for (int j=i+1; j<array.length; j++) {
	        			 if (array[j]<array[i]) {
	        				 smallest = array[j];
	        			 }
	        			 if (array[j]>array[i]) {
	        				 largest = array[j];
	        			 }
	        			 
	        		 }
	        		 
	        	 }
	        	 System.out.println("largest is: " + largest +  "  Smallest is: " + smallest);
	         }
	        			 /*
			4. How to find largest and smallest number in unsorted array?
			5. How to find all pairs on integer array whose sum is equal to given number? 
			6. How to find repeated numbers in an array if it contains multiple duplicates?
			7. Write a program to remove duplicates from array in Java? 
			8. How to sort an array in place using QuickSort algorithm? 
			9. Write a program to find intersection of two sorted arrays in Java?
			10.There is an array with every element repeated twice except one. Find that element? 
			11. How to find smallest element in unsorted array? 
			12. How to find largest element in unsorted array? 
			13 How to find common elements in three sorted array? 
			14. How find the first repeating element in an array of integers? 
			15. How to find first non-repeating element in array of integers?
			16. How to find top two numbers from an integer array? 
			17. How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? 
			18. How to rearrange array in alternating positive and negative number? (
			19. How to find if there is a sub array with sum equal to zero? 
			20. How to remove duplicates from array in place? 
			21. How to remove a given element from array in Java? (solution)
			22. How to merge sorted array? 
			23. How to find sub array with maximum sum in an array of positive and negative number? sub-array within an array (containing at least one number) which has the largest sum.
			24. How to find sub array with largest product in array of both positive and negative number?
			25. Write a program to find length of longest consecutive sequence in array of integers? 
			26. How to find minimum value in a rotated sorted array? 
			27. Given an array of of size n and a number k, find all elements that appear more than n/k times? (
			28. How to reverse array in place in Java? 
			29. Difference between array and linked list data structure? 
			30. How to check if array contains a duplicate number? 
	        */
			


			
}
