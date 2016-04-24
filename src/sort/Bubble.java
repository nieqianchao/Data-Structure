package sort;
import java.util.*;
public class Bubble{
	public void sort(int[] input){
		if(input==null&&input.length<2){
			return;
		}
		int len=input.length;
		boolean flag=true;
		for(int i=0;i<len&&flag;i++){
			flag=false;
			for(int j=len-1;j>i;j--){
				if(input[j]<input[j-1]){
				int tmp=input[j];
				input[j]=input[j-1];
				input[j-1]=tmp;
				flag=true;
				}
			}
		}
	}
	public static void main(String[] args){
		Bubble test=new Bubble();
		int[] input={3,4,5,1,2,9,7,10};
		System.out.println(Arrays.toString(input));
		test.sort(input);
		System.out.println(Arrays.toString(input));
	}
}
