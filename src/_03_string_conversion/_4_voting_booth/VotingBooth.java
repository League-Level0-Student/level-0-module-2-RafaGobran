package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String vote = JOptionPane.showInputDialog("how old are you in years");
		int ageAsInt = Integer.parseInt(vote);
		if(ageAsInt > 17) {
			JOptionPane.showMessageDialog(null,  "who should the next president be");
	}
		else {
			JOptionPane.showMessageDialog(null, "NOBODY CARES WHAT YOU THINK NOW SCRAM".toUpperCase());
		}
}
}