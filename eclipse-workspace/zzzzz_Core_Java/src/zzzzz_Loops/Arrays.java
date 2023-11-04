package zzzzz_Loops;

import java.util.ArrayList;
//import java.util.*;

public class Arrays {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("Let's practice reversing arrays ...");
		int[] myArray = {200, 20, 30, 40, 50, 60, 70, 80, 100, 90, 90, 90, 90, 300, 250, 600};
		//reverseArray(myArray);
		//for(int i : myArray)
		//	System.out.print(" " + i);
		
		//System.out.println("\nDoes the myArray contains 2000? " + contain_it(myArray, 2000));
		//int[] noDupli = noDuplicates(myArray);
		//for (int i : noDupli)
		//	System.out.print(" " + i);
		
		//int[] arrSort = sortedarray(myArray);
		//for (int i : arrSort)
		//	System.out.print(" " + i);
		
		//int target = linearSearch(myArray, 200);
		//System.out.println(target);
		
		//int target1 = binarySearch(myArray, 40);
		//System.out.println(target1);
		
		//int[] srt = selectionSort(myArray);
		//for (int i : srt)
		//			System.out.print(" " + i);
		
		int[] pivot1 = getAllLessThanPivot(myArray);
		for(int i : pivot1)
			System.out.print(" " + i);
		    System.out.println();
		
		int[] pivot2 = getAllGreaterThanPivot(myArray);
		for(int i : pivot2)
			System.out.print(" " + i);
		
	}
	
	public static int[] reverseArray(int[] arr) {
		int i;
		for(i = 0; i < arr.length/2; ++i ) {
			int temp = arr[i];
			arr[i]   = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
	
	public static boolean contain_it(int[] arr, int n) {
		int i;
		boolean found = false;
		for (i = 0; i < arr.length; ++i) {
			if(arr[i] == n)
				found = true;
			break;
		}
		return found;
	}
	
	public static int[] noDuplicates(int[] arr) {
		int i;
		int[] no_duplic = new int[arr.length];
		for (i = 0; i < arr.length; ++i) {
			if(!(contain_it(no_duplic, arr[i]))) {
				no_duplic[i] = arr[i];
			}
		}
		return no_duplic;
	}
	
	
	//--------------------------------------
	
	 public static int[] selectionSort(int [] numbers) {
	      int i;
	      int j;
	      int indexSmallest;
	      int temp;      // Temporary variable for swap

	      for (i = 0; i < numbers.length - 1; ++i) {

	         // Find index of smallest remaining element
	         indexSmallest = i;
	         for (j = i + 1; j < numbers.length; ++j) {

	            if (numbers[j] < numbers[indexSmallest]) {
	               indexSmallest = j;
	            }
	         }

	         // Swap numbers[i] and numbers[indexSmallest]
	         temp = numbers[i];
	         numbers[i] = numbers[indexSmallest];
	         numbers[indexSmallest] = temp;
	      }
	      return numbers;
	   }
	
	//--------------------------------------
	
	public static int linearSearch(int [] numbers, int key) {
	      int i;
	      
	      for (i = 0; i < numbers.length; ++i) {
	         if (numbers[i] == key) {
	            return i;
	         }
	      }
	      
	      return -1; /* not found */
	   }
	
	public static int binarySearch(int [] numbers, int key) {
	      int mid;
	      int low;
	      int high;
	      
	      low = 0;
	      high = numbers.length - 1;

	      while (high >= low) {
	         mid = (high + low) / 2;
	         if (numbers[mid] < key) {
	            low = mid + 1;
	         } 
	         else if (numbers[mid] > key) {
	            high = mid - 1;
	         } 
	         else {
	            return mid;
	         }
	      }

	      return -1; // not found
	   }
	
	   public static int[] getAllButFirst(int[] arrVals){
		      int[] allButfirst = new int[arrVals.length-1];
		      for(int i = 1; i < arrVals.length; ++i){
		        allButfirst[i-1] = arrVals[i];
		 
		      }
		      return allButfirst;
		}
	   
	   public static int[] getAllGreaterThan(int[] arrVals, int val){
		      int[] newArr;
		      int count = 0;
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] > val){
		         count++;
		        }
		      }

		      int j = 0;
		      newArr = new int[count];
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] > val){
		          newArr[j] = arrVals[i];
		          j++;
		        }
		      }
		      return newArr;
		   }
	   
	   public static int getIndexOfMin(int[] arr){
		      int minIndex = 0;
		      int minVal   = arr[0];
		      for(int i = 0; i < arr.length; ++i){
		        if(arr[i] < minVal){
		          minVal = arr[i];
		          minIndex = i;
		        }
		      }
		      return minIndex;
		   }
	   

	   public static int getIndexOfMax(int[] arr){
	      int maxIndex = 0;
	      int maxVal   = arr[0];
	      for(int i = 0; i < arr.length; ++i){
	        if(arr[i] > maxVal){
	          maxVal = arr[i];
	          maxIndex = i;
	        }
	      }
	      return maxIndex;
	   }
	   
	   public static int[] getAllButLast(int[] arr){
		      int[] newArr = new int[arr.length-1];
		      for(int i = 0; i < arr.length-1; ++i){
		        newArr[i] = arr[i];
		      }
		      return newArr;
		   }
	   
	   public static int[] getInRange(int[] arr, int minVal, int maxVal){
		      int[] newArr;
		      int count = 0;
		      for(int i = 0; i < arr.length; ++i){
		        if(arr[i] > minVal && arr[i] < maxVal){
		         count++;
		        }
		      }

		      int j = 0;
		      newArr = new int[count];
		      for(int i = 0; i < arr.length; ++i){
		        if(arr[i] > minVal && arr[i] < maxVal){
		          newArr[j] = arr[i];
		          j++;
		        }
		      }
		      return newArr;
		   }
	   
	   public static boolean isSorted(int[] arr) {

		      for(int i = 0; i <= (arr.length-2); i++){
		         int j = i+1;
		         if (arr[i] > arr[j]){
		            return false;
		         }
		      }
		      return true;
		   }
	   
	   public static int[] getAllLessThan(int[] arrVals, int val){
		      int[] newArr;
		      int count = 0;
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] < val){
		         count++;
		        }
		      }

		      int j = 0;
		      newArr = new int[count];
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] < val){
		          newArr[j] = arrVals[i];
		          j++;
		        }
		      }
		      return newArr;
		   }
	   
	   public static int[] getAllLessThanPivot(int[] arrVals){
		      int[] newArr;
		      int count = 0;
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] < arrVals[0]){
		         count++;
		        }
		      }

		      int j = 0;
		      newArr = new int[count];
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] < arrVals[0]){
		          newArr[j] = arrVals[i];
		          j++;
		        }
		      }
		      return newArr;
		   }
	   
	   public static int[] getAllGreaterThanPivot(int[] arrVals){
		      int[] newArr;
		      int count = 0;
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] > arrVals[0]){
		         count++;
		        }
		      }

		      int j = 0;
		      newArr = new int[count];
		      for(int i = 0; i < arrVals.length; ++i){
		        if(arrVals[i] > arrVals[0]){
		          newArr[j] = arrVals[i];
		          j++;
		        }
		      }
		      return newArr;
		   }
}
