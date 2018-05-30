package interfaces;

public interface Movable {

	boolean checkIfIsMovable(boolean canMove);
	boolean checkIfCanMoveHorizontal();
	boolean checkIfCanMoveVertical();
	void moveRight(int x);
	void moveLeft(int x);
	void moveUp(int y);
	void moveDown(int y);
	void moveLeftToRightDiagonally(int x, int y);
	void moveRightToLeftDiagonally(int x, int y);
	// checks if the model moving out of bounds from the map, like if trys to go beyound the map boundries?
	boolean checkIfMoveIsOutOfBounds(int x, int y);
	void setMovementSpeed(int numOfSpots);
}
