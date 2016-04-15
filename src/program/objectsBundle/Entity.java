package program.objectsBundle;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Entity {
	private String uniqueID;
	private String name;
	private String description;
	private ArrayList<Stat> stats;
	private ArrayList<Item> inventory;
	private Image icon;
	public Entity() {
		setStats(new ArrayList<Stat>());
		setInventory(new ArrayList<Item>());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Stat> getStats() {
		return stats;
	}
	public void setStats(ArrayList<Stat> stats) {
		this.stats = stats;
	}
	public ArrayList<Item> getInventory(){
		return inventory;
	}
	public void setInventory(ArrayList<Item> inventory){
		this.inventory = inventory;
	}
	public Image getIcon() {
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public void paintIcon(Graphics g, int x, int y, int width, int height){
		g.drawImage(icon, x, y, width, height, null);
	}

}
