package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame("Guestbook");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Names");
	JButton button2 = new JButton("View Names");
	
	ArrayList<String> names = new ArrayList<String>();
	
	GuestBook() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource() == button1) {
	
		
	
	String name = JOptionPane.showInputDialog("Enter in a name:");
	names.add(name);

}
if (e.getSource() == button2) {
	String blank = "";
	for (int j = 0; j < names.size(); j++) {
		
	blank += "Guest #" + (j+1) + " " + names.get(j) + "\n";
	}
	JOptionPane.showMessageDialog(null, blank);
	
	}
		
	}
}
