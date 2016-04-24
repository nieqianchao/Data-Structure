package sort;

import java.util.Arrays;

public class Select{
	public void sort(int[] input){
		if(input==null||input.length<2){
			return;
		}
		int len=input.length;
		for(int i=0;i<len-1;i++){
			int min=i;
			for(int j=i+1;j<len;j++){
				if(input[min]>input[j]){
					min=j;					
				}			
		}
		int tmp=input[i];
		input[i]=input[min];
		input[min]=tmp;	
		}
	}
	public static void main(String[] args){
		Select test=new Select();
		int[] input={3,4,5,1,2,9,7,10};
		System.out.println(Arrays.toString(input));
		test.sort(input);
		System.out.println(Arrays.toString(input));
	}
}