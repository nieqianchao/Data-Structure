package sort;

import java.util.Arrays;

public class CountSort{
	public static void sort(int[] input,int k){
		if(input==null&&input.length<2){
			return;
		}
		int l=input.length;
		int[] result=new int[l];
		cs(input,result,k);
		System.arraycopy(result,0,input,0,l);
	}
	public static void cs(int[] input,int[] result,int k){
		int l=input.length;
		int[] tmp=new int[k+1];
		for(int i=0;i<l;i++){
			tmp[input[i]]+=1;
		}
		for(int i=1;i<=k;i++){
			tmp[i]=tmp[i]+tmp[i-1];
		}
		for(int j=0;j<l;j++){
			result[tmp[input[j]]-1]=input[j];
			tmp[input[j]]=tmp[input[j]]-1;
		}
	}
		public static void main(String[] args){
			CountSort test=new CountSort();
			int[] input={34,4,5,99,2,9,10,7,50,1,3,87,10,17,34,23,87,1,198,75,91,37,11,50};
			//System.out.println(input.length);
			System.out.println(Arrays.toString(input));
			test.sort(input,198);
			System.out.println(Arrays.toString(input));
		}
}
