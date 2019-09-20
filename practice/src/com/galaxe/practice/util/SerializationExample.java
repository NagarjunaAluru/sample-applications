/**
 * 
 */
package com.galaxe.practice.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author naluru
 *
 */
public class SerializationExample {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestOne  t3 = new TestOne();
		System.out.println("Before:"+t3.hashCode());
		System.out.println(t3);
		 FileOutputStream fout=new FileOutputStream("d://Serialize.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(t3);  
		  out.flush();  
		  out.close();
		  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("d://Serialize.txt"));  
		  TestOne s=(TestOne)in.readObject();  
		  in.close();
		  System.out.println("After:"+s.hashCode());
		  System.out.println(s);
	}

}

class TestOne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TestTwo ttwo = new TestTwo();
	int t1 = 5;
	
	public TestOne() {
		System.out.println("Construct");
	}
}

class TestTwo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int t2 = 10;
}

class TestThree {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int t3 = 15;
	TestTwo ttwo = new TestTwo();
	
}
