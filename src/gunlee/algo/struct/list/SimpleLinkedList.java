package gunlee.algo.struct.list;

public class SimpleLinkedList {
	private Node head;
	
	public void appendNode(String data) {
		Node node = new Node(data);
		Node tempPoint = head;
		if(tempPoint == null) {
			head = node;
		} else {
			while(tempPoint.link != null) {
				tempPoint.link = node;
			}
		}
	}
	
	public void deleteNode(String data) {
		Node tempPoint = head;
		if(tempPoint == null) return;
		
	}
}
