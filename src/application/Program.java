package application;

import java.util.Scanner;

import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMath chessMath = new ChessMath();
		
		while(true) {
			UI.printBoard(chessMath.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.ReadChessPosition(sc);
			
			System.out.println();
			System.out.println("Target:");
			ChessPosition target = UI.ReadChessPosition(sc);
			
			ChessPiece capturedPiece = chessMath.PerformChessMove(source, target);
			
		}
		
		
		
		
	}

}
