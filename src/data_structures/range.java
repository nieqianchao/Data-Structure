package data_structures;

public class range{
	public static void print(int begin,int end){
		if(begin>end){
			System.out.println("argument error,please check");
			return;
		}
		if(begin==end){
			System.out.println(begin);
			return;
		}
		System.out.println(begin);
		print(begin+1,end);
		System.out.println(begin);
		
	}
	public static void main(String[] args){
		print(0,5);
	}
}