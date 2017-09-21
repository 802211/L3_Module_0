package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JButton View;
	JButton Add;
	int x = 0;
	void setup() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
	View = new JButton();
	Add = new JButton();
		f.add(p);
		f.setSize(500, 300);
		p.add(Add);
		p.add(View);
		View.setText("View Names");
		Add.setText("Add Name");
	View.addActionListener(this);;
		Add.addActionListener(this);
		f.setVisible(true);
		View.setSize(200, 100);
		Add.setSize(200, 100);
		
	}
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.setup();
	}
	ArrayList<String> array = new ArrayList<String>();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String add = "";
		if(e.getSource() == Add){
			add = JOptionPane.showInputDialog("Enter a Name.");
		
		array.add(add);
		
			
		}
		if(e.getSource() == View){
			String c = "";
			for(String s: array){
				x = x+1;
				c += "Guest #" + x + ":" + s + "\n";
			}
		
			JOptionPane.showMessageDialog(null, c);
		}
	}
	
	
}
