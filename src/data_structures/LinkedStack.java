package data_structures;
import java.util.*;

public class LinkedStack{
	private int length;
	private listnode head;
	public LinkedStack(){
		length=0;
		head=null;
	}
	public void push(int data){
		listnode newdata=new listnode(data,head);
		head=newdata;
		length++;
	}
	public int pop() throws Exception{
		if(length==0){
			throw new Exception("empty");
		}
		int popdata=head.getdata();
		head=head.getnext();
		length--;
		return popdata;
	}
	public int size(){
		return length;
	}
	public int peek() throws Exception{
		if(length==0){
			throw new Exception("empty");
		}
		int peekdata=head.getdata();
		return peekdata;
	}
	public void show(){
		System.out.print("[");
		if(length==0){
			System.out.print("]");
			return;
		}
		listnode cur=head;
		StringBuilder result=new StringBuilder();
		while(cur.getnext()!=null){
			result.append(String.valueOf(cur.getdata()));
			result.append(",");
			cur=cur.getnext();
		}
		result.append(String.valueOf(cur.getdata()));
		result.append("]");
		System.out.print(result.toString());
		System.out.println("");
	}
	public static void main(String[] args){
		LinkedStack test=new LinkedStack();
		test.push(1);
		test.push(2);
		test.show();
		try{
		System.out.println(test.pop());
		System.out.println(test.peek());
		}
		catch(Exception e){}

		
	}

}
