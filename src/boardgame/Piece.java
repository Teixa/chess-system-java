package boardgame;

public class Piece {
	// posi��o da matriz
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
}
