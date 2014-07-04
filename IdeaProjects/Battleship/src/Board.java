/**
 * Created by jake on 7/4/14.
 */
import java.util.Random;
public class Board {

	final int xDim = 7, yDim = 7;
	private int[][] board = new int[xDim][yDim];

	Board (){
		Random rnd = new Random();
//		System.out.println(rnd.nextInt(8));
		System.out.println(this.toString());
	}

	private boolean doesFit(Ship ship, int index, int[] spaces){

		int length = ship.getSize();

		for (int i = index; i < spaces.length && i < length; i++){
			if (spaces[i] == 1){
				return false;
			}
		}

		return true;
	}

	private boolean doesStand (Ship ship, int index, int columnIndex){
		int[] horizontal = new int[yDim];

		for (int i = 0; i < horizontal.length; i++){
			horizontal[i] = board[i][columnIndex];
		}

		return doesFit(ship, index, horizontal);
	}

	public String toString(){
		String out = "";

		for (int i = 0; i < board[0].length; i++){
			out += " " + Integer.toString(i + 1) + " ";
		}
		out += "\nA";

		char letter = 'A';

		for (int i = 0; i < board[0].length; i++){
			for (int n = 0; n < board.length; n++){
				switch (board[i][n]){
					case (0):
					case (1):
						out += " = ";
						break;
					case (2):
						out += " 0 ";
						break;
					case (3):
						out += " * ";
						break;
					}
				}
			letter++;
			out += "\n" + letter;
			}
		out = out.substring(0, out.lastIndexOf("\n"));
		return out;
		}
	}
