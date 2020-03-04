package mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Synch{

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[20];
    	
    	int currNum = 0;
    	int index = 0;
    	while(currNum >=0){
    		currNum = sc.nextInt();
    		if(currNum>0){
    			arr[index] = currNum;
        		index++;
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
}