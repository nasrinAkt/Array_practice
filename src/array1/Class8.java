package array1;

import java.util.ArrayList;
import java.util.Arrays;

public class Class8 {

public static void main(String[] args) {
	
	ArrayList<String> color = new ArrayList<String>();
	color.add("white");
	color.add("blue");
	color.add("orange");
	color.add("green");
	color.add("red");
	
	//System.out.println(color.indexOf("orange"));
	
    int a =	color.indexOf("orange");
	System.out.println(a);
	
Integer []num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
System.out.println(Arrays.asList(num).indexOf(6));	


	/*int getArrayIndex =Arrays.asList(num).indexOf(5);
    System.out.println(getArrayIndex);  */
	
	
    
 String [] vehicle ={"car","bike","cycle","taxi","plane","van","truck","ambulance","u-haul","train"};
    
 System.out.println(Arrays.asList(vehicle).indexOf("taxi"));
    
 
	  
  }
    
	}
	
	

