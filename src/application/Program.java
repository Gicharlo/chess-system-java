package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMath chessMath = new ChessMath();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMath);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.ReadChessPosition(sc);
				
				boolean[][] possibleMoves  = chessMath.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMath.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target:");
				ChessPosition target = UI.ReadChessPosition(sc);
				
				ChessPiece capturedPiece = chessMath.PerformChessMove(source, target);	
			}catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}		
	}
}
