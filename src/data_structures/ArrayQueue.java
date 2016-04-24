package data_structures;

import java.util.Arrays;

public class ArrayQueue{
	private int front=0;
	private int rear=0;
	private int[] Queue;
	private int cap;
	private int size=0;
	public ArrayQueue(int cap){
		this.cap=cap;
		Queue=new int[this.cap];		
	}
	public ArrayQueue(){
		cap=5;
		Queue=new int[cap];
	}
	public void enQueue(int data) throws Exception{
		if(size==cap){
			throw new Exception("full");
		}
		Queue[rear++]=data;
		size++;
		rear=rear%cap;
	}
	public int deQueue() throws Exception{
		if(size==0){
			throw new Exception("empty");
		}
		int dq=Queue[front++];
		size--;
		front=front%cap;
		return dq;
	}
	public int Front() throws Exception{
		if(size==0){
			throw new Exception("empty");
		}
		int frontdata=Queue[front];
		return frontdata;
	}
	public boolean isempty(){
		return size==0;
	}
	public int size(){
		return size;
	}
	public void show(){
		System.out.println(Arrays.toString(Queue));
		
	}
	public static void main(String[] args){
		ArrayQueue test=new ArrayQueue();
		try{
			test.enQueue(1);
			test.enQueue(2);
			test.enQueue(3);
			System.out.println(test.deQueue());
			test.enQueue(4);
			test.enQueue(5);
			test.enQueue(6);
			test.show();
			System.out.println(test.isempty());
			System.out.println(test.Front());
			System.out.println(test.size());
			
		}
		catch(Exception e){}
		
	}
}