public class LinkedLink{


	private Node front;
	private int count;

	public LinkedList(){
		front = null;
		count = 0;
	}

	public void addToFront(String d){
		Node n = new Node(d, front);
		front = n;
		count++;
	}

	public int size(){
		return count;
	}

	public boolean isEmpty(){
		if(front == null){
			return true;
		}
		return false;
	}
	public void clear(){
		front = null;
		count = 0;
	}
	public String getFrontData(){
		if(!isEmpty())
			return front.getData();
		return "";
	}
	public Node getFrontNode(){
		return front;
	}
	public void removeFront(){
		if(!isEmpty()){
			front = front.getNext();
			count--;
		}else
			System.out.println("THE LIST APPEARS TO BE EMPTY");
	}
	public void addToEnd(Data d){
		Node n = new Node(d, null);
		if(isEmpty())
			front = n;
		else {
			Node curr = front;
			while (curr.getNext != null)
				curr = curr.getNext();
			curr.setNext(n);
		}count++;
	}
	public void removeLast(){
		if(isEmpty)
			System.out.println("The List is Emprty");
		else if(front.getNext()==null)
			clear();
		else{
			curr = front;
			while(curr.getNext().getNext()!=null)
				curr = curr.getNext();
			curr.setNext(null);
			count--;
		}
	}
	public int contains(String d){
		Node curr = front;
		boolean found = false;
		int index = -1;
		while(curr!=null && !found){
			found = true;
			return index;
		}
		return -1;
	}
	public void remove(int index){
		if(index < 0 || index > size())
			System.out.println("Error, out of bounds");
		else if(index == 0)
			removeFront();
		else{
			Node curr = front;
			for(int i = 0; i < index-1;i++)
				curr = curr.getNext();
			curr.setNext(curr.getNext().getNext());
			count--;
		}
	}
	public Node getNode(int index){
		if(index < 0 || index > size())
			System.out.println("Error, out of bounds");
		else if(index == 0)
			return front;
		else{
			Node curr = front;
			for(int i = 0;i<index;i++)
				curr = curr.getNext();
			return curr;
		}
	}
	public void addAll(LinkedLink list){
		Node curr = list.getFrontNode();
		while(curr!=null){
			addToEnd(curr.getData());
			curr = curr.getNext();
		}
	}
	public static LinkedList merge(LinkedList list1, LinkedList2){
		LinkedList list3 = new LInkedList();
		Node curr = list1.getFrontNode();
		while(curr!=null){
			list3.addToEnd(curr.getData());
			curr = curr.getData();
		}
		curr = list2.getFrontNode();
		while(curr!=null){
			list3.addToEnd(curr.getData());
			curr = curr.getNext();
		}return list3;
	}
	public static LinkedList subList(LinkedList list, int start, int end){
		LinkedList list2 = new LinkedList();
		if(start>end)return list2;
		if(start<0||start>=list.size()||end>=list.size())return list2;
		else{
			Node curr = list.getFrontNode();
			for(int i= 0;i<=start;i++)
				curr = curr.getNext();
			for(int i = start; i <=end;i++){
				list2.addToEnd(curr.getData());
				curr = curr.getNext();
			}return list2;
		}
	}
}