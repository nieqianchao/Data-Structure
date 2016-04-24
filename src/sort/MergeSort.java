package sort;

import java.util.Arrays;

public class MergeSort{
	
	public static void sort(int[] input){
		if(input==null&&input.length<2){
			return;
		}
		int l=input.length;
		int left=0;
		int right=l-1;
		int[] tmp=new int[l];
		devide(input,tmp,left,right);
	}
	
	public static void devide(int[] input,int[] tmp,int left,int right){		
		if(left<right){
			int mid=(left+right)/2;
			devide(input,tmp,left,mid);
			devide(input,tmp,mid+1,right);
			merge(input,tmp,left,mid,right);
		}
	}
	public static void merge(int[] input,int[] tmp,int left,int mid,int right){
		int p=left;
		int left_end=mid;
		int right_start=mid+1;
		int size=right-left+1;
		while(left<=left_end&&right_start<=right){
			if(input[left]<input[right_start]){
				tmp[p]=input[left];
				p++;
				left++;
			}
			else{
				tmp[p]=input[right_start];
				p++;
				right_start++;
			}
		}
		while(left<=left_end){
			tmp[p]=input[left];
			p++;
			left++;
		}
		while(right_start<=right){

				tmp[p]=input[right_start];
				p++;
				right_start++;

		}
		for(int i=1;i<=size;i++){
			input[right]=tmp[right];
			right--;
		}
	}
	public static void main(String[] args){
		MergeSort test=new MergeSort();
		int[] input={34,4,5,99,2,9,10,7,50,1,3,87,10,17,34,23,87,1,198,75,91,37,11,50};
		//System.out.println(input.length);
		System.out.println(Arrays.toString(input));
		test.sort(input);
		System.out.println(Arrays.toString(input));
	}
}
