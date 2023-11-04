package zzzzz_Loops;

import java.util.*;

public class ArrayListApp {
	public static void main(String[] args) {
	      // you may wish to write some code in this main method
	      // to test your method.
	      	  ArrayList<Integer> myList = new ArrayList<Integer>();
		      myList.add(1);
		      myList.add(9);
		      myList.add(1);
		      myList.add(3);
		      myList.add(2);
		      myList.add(5);
		      myList.add(6);
		      myList.add(2);
		      myList.add(4);


	      //System.out.println(count(myList, 1));
	      
	      //System.out.println(contains(myList, 9));
	      
	      //System.out.println(getAllOdd(myList));
	      
	      //System.out.println(noDuplicates(myList));
		      
		      
	}
	
	public static int count(ArrayList<Integer> list,int howMany){
	    int count = 0;
	for (int i = 0; i < list.size(); ++i) {
		  if(list.get(i) == howMany) 
	       count++;	    		  
	}
	    return count;
	}
	
	public static int countInRange(ArrayList<Integer> list, int min, int max){
        int count = 0;
    for (int i = 0; i < list.size(); ++i) {
  	  if(list.get(i) >= min && list.get(i) <= max) 
           count++;	    		  
    }
        return count;
    }   
	
	public static ArrayList<Integer> getAllOdd(ArrayList<Integer> list){
        ArrayList<Integer> newlist = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); ++i) {
  	  if((list.get(i) % 2) != 0) 
          newlist.add(list.get(i));	    		  
    }
        return newlist;
    }
	
	   //<your helper method definition    
	   public static boolean contains(ArrayList<Integer> list, int number){
	      for(Integer i: list){
	        if (i == number){
	            return true;
	        }
	      }
	      return false;
	   }

	   //<your method definition here>
	   public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list){
	              ArrayList<Integer> newlist = new ArrayList<Integer>();
		      for (int i: list) {
		    	  if(!contains(newlist, i)) 
		            newlist.add(i);	    		  
		      }
	              return newlist;
	   }   
	   
	   //<your method definition here>
	   public static int countInList(ArrayList<Integer> list1,ArrayList<Integer> list2){
	             // ArrayListApp<Integer> newlist = new ArrayListApp<Integer>();
	              int count = 0;
		      for (int i: list1) {
		    	  if((contains(list1, i)) && (contains(list2, i))) 
		         //   newlist.add(i);	
	                count++;    		  
		      }
	            //  return newlist;
	            return count;
	   }    
}


