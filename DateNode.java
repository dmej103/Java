public class DateNode{

	public Date212 data;
	public DateNode next;
	
	public DateNode (Date212 d) {
		data = d;
		next = null;  //sets (1) "d" node and next node. next needs to be null. We can then append nodes to the list.
	}
}