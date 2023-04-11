import java.awt.GridLayout;
import javax.swing.*;

public class DateGUI{

	public DateGUI(UnsortedDateList list1, SortedDateList list2) {
		createAndShowGUI(list1, list2);
	}

	private void createAndShowGUI(UnsortedDateList unsorted, SortedDateList sorted) {
		//Create and set up the window.
        JFrame frame = new JFrame("Project 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 500,500);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout(1,2));
        
        //JMenuBar
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Dates");

		fileMenu.addSeparator();		
		
		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		//End of JMenuBar

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        textArea.append(unsorted + "\n");//prints unsorted List		
        
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        
        textArea2.append(sorted + "\n");//prints sorted List	

        //Displays window
        frame.pack();
        frame.setVisible(true);
		
	}//end of GUI method
	
}//end of DateGUI class