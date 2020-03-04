package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMain {
    public static int processArray(ArrayList<Integer> array) {
    	
    	boolean f=false;
    	boolean s=false;
    	int num=0;
    	boolean nextSeq = false;
    	for(int i=0; i<array.size(); i++){
    		if(f && !s){
    			s=true;
    		}
    		num=array.get(i);
    		if(num>=100){
    			f=true;
    		}
    		if(f && s){
    			if(num>=100){        			
    				array.remove(i);
        			s=f=false;
        			i--;
        			nextSeq = true;
        		}else{
        			s=f=false;
        		}
    		}
    		
    		if(nextSeq){
    			if(array.get(i+1)>=100){
    				for(int j=i+1;j<array.size();j++){
        				if(array.get(j)>=100){
        					array.remove(j);
        					j--;
        				}else{
        					nextSeq =false;
        					break;
        				}
    				}
    			}else{
    				nextSeq =false;
    			}
    		}
    	}
    			
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
