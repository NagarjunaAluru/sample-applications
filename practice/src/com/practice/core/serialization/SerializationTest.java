/**
 * 
 */
package com.practice.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.galaxe.practice.util.Employee;

/**
 * @author naluru
 *
 */
public class SerializationTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(100, "Nag", "SSE", 100000, 32);
		String file = "D://Serialization.txt";
		System.out.println("Before:"+emp.hashCode());
		try(FileOutputStream fos = new FileOutputStream(file)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(emp);
				oos.flush();
			}
		}
		
		try(FileInputStream fin = new FileInputStream(file)){
			try(ObjectInputStream ois = new ObjectInputStream(fin)){
				Employee emp2 = (Employee) ois.readObject();
				System.out.println("After:"+emp2.hashCode());
				System.out.println(emp2.toString());
			}
		}
	}
}
