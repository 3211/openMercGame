package program.objectsBundle;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Stat {
	private String uniqueID;
	private String name;
	private String description;
	private int value;
	private ArrayList<Stat> substats;
	private Image icon;
	public Stat() {
		setSubstats(new ArrayList<Stat>());
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public ArrayList<Stat> getSubstats() {
		return substats;
	}
	public void setSubstats(ArrayList<Stat> substats) {
		this.substats = substats;
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
	public void setUniqueID(String metaData) {
		this.uniqueID = metaData;
	}
	public void paintIcon(Graphics g, int x, int y, int width, int height){
		g.drawImage(icon, x, y, width, height, null);
	}
}
