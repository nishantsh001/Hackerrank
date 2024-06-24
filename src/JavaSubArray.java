	import java.io.*;
	import java.util.*;

	public class JavaSubArray {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        
	        int arr[] = new int[sc.nextInt()];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	           int sum = 0;
	             for (int j = i; j < arr.length; j++) {
	                 sum = sum+arr[j];
	                 if(sum<0)
	                    count++;
	                
	             }
	             
	        }
	         
	        System.out.println(count);
	    }
	}

