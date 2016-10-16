/*A run is a sequence of adjacent repeated values. Write a program that generates a
sequence of 20 random die tosses and that prints the die values, marking the runs by
including them in parentheses, like this:
1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1*/

import java.util.*;

public class DiceSequence {
	int preValue;
	boolean flag;
	public DiceSequence(){
		Random rn = new Random();
		int diceRoll;
		diceRoll = rn.nextInt(6) + 1;
		preValue = diceRoll;
		for (int i = 0; i < 19; i++){
			if (preValue == diceRoll && i != 18 && !flag){
				flag = true;
				System.out.print("( ");
			}
			System.out.print(preValue + " ");
			if (preValue != diceRoll && flag){
				flag = false;
				System.out.print(")");
			}
			preValue = diceRoll;
			diceRoll = rn.nextInt(6) + 1;
		}
	}
	public static void main (String arg[]){
		DiceSequence roll = new DiceSequence();
	}
}
