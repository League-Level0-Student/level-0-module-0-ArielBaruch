package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = JOptionPane.showInputDialog(null, "What is your name");

 JOptionPane.showMessageDialog(null, "Hi " + sentence);
	}

}
