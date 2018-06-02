package interfaces;

public interface Killable {

	void removeSelf();
	boolean checkIfCanReSpawn();
	void reSpawn();
	boolean checkIfIsAlive();
	void updateHealthStatus();
	boolean checkIfCanReceiveDamage();
	void receiveDamage();
	
	
}
