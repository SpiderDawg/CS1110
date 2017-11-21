import java.util.Scanner;
public class Demo{

    public static void main(String[]args){
    	Scanner src = new Scanner(System.in);
		LinkedList people = new LinkedList();
    	LinkedList spreaders = new LinkedList();
   		LinkedList infected = new LinkedList();
    	
    	System.out.println("Please enter a list of names, type \"end\" when finished");
    	
    	String input = src.nextLine();
    	while(!input.equals("end")){
    		people.addToEnd(input);
    		input = src.nextLine();
    	}
    	System.out.println(people);
    	infected = infectedListCreate(people);
    	System.out.println(infected);
    	spreaders = spreadersListCreate(people);
    	System.out.println(spreaders);
    }

    public static LinkedList infectedListCreate(LinkedList list){
    	LinkedList temp = new LinkedList();
    	Node curr = list.getFrontNode();
    	for(int i = 0; i < list.size(); i++){
    		temp.addToEnd(curr.getData().substring(curr.getData().indexOf(" ")));
    		curr = curr.getNext();
    	}
    	return temp;
    }

    //infecters
    public static LinkedList spreadersListCreate(LinkedList list){
    	LinkedList temp = new LinkedList();
    	Node curr = list.getFrontNode();
    	for(int i = 0; i < list.size(); i++){
    		temp.addToEnd(curr.getData().substring(0, curr.getData().indexOf(" ")));
    		curr = curr.getNext();
    	}
    	return temp;
    }



}