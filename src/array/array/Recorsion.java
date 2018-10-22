package array.array;

public class Recorsion {

	public static int i = 0;
	public static int howManyZero = 0;
	
	// 1! = 0! *1 =1
	// 2! = 2 * 1 =2 * 1!
	// 3! = 3 * 2 * 1 = 3 * 2!
	// 4! = 4 * 3 * 2 * 1= 4 * 3!
	//n! = n*(n-1)!

	public static int interiveFactorial(int num) {
		if (num==0) {
			return 1;
		}
		int factorial =1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		return factorial;
	}
	
	public static int recussiveFactorial(int num) {
		if (num==0) {
			return 1;
		}
		  return num* recussiveFactorial(num-1);
		
	}
	
	
	public static int interivelFindHowManyZeroOnArray(int[] array) {
		int howManyZero = 0;
		for(int i= 0 ; i<array.length-1 ; i++) {
			if (array[i] == 0)
				howManyZero++;
		}
		return howManyZero;
	}

	public static int RecurssiveFindHowManyZeroOnArray(int[] array) {
		if(i>array.length-1)
			return howManyZero;
			if (array[i] == 0) 
				howManyZero++;
			    i++;
			RecurssiveFindHowManyZeroOnArray(array);
			return howManyZero;
	}
}
