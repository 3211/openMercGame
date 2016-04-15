package program.objectsBundle.garbage;

import java.util.ArrayList;

public class Ent extends DrawableGameObject{
	private final String objType = "Ent";
	private ArrayList<Stat> stats;
	private ArrayList<InventoryItem> inventory;
	private String[] descriptionText;
	public void init(){
		setStats(new ArrayList<Stat>());
		setInventory(new ArrayList<InventoryItem>());
		setDescriptionText(new String[]{""});
	}
	public String[] getDescriptionText() {
		return descriptionText;
	}
	public void setDescriptionText(String[] descriptionText) {
		this.descriptionText = descriptionText;
	}
	public ArrayList<Stat> getStats() {
		return stats;
	}
	public void setStats(ArrayList<Stat> stats) {
		this.stats = stats;
	}
	public ArrayList<InventoryItem> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<InventoryItem> inventory) {
		this.inventory = inventory;
	}
	public String getObjType() {
		return objType;
	}
}
