package com.galaxe.practice.util;

public class BubbleSort {
	
	public int[] sortArray(int[] unsorted) {
		int temp;
		for(int i=0;i<unsorted.length-1;i++)
		{
			for(int j=0;j<unsorted.length-1-i;j++)
			{
				if(unsorted[j]>unsorted[j+1])
				{
					temp=unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=temp;
				}
			}
		}
		System.out.println(unsorted);
		return unsorted;
	}
	public int[] biggistNums(int []array,int noOF)
	{
		int biggestNums[]=new int[noOF];
		int temp;
		for(int i=0;i<noOF;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=array.length-1,index=0;i>=array.length-noOF;i--,index++)
		{
			biggestNums[index]=array[i];
			System.out.println(biggestNums[index]);
		}
		return biggestNums;
	}
	public static void main(String[] args) {
		
		int[] unsorted={3,5,6,1,2};
		//new BubbleSort().sortArray(unsorted);
		new BubbleSort().biggistNums(unsorted, 2);
	}

}
