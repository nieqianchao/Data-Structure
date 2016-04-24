package sort;

import java.util.Arrays;

public class sort{
	public void sort(int[] input){
		if(input==null||input.length<2){
			return;
		}
		int len=input.length;
		for(int i=len-1;i>0;i--){
			int v=input[i];
			for(int j=i;j>0;j--){
				if(input[j]>v){
					input[j]=input[j-1];
				}
				else{input[j]=v;break;}
			}
					
		}
	
	}
	public static void main(String[] args){
		Select test=new Select();
		int[] input1={3,4,5,1,2,9,7,10};
		int[] input2={3};
		System.out.println(Arrays.toString(input1));
		test.sort(input1);
		test.sort(input2);
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
	}
}
