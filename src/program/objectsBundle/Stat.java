package program.objectsBundle;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Stat {
	private String generalType;
	private String uniqueID;
	private String name;
	private String description;
	private int value;
	private ArrayList<Stat> subStats;
	private Image icon;
	private String iconPath;
	public Stat() {
		setSubStats(new ArrayList<Stat>());
	}
	public String pullAllData() {
		String output = uniqueID+"@"+generalType+"[";
		output+="name="+name+",description="+description+",subStats=<";
		for(Stat st : subStats){
			output+=st.pullAllData();
		}output+=">,iconPath="+iconPath;
		return output+"]";
	}
	public void init(String generalType, String uniqueID, String name, String description, int value){
		this.generalType=generalType;this.uniqueID=uniqueID;this.name=name;this.description=description;this.value=value;
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
	public ArrayList<Stat> getSubStats() {
		return subStats;
	}
	public void setSubStats(ArrayList<Stat> substats) {
		this.subStats = substats;
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
