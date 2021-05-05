package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.setRows(rows);
		this.setColumns(columns);
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int rows, int columns) {
		return pieces[rows][columns];
	}
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getColumn()];			
		
	}
	
	public void PlacePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
