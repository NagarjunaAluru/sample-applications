package mypackage;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	
    	
    	Map<Integer,String[]> strVal = new HashMap<>();
    	for(String s :array){
    		String[] obj = s.split(",");
    		strVal.put(Integer.valueOf(obj[0].trim()), obj);
    	}
    	
    	int engId=0;
    	int testId=0;
    	
    	for (Map.Entry<Integer, String[]> entry : strVal.entrySet()) {
    		int id = Integer.valueOf(entry.getValue()[0].trim());
    		String dept = entry.getValue()[2].trim();
    		if("Engineering".equalsIgnoreCase(dept)){
    			if(id > engId){
    				engId = id;
    			}
    		}else if("Testing".equalsIgnoreCase(dept)){
				if(id > testId){
					testId = id;			
				 }
    		}
    	}
    	
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        retVal.put((strVal.get(engId)[2]).trim(), Integer.valueOf((strVal.get(engId)[3]).trim()));
        retVal.put((strVal.get(testId)[2]).trim(), Integer.valueOf((strVal.get(testId)[3]).trim()));
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
