package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String sentence =	JOptionPane.showInputDialog(null, "What do you like");
	
	JOptionPane.showMessageDialog(null, sentence + " is awesome");
		
	}

}
