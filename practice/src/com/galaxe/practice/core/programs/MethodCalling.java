/**
 * 
 */
package com.galaxe.practice.core.programs;

/**
 * @author naluru
 *
 */
public class MethodCalling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodCalling mc = new MethodCalling();
		mc.methodOne(1);
		
	}

	private void methodOne(String s){
		System.out.println("String:"+s);
	}
	
	private void methodOne(Object i){
		System.out.println("Integer:"+i);
	}
	
	private void methodOne(double d){
		System.out.println("double:"+d);
	}
	private void methodOne(float f){
		System.out.println("float:"+f);
	}
	private void methodOne(long l){
		System.out.println("long:"+l);
	}
	
	private void methodOne(int i){
		System.out.println("int:"+i);
	}
	private void methodOne(short s){
		System.out.println("short:"+s);
	}
	private void methodOne(byte b){
		System.out.println("byte:"+b);
	}
}
