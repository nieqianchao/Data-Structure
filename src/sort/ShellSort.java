package sort;

import java.util.Arrays;
import java.util.*;

public class ShellSort{
	 
	public static void sort(int[] input){
		if(input==null&&input.length<2){
			return;
		}
		int l=input.length;
		ArrayList<Integer> h_list=new ArrayList();
		for(int h=1;h<l/9;h=3*h+1){
			h_list.add(h);
		}
//		h_list.add(5);
//		h_list.add(3);
//		h_list.add(2);
		for(int h:h_list){
			System.out.println(h);
			for(int i=h;i<l;i++){
				int tmp=input[i];
				int j=i;
				while(j>=h&&input[j-h]>tmp){
					input[j]=input[j-h];
					j-=h;
				}
				input[j]=tmp;
			}
		}
		return;
	}
		public static void main(String[] args){
			ShellSort test=new ShellSort();
			int[] input={34,4,5,99,2,9,10,7,50,1,3,87,10,17,34,23,87,1,198,75,91,37,11,50};
			System.out.println(Arrays.toString(input));
			test.sort(input);
			System.out.println(Arrays.toString(input));
		}
}
