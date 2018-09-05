package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
int score=0;
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1=JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer1.equalsIgnoreCase("Man")) {
	score++;
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT, the answer is MAN.");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2=JOptionPane.showInputDialog("What is always coming but never arrives?");
if(answer2.equalsIgnoreCase("Tomorrow")) {
	score++;
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT, the answer is TOMORROW.");
		// 2. Make a pop up to show the score.
	
	}
String answer3=JOptionPane.showInputDialog("Two children, who were all tangled up in their reckoning of the days of the week, paused to straighten matters out.\nWhen the day after tomorrow is yesterday,\" said Priscilla, \"then 'today' will be as far from Sunday as that day was which was 'today' when the day before yesterday was tomorrow!\"\r\n" + 
		"On which day of the week did this puzzling prattle occur?")
JOptionPane.showMessageDialog(null, "Your current score is "+score+".");
}
}

