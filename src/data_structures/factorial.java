package data_structures;

public class factorial{
	public static int result(int n){
		if(n==0){
			return 1;
		}
		return n*result(n-1);
	}
	public static void main(String[] args){
		System.out.print(result(5));
	}
}