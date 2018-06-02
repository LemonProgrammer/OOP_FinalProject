package interfaces;

public interface Collidable {

	boolean checkIfIsCollidable();
	boolean checkIfNextSpotIsOccupied();
	boolean checkIfWillCollideModelsPath();
	void removeModel();
	void updateSpotStatus();
	void updateHealth();
	void updateDamageDone();
	
}
