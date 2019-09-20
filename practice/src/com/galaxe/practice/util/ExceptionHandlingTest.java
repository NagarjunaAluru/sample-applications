/**
 * 
 */
package com.galaxe.practice.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author naluru
 *
 */
public class ExceptionHandlingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\journaldev.txt"));) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
