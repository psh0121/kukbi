
public class Node {
	private NodeData data;
	private Node next;
	
	// 기본생성자 
	public Node()
	{
		data = new NodeData();
		next = null;
	}
	
	// 오버로딩된 생성자
	public Node(NodeData data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public Node(int intValue, String strValue, Node next)
	{
		data = new NodeData(intValue, strValue);
		this.next = next;
	}
	
	public Node(int intValue, String strValue)
	{
		data = new NodeData(intValue, strValue);
		this.next = null;
	}
	
	// Getter, Setter
	public NodeData getData() {
		return data;
	}

	public void setData(NodeData data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	// 재정의 
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}