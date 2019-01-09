package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	static int happinesslevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy

		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.

		for (int i = 0; i < 9; i++) {

			int task = JOptionPane.showOptionDialog(null, "What do you want do do with your pet?", "Activities", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Play with", "Feed", "clean" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				playWith(pet);
			}
			if (task == 1) {
				feed(pet);
			}
			if (task == 2) {
				clean(pet);
			}

			if (happinesslevel == 9) {
				JOptionPane.showMessageDialog(null, "Your pet is satisfied and asleep, take a break!");
				break;
			}
		}
	}
	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	static void playWith(String pet) {
		JOptionPane.showMessageDialog(null, " you played with your " + pet);
		happinesslevel++;
	}

	static void feed(String pet) {
		JOptionPane.showMessageDialog(null, " you fed your " + pet);
		happinesslevel++;
	}

	static void clean(String pet) {
		JOptionPane.showMessageDialog(null, " you cleaned your " + pet);
		happinesslevel++;
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

}