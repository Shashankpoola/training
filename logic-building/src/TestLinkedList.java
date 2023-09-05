
public class TestLinkedList {
	public static void main(String[] args) {

		DoublyLinkedList lst = new DoublyLinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		lst.printforward();
		System.out.println("");
		System.out.println("After Insertion\n");
		//lst.addAfter(20, 25);
		//lst.addAfter(30, 35);
		//lst.printforward();
		System.out.println("");
		//lst.addBefore(20, 15);
		//System.out.println("addBefore\n");
		lst.printforward();
		//lst.remove(20);

		//System.out.println("after removing\n");
		//lst.printforward();
		System.out.println("print from current");
		lst.printbackwards();

	}
}
