package interfaces;

import models.Projectile;

public interface Buyable {

	boolean checkIfCanBeBought();
	void buy(Projectile currentBullet, int purchaseAmount);
	void updateProjectileStatus();
	void updateCharacterStatus();
	void updateShopMenu();
	void removeFromShop();
	void addToShop();
	void addToCharacterArsenal();
	
}
