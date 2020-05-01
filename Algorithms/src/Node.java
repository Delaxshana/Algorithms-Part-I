
public class Node {
/* Data structures Tree*/

	Node left, right;
	
	int data;
	/* Tree : A collection of nodes */
	
	public Node(int data) {
		this.data=data;
	}
	public void insert(int value) {
		if(value <= data) {
			if(left== null) {
				left= new Node(value);
			}else 
			{
				left.insert(value);
			}
		}else {
			if(right == null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}
	}
	public boolean find (int value) {
		if (value== data) {
			return true;
		}
		else if (value < data) {
			if(left== null) {
				return false;
			}
			else 
			return  left.find(value);
		}
		else {
			if(right == null){
				return false;
			}else {
				return right.find(value);
			}
		}	
	}
	public void printPreOrder() {
		
		System.out.println(data);
		
		if(left != null) {
			left.printInOrder();
		}
		
		if(right != null) {
			right.printInOrder();
		}
		
	}
	public void printPostOrder() {
		if(left != null) {
			
			left.printInOrder();
			
		}
		if(right != null) {
			right.printInOrder();
		}
		System.out.println(data);
	}
	public void printInOrder() {
		if(left != null) {
			
			left.printInOrder();
			
		}
		System.out.println(data);
		if(right != null) {
			right.printInOrder();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,5,6,8,9,5};
		Node n1= new Node(5);
		n1.insert(11);
		n1.insert(8);
		n1.insert(13);
		System.out.println("Find 10 in node n1 "+n1.find(10));
		System.out.println("Print In Order");
		n1.printInOrder();
		System.out.println("Print Pre Order");
		n1.printPreOrder();
		System.out.println("Print Post Order");
		n1.printPostOrder();
		Node n2= new Node(6);
		n2.insert(19);
		n2.insert(12);
		n2.insert(14);
		System.out.println("Find 12 in node n2 "+n2.find(12));
		System.out.println("Print In Order");
		n2.printInOrder();
		System.out.println("Print Pre Order");
		n2.printPreOrder();
		System.out.println("Print Post Order");
		n2.printPostOrder();
		Node n3= new Node(17);
		n3.insert(4);
		n3.insert(15);
		n3.insert(16);
		System.out.println("Find 15 in node n3 "+n3.find(15));
		System.out.println("Print In Order");
		n3.printInOrder();
		System.out.println("Print Pre Order");
		n3.printPreOrder();
		System.out.println("Print Post Order");
		n3.printPostOrder();
	
	}



}
