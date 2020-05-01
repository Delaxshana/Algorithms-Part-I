
public class LinkedListEx {

	LinkedListEx next;
	int data;
	public LinkedListEx(int data) {
		this.data= data;
	}
	
	public void append(int data) {
		LinkedListEx current = this;
		while(current.next != null) {
			current = current.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
