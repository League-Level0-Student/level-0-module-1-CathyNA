import javax.swing.JOptionPane;

public class favoriteColor {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("What is your favorite color?");
	
	if(input.equalsIgnoreCase("red")) { 
	JOptionPane.showMessageDialog(null,"That is the best color!");
}
	else {
		JOptionPane.showMessageDialog(null, "Your favorite color is bad.");
	}
}
}
