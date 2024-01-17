package MyLinkedList;

public class LLNode<E> {
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}
	
	// TODO: Add a parameterized constructor that also inserts the node 
	//       in the correct location and fully connects the node with
        //       prev and next nodes.
	public LLNode(E e, LLNode prev, LLNode next) {
		data = e;
		this.prev = prev;
		this.next = next;
		prev.next = this;
		next.prev = this;
	}
	

}
