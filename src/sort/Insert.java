package sort;

import java.util.Arrays;

public class Insert{
		public static void sort(int[] input){
			if(input==null&&input.length<2){
				return;
			}
			int l=input.length;
			for(int i=1;i<l;i++){
				int j=i;
				int tmp=input[i];
				while(j>0&&input[j-1]>tmp){
					input[j]=input[j-1];
					j-=1;
				}
				input[j]=tmp;
				//System.out.println(Arrays.toString(input));
			}
			return;
		}
	public static void main(String[] args){
		Insert test=new Insert();
		int[] input={34,4,5,99,2,9,10,7,50,1,3,87};
		System.out.println(Arrays.toString(input));
		test.sort(input);
		System.out.println(Arrays.toString(input));
	}
}
