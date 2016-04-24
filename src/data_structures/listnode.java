package data_structures;
import java.util.*;

class list{
	listnode head;
	int length;
	
	public list(){
		this.head=null;
		this.length=0;
	}
	public void insert(int p,int data){
		listnode newnode=new listnode(data,null);
		if(p<=0){
			newnode.setnext(head);
			head=newnode;
			length++;
			return;
		}
		listnode cur=head;
		for(int i=1;i<p;i++){
			if(cur.getnext()==null)
			{break;}
			cur=cur.getnext();

		}
		if(p>=length){
			cur.setnext(newnode);
			length++;
			return;
		}
		listnode tmp=cur.getnext();
		cur.setnext(newnode);
		newnode.setnext(tmp);
		length++;
		return;		
	}
	public void delete_begin(){
		if(length<=1){
			head=null;
			length=0;
			return;
		}
		head=head.getnext();
		length--;
	}
	public void delete_end(){
		if(length<=1){
			head=null;
			length=0;
			return;
		}
		listnode end=head;
		for(int i=1;i<=length-2;i++){
			end=end.getnext();
		}
		end.setnext(null);
		length--;
		
	}
	
	public void delete_match(listnode dd){
		if(head==null){
			return;
		}
		if(dd.equals(head)){
			head=head.getnext();
			return;
		}
		listnode cur=null;
		listnode pre=head;
		while((cur=pre.getnext())!=null){
			if(cur.equals(dd)){
				pre.setnext(cur.getnext());
				length--;
				return;
			}
			pre=cur;
		}
	
	}
	public void delete_position(int p){
		if(length<=1){
			head=null;
			length=0;
			return;
		}
		if(p<=0){
			head=head.getnext();
			length--;
			return;
		}
		if(p>=length-1){
			listnode end=head;
			for(int i=1;i<=length-2;i++){
				end=end.getnext();
			}
			end.setnext(null);
			length--;
			return;
		}
		listnode pre=head;
		for(int i=1;i<p-1;p++){
			pre=pre.getnext();
		}
		pre.setnext(pre.getnext().getnext());
		length--;
		return;

	}
	public void length(){
		System.out.println(length);
	}
	
	
	public void show(){
		System.out.print("[");
		if(head==null){
			System.out.print("]");
			return;
		}
		listnode cur=head;
		while(cur.getnext()!=null){
			System.out.print(cur.getdata());
			System.out.print(",");
			cur=cur.getnext();
		}
		System.out.print(cur.getdata());
		System.out.print("]");
		return;
	}
	
}

class listnode{
	private int data;
	private listnode next;
	public listnode(int data,listnode next){
		this.data=data;
		this.next=next;
	}
	public void setdata(int data){
		this.data=data;
	}
	public int getdata(){
		return this.data;
	}
	public void setnext(listnode next){
		this.next=next;
	}
	public listnode getnext(){
		return next;
	}



	
	public static void main(String[] args){
		/*
		LinkedList<Integer> test=new LinkedList();
		test.add(1);
		test.add(2);
		test.add(0, 3);
		System.out.println(test);
		*/
		list test=new list();
		//test.show();
		
		test.insert(0, 1);
		//test.insert(3, 2);
		//test.insert(2, 3);
		/*
		test.delete_end();
		test.delete_end();
		test.delete_end();
		test.delete_end();
		
		
		listnode end=new listnode(2,null);
		listnode middle=new listnode(1,end);
		listnode head=new listnode(0,middle);
		
		test.head=head;
		*/
		test.length();
		test.delete_position(0);
		test.show();
		
	}

}