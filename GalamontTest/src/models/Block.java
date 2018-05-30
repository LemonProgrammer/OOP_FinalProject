package models;

public class Block extends ModelComponent {

private boolean isDestroyable;

public boolean isDestroyable() {
	return isDestroyable;
}

public void setDestroyable(boolean isDestroyable) {
	
	this.isDestroyable = isDestroyable;
}

	public Block(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
