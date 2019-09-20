/**
 * 
 */
package com.galaxe.practice.threads;

/**
 * @author naluru
 *
 */
public class PrintOddEvenNummbers implements Runnable {
	
	private PrintEven even;
	/*int odd=1;
	int even=2;
	boolean isEven;
	static boolean flag=true;
	*/

	public PrintOddEvenNummbers(boolean even) {
		PrintEven evenObj = new PrintEven();
		evenObj.setEven(even);
		this.even = evenObj;
	}


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		if(even.isEven) {
			PrintEven.printEvenNumbers();
		}else {
			PrintEven.printOddNumbers();
		}
		
		
		
		/*if(isEven) {
			printEvenNumbers();
		}else {
			printOddNumbers();
		}*/
	}


	
	
	

}
