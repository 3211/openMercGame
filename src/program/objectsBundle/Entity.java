package program.objectsBundle;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
public class Entity {
	private String generalType;
	private String uniqueID;
	private String name;
	private String description;
	private ArrayList<Stat> stats;
	private ArrayList<Item> inventory;
	private Image icon;
	private String iconPath;
	public Entity() {
		setStats(new ArrayList<Stat>());
		setInventory(new ArrayList<Item>());
	}
	public String pullAllData(){
		String output = uniqueID+"@"+generalType+"[";
		output+="name="+name+",description="+description+",stats=<";
		for(Stat st : stats){
			output+=st.pullAllData();
		}output+=">,inventory=<";
		for(Item it : inventory){
			output+=it.pullAllData();
		}output+=">,iconPath="+iconPath;
		return output+"]";
	}
	public void init(String generalType, String uniqueID, String name, String description){
		this.generalType=generalType;this.uniqueID=uniqueID;this.name=name;this.description=description;
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
	public String getGeneralType() {
		return generalType;
	}
	public void setGeneralType(String generalType) {
		this.generalType = generalType;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	public void paintIcon(Graphics g, int x, int y, int width, int height){
		g.drawImage(icon, x, y, width, height, null);
	}
}
