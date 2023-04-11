public class SortedDateList extends DateList{
	
	public void sort(Date212 d) {
		DateNode node = new DateNode(d);
		if(first.next == null) {
			last.next = node; 	//extends DateList and creates first and last node. sets to null 
			last = node;
			length ++;
			return;
		}
		DateNode a = first;	//adds new node a to list.
		while(a.next !=null && a.next.data.compareTo(d)<0)
			a = a.next;
		if(a.next == null) {
			last.next = node;
			last = node;
			length++;
		}
		else {
			node.next = a.next;
			a.next = node;
			length++;
		}
	}
}