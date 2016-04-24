package data_structures;
import java.util.*;

public class Heap{
	private int cap;
	private int size;
	private int[] heap;
	public Heap(int cap){
		this.cap=cap;
		heap=new int[this.cap];
		size=0;
	}
	public int getparent(int i){
		int parent=(i-1)/2;
		if(parent<0||parent>size-1){
			return -1;
		}
		return parent;
	}
	
	public int getleft(int i){
		int left=2*i+1;
		if(left<0||left>size-1){
			return -1;
		}
		return left;
	}
	
	public int getright(int i){
		int right=2*i+2;
		if(right<0||right>size-1){
			return -1;
		}
		return right;
	}	
	
	public int getmax(){
		if(size==0){
			System.out.println("Heap is emtpy");
			return Integer.MIN_VALUE;
		}
		int max=heap[0];
		return max;		
	}
	public void heapify(int p){
		int left=getleft(p);
		int right=getright(p);
		int max=p;
		if(left!=-1&&heap[left]>heap[max]){
			max=left;
		}
		if(right!=-1&&heap[right]>heap[max]){
			max=right;
		}
		if(max!=p){
			int tmp=heap[max];
			heap[max]=heap[p];
			heap[p]=tmp;
			heapify(max);
		}
		
	}
	public void expand(){
		if(size==cap){
			int[] old_heap=new int[cap];
			System.arraycopy(heap,0,old_heap,0,size);
			cap=2*cap;
			heap=new int[cap];
			System.arraycopy(old_heap,0,heap,0,size);
		}
		return;
	}
	
	public void insert(int data){
		if(size==cap){
			expand();
		}
		size++;
		int i=size-1;
		heap[i]=data;
		while(i>0&&heap[i]>heap[(i-1)/2]){
			int tmp=heap[(i-1)/2];
			heap[(i-1)/2]=heap[i];
			heap[i]=tmp;
			i=(i-1)/2;
		}
	}
	public int delete(){
		if(size==0){
			System.out.println("empty");
			return Integer.MIN_VALUE;
		}
		int out=heap[0];
		heap[0]=heap[size-1];
		heap[size-1]=0;
		size--;
		heapify(0);
		return out;
	}
	public int getsize(){
		return size;
		
	}
	public void buildby_array(int[] input){
		int len=input.length;
		while(len>cap){
			expand();
		}
		size=len;
		System.arraycopy(input,0,heap,0,size);
		for(int i=len-1;i>=0;i--){
			heapify(i);
		}
	
	}
	public void sort(){
		if(size==0){
			return;
		}
		int old_size=size;
		for(int i=1;i<old_size;i++){
			int tmp=heap[size-1];
			heap[size-1]=heap[0];
			heap[0]=tmp;
			size--;
			heapify(0);
		}
		size=old_size;
	}
	public void show(){
		int[] output=new int[size];
		System.arraycopy(heap, 0, output, 0, size);
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args){
		Heap test=new Heap(10);
		test.insert(1);
		test.insert(5);
		test.insert(2);
		test.insert(6);
		test.insert(3);
		test.insert(10);
		test.show();
		int[] input={5,4,7,3,9,2,4,10,16};
		test.buildby_array(input);
		test.show();
		test.sort();
		test.show();

	}
	
	
	
}
