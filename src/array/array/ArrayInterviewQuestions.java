package array.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayInterviewQuestions {

	public static BubbleSort bubbleSort = new BubbleSort();       

	// 1. How to find the missing number in integer array of 1 to 100? 
	public static Integer findMissingNumber(int [] array) {
		for(int i=0 ; i<array.length ; i++) {
			if (!(array[i]+1 == (array[i+1]))) {
				return new Integer(array[i]);

			}
		}
		return null;
	}



	// 2. How to find duplicate number on Integer array in Java?
	public static Integer findDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[j]==array[i]) 
					return new Integer(array[i]);
			}
		}
		return null;
	}



	//3. How to check if array contains a number in Java? 


	//4. How to find largest and smallest number in unsorted array?
	public static void findLargestAndSmallest(int[] array) {
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

	//5. How to find all pairs on integer array whose sum is equal to given number? 
	public static void findAllPairsEqualToSum(int[] array,int sum) {
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if ((array[j]+array[i])==sum ) {
					System.out.println(array[j]+ " " +array[i]);}
			}
		  }
		}



	//			6. How to find repeated numbers in an array if it contains multiple duplicates?




	//			7. Write a program to remove duplicates from array in Java? 

	public static void removeDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[j]==array[i])
					while (j<array.length-1) {
						array[j] = array[j+1];
						j++;}
			}
		}
		array =Arrays.copyOf(array, array.length-1);
		SimpleArray.printArray(array);
	}


	// 10.There is an array with every element repeated twice except one. Find that element? 
	public static void everyElementRepeatedTwiceExceptOne(int[] array) {
		List<Integer> tmpList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[j]==array[i]) {
					tmpList.add(j);
					tmpList.add(i);
				}
			}
		}
		Collections.sort(tmpList); 
		for (int i = 0; i < tmpList.size()-1; i++) {
			if (tmpList.get(i)+1 != tmpList.get(i+1)) {
				System.out.println( i + 1);
			}
		}
	}


	// 11. How to find smallest element in unsorted array? 		 
	public static int findSmallestElementInUnsorted(int[] array) {
		int smalles = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]<smalles)
				smalles = array[i]; 
		}
		return smalles;
	}


	public static void printMap(Map mp) {
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	// 13 How to find most common element in array? - NOT WORKING WELL !!!!!

	public static void findMostCommonElement(int[] array) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		Map.Entry<Integer, Integer> maxEntry = null;
		for(int i : array) {
			Integer count = myMap.get(i);
			myMap.put(i, count != null ? count+1 : 0);
		}

		Map.Entry<Integer, Integer> firstEntry = myMap.entrySet().iterator().next();
		int largestKey = firstEntry.getKey();
		Integer largestKeyValue = firstEntry.getValue();

		for (Map.Entry<Integer, Integer> map : myMap.entrySet()) {
			int value = map.getValue();
			if (value > largestKeyValue) {
				largestKey = value;
				//largestKeyValue = map.getValue();
			}
		}
		System.out.println("Largest Key       : " + largestKey);
	}


	// 14. How find the first repeating element in an array of integers? 
	public static int findTheFirstRepeatingElement(int[] array) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[j]==array[i]) {
					tmp = array[j];
					break;
				}
			}
		}
		return tmp;
	}


	// 28. How to reverse array in place in Java? 
	public static void reverseArray(int[] array) {
		int tmpa ;
		for (int i = 0; i < array.length/2; i++) {
			tmpa = array[i] ;
			array[i] = array[(array.length-1)-i];
			array[(array.length-1)-i] = tmpa;
		}
		System.out.println(array[1]);
	}
	
	//	15. How to find first non-repeating element in array of integers?
	public static int findTheFirstNoneRepeatingElement(int[] array) {
		boolean flagForRepeatingElements = false;
		Integer tmp = null ;
		for (int i = 0; i < array.length; i++) {
			flagForRepeatingElements = false;
			for (int j=0; j<array.length; j++) {
				if(j == i) continue;
				if ( array[j] == array[i]) {
					flagForRepeatingElements =true;
					break;}
			}
			if(!flagForRepeatingElements) {
				tmp = array[i];
				break;}
		}
		return tmp;

	}


	
	//How to find top two numbers from an integer array
	public static void findTopTwoNumbers(int[] array) {
		Integer firstTopMaxNumber = null ;
		Integer tmp= null;
		int SecondTopMaxNumber = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[j]>array[i]) {
					firstTopMaxNumber = array[j]; 
					tmp=j;}
			}
		}
		for (int k = 0; k < array.length; k++) {
			for (int l=k+1; l<array.length; l++) {
				if(l == tmp) continue;
				if (array[l]>array[k]) {
					SecondTopMaxNumber = array[l];  }
			}
		} 
		System.out.println(firstTopMaxNumber);
		System.out.println(SecondTopMaxNumber);
	}

	
//	17. How to find the smallest positive integer value
	public static void findTheSmallestPsitiveInt(int[] array) {
		Integer tmp = null;
		for (int i = 1; i < array.length; i++) {
			if (array[i]>0) {
				tmp = array[i];
				break; }
				} 
				for (int j=0 ; j <array.length; j++) {
					if (array[j]>0 && array[j]<tmp)
						tmp = array[j];
				}
				System.out.println(tmp);
			}
		
	
	
			
//			for (int j=i+1; j<array.length; j++) {
//				if (array[j]>0) {
//					if (array[j]<array[i]) {
//						tmp = array[j];}
//					}
//				}
		


	/*
			9. Write a program to find intersection of two sorted arrays in Java?
			10.There is an array with every element repeated twice except one. Find that element? 

			13 How to find common elements in three sorted array? 



	
			
	
			
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

			29. Difference between array and linked list data structure? 
			30. How to check if array contains a duplicate number? 
					 */




				}
