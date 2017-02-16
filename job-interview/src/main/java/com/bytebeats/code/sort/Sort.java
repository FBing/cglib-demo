package com.bytebeats.code.sort;

public abstract class Sort {

	public abstract void sort(int[] arr);
	
	protected void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
            	System.out.print(arr[i]+" ");
            }else{
            	System.out.println(arr[i]);
            }
        }
	}
	
	protected void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
}
