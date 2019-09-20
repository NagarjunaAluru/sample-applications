/**
 * 
 */
package com.galaxe.practice.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author naluru
 *
 */
public class Test {
	private int num;
	
	public Test() {
		this.num = 10;
	}

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		List<Integer> in = new ArrayList<>();
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		in = null;
		System.out.println(in);
		System.exit(0);
		String s = "what";
		StringBuffer sb = new StringBuffer("what");
		System.out.println(sb.equals(s)+","+s.equals(sb));
		
		 String name = "NAGARJUNA";
		 byte[] bytes = name.getBytes("US-ASCII");
		 
		 for(byte b : bytes)
			 System.out.print(b);
		//System.out.println(Arrays.toString(bytes));
		
		char ch = 'a'+3;
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
		System.exit(0);
		
		if(true)
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				
			}
		
		System.exit(0);
		Test t = new Test();
		Test t2 = t;
		
		System.out.println(t.num);
		t2.num = 20;
		System.out.println(t.num);

	}
	
    static int fact(int n) 

    {

        int result;

        if (n == 1)

            return 1;

        result = fact(n - 1) * n;

        return result;

    }

}
