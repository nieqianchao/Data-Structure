package sort;

import java.util.Arrays;

public class QuickSort{

	public static void sort(int[] input){
		while(input==null&&input.length<2){
			return;
		}
		int l=input.length;
		qs(input,0,l-1);
		return;
	}
	public static void qs(int[] input,int low,int high){
		int pivot;
		if(low<high){
			pivot=partition(input,low,high);
			qs(input,low,pivot-1);
			qs(input,pivot+1,high);
		}
	}
	
	public static int partition(int[] input,int low,int high){

		int pivot=low;
		int left=low;
		int right=high;
		int pv=input[pivot];
		while(left<right){
			while(input[left]<=pv){
				left++;
			}
			while(input[right]>pv){
				right--;
			}
			if(left<right){
				swap(input,left,right);
			}
		}
		input[low]=input[right];
		input[right]=pv;
		return right;
	}
	public static void swap(int[] input,int left,int right){
		int tmp=input[left];
		input[left]=input[right];
		input[right]=tmp;
	}
	public static void main(String[] args){
		QuickSort test=new QuickSort();
		int[] input={34,4,5,99,2,9,10,7,50,1,3,87,10,17,34,23,87,1,198,75,91,37,11,50};
		//System.out.println(input.length);
		System.out.println(Arrays.toString(input));
		test.sort(input);
		System.out.println(Arrays.toString(input));
	}
}
