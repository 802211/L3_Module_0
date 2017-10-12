package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {

	LogSearch() {

	}

	HashMap<Integer, String> list = new HashMap<Integer, String>();

	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
		ls.Setup();
	}

	JFrame f;
	JPanel p;
	JButton add;
	JButton search;
	JButton view;
	JButton remove;

	void Setup() {
		f = new JFrame();
		p = new JPanel();
		add = new JButton();
		search = new JButton();
		view = new JButton();
		remove = new JButton();
		f.add(p);
		p.add(add);
		p.add(search);
		p.add(view);
		p.add(remove);
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
		add.setText("Add Entry");
		search.setText("Search");
		view.setText("View List");
remove.setText("Remove Entry");
		f.setSize(500, 200);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == add) {
			String ID = JOptionPane.showInputDialog("Enter an ID number.");
			int id = Integer.parseInt(ID);
			 String Name = JOptionPane.showInputDialog("Enter a name for this ID.");
			list.put(id, Name);
		}
		if (e.getSource() == search) {
			String Look = JOptionPane.showInputDialog("Enter an ID number");
			int look = Integer.parseInt(Look);
			if(list.containsKey(look)){
				JOptionPane.showMessageDialog(null, list.get(look));
			}
			else{
				JOptionPane.showMessageDialog(null, "That entry doesn't exist.");
			}
		}
		if (e.getSource() == view) {
			String s = "";
			for(Integer key: list.keySet()){
				s += "ID:  " + key + "   ";
				s += "Name:  " + list.get(key) + "\n";
		}
			JOptionPane.showMessageDialog(null,  s);
			}
	if(e.getSource() == remove){
		String Delete = JOptionPane.showInputDialog("Enter and ID.");
	int delete = Integer.parseInt(Delete);
	if(list.containsKey(delete)){
		list.remove(delete);
	}
	else{
		JOptionPane.showMessageDialog(null, "That ID isn't in the list.");
	}
	}
	
	
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After
	 * an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */

}
