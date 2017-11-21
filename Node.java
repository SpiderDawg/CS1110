//Assignment 7

public class Node{
	private String data;
	private Node next;
	private Node prev;
	
	public Node(String d, Node n){
		data = d;
		next = n;
	}
	public String getData(){
		return data;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrev(){
		return prev;
	}

	public void setData(String d){ data = d; }

	public void setNext(Node n){
		next = n;
	}

	public void setPrev(Node p){
		prev = p;
	}

	public String toString(){
		String  s = "["+data+"]->";
		return s;
	}
	
}