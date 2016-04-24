package data_structures;
import java.util.*;

public class binaryarray{
	static int[] result=new int[3];
	public static void allcases(int n){
		if(n<1){
			System.out.println(Arrays.toString(result));
			return;
		}
		result[n-1]=0;
		allcases(n-1);
		result[n-1]=1;
		allcases(n-1);		
	}
	public static void main(String[] args){
		allcases(3);
	}

}
