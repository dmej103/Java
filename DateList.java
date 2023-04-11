public abstract class DateList {

	public DateNode first = new DateNode(null);
	public DateNode last = first;
	public int length = 0;
	
	public int getLength() {
		return length;
	}

	public void append(Date212 d) {
		DateNode node = new DateNode(d);
		last.next = node;
		last = node;
		++length;
	}//append method like in lab 16
	
	public String toString() {
		// variable c to check through list.
		DateNode c = first.next;
		String returnString = "";
		while (c != null) {
			returnString += c.data + " \n";
			c = c.next; 
		}
		return returnString;
	}// end of toString method
}//end of datelist class