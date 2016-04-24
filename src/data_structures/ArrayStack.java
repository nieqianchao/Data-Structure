package data_structures;
import java.util.*;

public class ArrayStack{
	private int capacity;
	private int[] stack;
	private int index=-1;
	final static int DEFAULT=10;
	public ArrayStack(){
		capacity=DEFAULT;
		stack=new int[capacity];
	}
	public ArrayStack(int cap){
		capacity=cap;
		stack=new int[capacity];
	}
	public void show(){
		System.out.println(Arrays.toString(stack));
	}
	public void push (int e) throws Exception {
		if(index==capacity-1){
			throw new Exception("the stack is full");
		}
		stack[++index]=e;
	}
	
	public int pop() throws Exception{
		if(index<0){
			throw new Exception("The stack is empty");
		}
		int data= stack[index];
		stack[index--]=Integer.MIN_VALUE;
		return data;
	}
	public boolean isEmpty(){
		return index<0;
	}
	public int top() throws Exception{
		if(index<0){
			throw new Exception("stack is empty");
		}
		return(stack[index]);
	}
	public int size(){
		return index+1;
	}
	public static void main(String[] args){
		ArrayStack test=new ArrayStack(3);
		try{
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test.pop());
		System.out.println(test.top());
		System.out.println(test.isEmpty());
		System.out.println(test.size());
		
		}
		catch(Exception e){
		}
		finally{test.show();}
		
	}

}
