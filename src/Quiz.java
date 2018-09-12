import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
	String Input=	JOptionPane.showInputDialog("What is your favorite game?");
	if(Input.equals("fortnite")) {
		JOptionPane.showMessageDialog(null, "That is the best game in the world!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your favorite game is bad");
	}
}
}
