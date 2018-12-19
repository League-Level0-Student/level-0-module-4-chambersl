package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation = false;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (weekday == 0) {
			isWeekday = false;

		} else {
			isWeekday = true;
		}
		int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation day?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);
		if (vacation == 1) {
			isWeekday = true;

		} else {
			isWeekday = false;
		}
		if (isVacation == true || isWeekday == false) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		} else {
			JOptionPane.showMessageDialog(null,
					"Youre gonna have a bad time waking up, LAZY BONES                                                  "
							+ "" + "" + "                    ⠠⠤⠶⠶⠶⠶⠶⠶⠤⠄\n" + "⠀⠀⠀⠀⠀⠀⠀⠠⠾⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠷⠄\n"
							+ "⠀⠀⠀⠀⠀⠀⠠⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠄\n" + "⠀⠀⠀⠀⠀⠀⠸⠿⠛⠉⠉⠉⠻⠿⠿⠟⠉⠉⠉⠛⠿⠇\n" + "⠀⠀⠀⠀⠀⠀⠸⠇⠀⠀⠶⠀⠸⠿⠿⠇     🔵  ⠸⠇\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠻⠶⠤⠤⠠⠿⠃⠘⠿⠄⠤⠤⠶⠟\n" + "⠀⠀⠀⠀⠀⠀⠀⠾⠿⠙⠶⠿⠿⠤⠤⠿⠿⠶⠏⠻⠷\n" + "⠀⠀⠀⠀⠀⠀⠀⠻⠶⠜⠰⠭⠩⠍⠭⠍⠭⠱⠠⠶⠟\n"
							+ "⠀⠀⠀⠀⠠⠶⠦⠈⠻⠿⠶⠭⠘⠃⠛⠃⠫⠴⠿⠟⠡⠾⠟⠂\n" + "⠀⠀⠀⠀⠊⠉⠛⠳⠦⠈⠉⠛⠛⠛⠛⠛⠛⠉⠁⠠⠿⠋⠀⠱⠄\n"
							+ "⠀⠀⠀⠔⠀⠀⠄⠀⠉⠳⠦⠄⠳⠶⠶⠃⠠⠤⠞⠛⠁⠠⠂⠀⠙⠄\n" + "⠀⠀⠎⠀⠀⠀⠇⠀⠀⠸⠀⠏⠠⠭⠍⠈⠏⠇⠀⠀⠀⠼⠀⠀⠀⠙⠆\n"
							+ "⠀⠼⠀⠀⠀⠀⠷⠔⠒⠚⠍⠣⠸⠿⠿⠸⠋⠇⠠⠴⠚⠹⠀⠀⠀⠀⠻\n" + "⠀⠻⠄⠀⠀⠰⠁⠀⠀⠀⠗⠹⠸⠿⠿⠸⠉⠇⠇⠀⠀⠈⠇⠀⠀⠀⠸\n"
							+ "⠀⠀⠙⠦⠄⠸⠀⠀⠀⠀⠱⠹⠸⠿⠿⠸⠹⠜⠀⠀⠀⠀⠇⠀⠀⠴⠋\n" + "⠀⠀⠀⠈⠃⠼⠶⠄⠀⠀⠸⠾⠶⠒⠒⠚⠾⠤⠤⠤⠤⠾⠃⠶⠊⠁\n"
							+ "⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉\n" + "⠀⠀⠀⠀⠀⠀⠔⠀⠶⠀⠀⠀⠀⠀⠀⠀⠀⠸⠇⠀⠀⠣\n" + "⠀⠀⠀⠀⠀⠀⠇⠸⠇⠀⠀⠀⠀⠎⠆⠀⠀⠸⠧⠀⠀⠸\n"
							+ "⠀⠀⠀⠀⠀⠰⠁⠾⠁⠀⠀⠀⠠⠇⠱⠀⠀⠸⠿⠀⠀⠀⠇\n" + "⠀⠀⠀⠀⠀⠸⠀⠿⠀⠀⠀⠀⠸⠀⠸⠀⠀⠀⠿⠀⠀⠀⠇\n" + "⠀⠀⠀⠀⠀⠈⠉⠉⠒⠒⠒⠒⠊⠀⠈⠒⠒⠒⠛⠓⠊⠉⠁\n"
							+ "⠀⠀⠀⠀⠠⠶⠶⠤⠲⠶⠀⠀⠀⠀⠀⠀⠠⠷⠶⠶⠂⠤⠶⠦⠄\n" + "⠀⠀⠀⠀⠿⠿⠿⠿⠧⠩⠄⠀⠀⠀⠀⠀⠬⠭⠭⠱⠿⠿⠿⠿⠟﻿");
		}

	}

	/*
	 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
	 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
	 * in�?.
	 */
}
