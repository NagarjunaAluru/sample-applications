/**
 * 
 */
package com.practice.exception.handling;

/**
 * @author naluru
 *
 */
public class Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//"heakerearth".chars().distinct().peek(ch->System.out.print(ch)).sorted();
		/*String Name = new String("Alice,Smith,Bob");
		Name = Name.replaceAll(",", ":");
		System.out.println(Name);*/
		String s ="Naga";
		StringBuffer sb = new StringBuffer(s.length());
		for(int i =s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
	}

}

