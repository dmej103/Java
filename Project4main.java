import java.util.StringTokenizer;

public class Project4main {
	public static String filename="Date.txt";
	
	public static void main(String[] args) {
		
		SortedDateList sorted = new SortedDateList();//makes sorted List
		UnsortedDateList unsorted = new UnsortedDateList();//makes unsorted List
		
		inputFromFile(filename, sorted, unsorted);//inputs files
		new DateGUI(unsorted,sorted);//creates GUI
	}

	private static void inputFromFile(String name, SortedDateList sorted, UnsortedDateList unsorted) {
		TextFileInput inputFile = new TextFileInput("/Users/david/eclipse-workspace/Project4/src/dates.txt");
		
		
		String line = inputFile.readLine();
		while(line != null) {
			StringTokenizer myTokens = new StringTokenizer(line, ",");
			while(myTokens.hasMoreTokens()) {
				String temp = myTokens.nextToken();
				Date212 d = new Date212(temp);
				sorted.sort(d);
				unsorted.add(d);
			} //closes 2nd while loop
			line = inputFile.readLine();
		}//closes 1st while loop
		inputFile.close();
	}//end of inputFromFile method
}
