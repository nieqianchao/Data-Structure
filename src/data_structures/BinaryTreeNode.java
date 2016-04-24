package data_structures;
import java.util.*;

public class BinaryTreeNode{
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
	public void setdata(int data){
		this.data=data;
	}
	public int getdata(){
		return this.data;
	}
	public void setleft(BinaryTreeNode left){
		this.left=left;
	}
		public void setright(BinaryTreeNode right){
		this.right=right;
	}
	public BinaryTreeNode getleft(){
		return this.left;
	}
	public BinaryTreeNode getright(){
		return this.right;
	}
	public void preorder(){
		System.out.print(data);
		System.out.print(" ");
		if(left!=null){
			left.preorder();
		}
		if(right!=null){
			right.preorder();
		}				
	}

	
	public void inorder(){
		if(left!=null){
			left.inorder();
		}
		System.out.print(data);
		System.out.print(" ");
		if(right!=null){
			right.inorder();
		}
	}
	
	
	
	
	
	
	
	
	public static void preorder_stack(BinaryTreeNode root){
		LinkedList<String> res=new LinkedList();
		Stack<BinaryTreeNode> s=new Stack();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode tmp=s.pop();
			res.add(String.valueOf(tmp.getdata()));
			if(tmp.getright()!=null){
				s.push(tmp.getright());	
			}
			if(tmp.getleft()!=null){
				s.push(tmp.getleft());
			}
		}
		System.out.println(res);
		return;

	}
	
	
	
	
	static public void breadth(BinaryTreeNode root){
		LinkedList<Integer> res=new LinkedList();
		Queue<BinaryTreeNode> q=new LinkedList();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode tmp=q.poll();
			res.add(tmp.getdata());
			if(tmp.getleft()!=null){
				q.offer(tmp.getleft());
			}
			if(tmp.getright()!=null){
				q.offer(tmp.getright());
			}
		}
		System.out.println(res);		
	}
	
	public static void main(String[] args){
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode left1=new BinaryTreeNode(2);
		root.setleft(left1);
		BinaryTreeNode right1=new BinaryTreeNode(3);
		root.setright(right1);
		BinaryTreeNode left2=new BinaryTreeNode(4);
		right1.setleft(left2);
		BinaryTreeNode right2=new BinaryTreeNode(5);
		left1.setright(right2);
		root.preorder();
		System.out.println("");
		root.inorder();
//		System.out.println("");
//		preorder_stack(root);
//		breadth(root);
	}


}
