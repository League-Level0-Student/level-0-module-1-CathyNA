package ifs_ints_and_loops;
import javax.swing.JOptionPane;

public class REMARKABLE {
public static void main(String[] args) {
	String userName=JOptionPane.showInputDialog("GIVENAME");
	if(userName.equalsIgnoreCase("Matt")) {
		JOptionPane.showMessageDialog(null, "Matt is super tall.");
	}
		else if(userName.equalsIgnoreCase("Cathy")) {
			JOptionPane.showMessageDialog(null, "Cathy can kind of draw.");
		}	
			
			else{
				if(userName.equalsIgnoreCase("JC")) {
				JOptionPane.showMessageDialog(null, "JC likes to plagiarize Cathy.");
			}
				else {
					if(userName.equalsIgnoreCase("Gabriel")) {
						JOptionPane.showMessageDialog(null, "Gabriel can not draw.");
					}
				
				
				else {
					if(userName.equalsIgnoreCase("Timmy")) {
						JOptionPane.showMessageDialog(null, "Timmy loves cats.");
					}
					}
						if(userName.equalsIgnoreCase("My")) {
						JOptionPane.showMessageDialog(null, "My can't draw (either).");
						}
					}
				
		}
		
		
	}


}
