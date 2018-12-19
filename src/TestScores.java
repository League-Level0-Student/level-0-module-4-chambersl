
import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What did you get on your test?");
		double percent = Double.parseDouble(score);
		if (percent >= 70) {
			JOptionPane.showMessageDialog(null, "Great Job! You passed!");
		} else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}
	}
}
