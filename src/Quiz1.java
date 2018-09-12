import javax.swing.JOptionPane;

public class Quiz1 {
	public static void main(String[]args) {
		int score=0;
		String input= JOptionPane.showInputDialog("Who is the current President of the United States?");
		if(input.equals("Donald Trump")) {
			JOptionPane.showMessageDialog(null, "You Are Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null,"You are incorrect.");
		}
		JOptionPane.showMessageDialog(null," Your current score is " +score);
}
}