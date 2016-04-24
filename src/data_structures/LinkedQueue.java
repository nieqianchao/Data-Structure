package data_structures;

public class LinkedQueue{
	listnode front=null;
	listnode rear=null;
	int length=0;
	
	public void enQueue(int data){
		if(length==0){
			front=new listnode(data,null);
			rear=front;
			length++;
			return;
		}
		rear.setnext(new listnode(data,null));
		length++;
		rear=rear.getnext();		
	}
	public int deQueue() throws Exception{
		if(length==0){
			throw new Exception("empty");
		}
		int dq=front.getdata();
		front=front.getnext();
		length--;
		return dq;
	}
	public boolean isempty(){
		return length==0;
	}
	public int first() throws Exception{
		if(length==0){
			throw new Exception("emtpy");
		}
		int first=front.getdata();
		return first;
	}
	public int size(){
		return length;
	}
	
	public static void main(String[] args){
		LinkedQueue test=new LinkedQueue();
		try{
			test.enQueue(1);
			test.enQueue(2);
			test.enQueue(3);
			while(!test.isempty()){
			System.out.println(test.first());
			System.out.println(test.size());
			System.out.println(test.deQueue());
			System.out.println("****");
			}
		}
		catch(Exception e){}
	}
	
}
