package program.objectsBundle.garbage;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

public class GameObject{
	private final String objType = "GameObject";
	private String ID;
	private String name;
	private int amount;
	private int complexity;
	public GameObject(){
		init();
	}

	public String getUniqueItemID() {
		return ID;
	}

	public void setUniqueItemID(String uniqueItemID) {
		this.ID = uniqueItemID;
	}

	public int getComplexity() {
		return complexity;
	}
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getObjType() {
		return objType;
	}
	public void loadObject(String ID, String name, int amount, int complexity){
		this.ID = ID; this.name = name; this.amount = amount; this.complexity = complexity;
	}
	//interface-type methods
	public void init(){}
	public InventoryItem locateComponent(String targetName){return null;}
	public void paint(Graphics g, int x, int y, int width, int height){}
	public Image getImg(){return null;}
	public void setImg(Image img){}
	public ArrayList<Stat> getStats(){return null;}
	public void setStats(ArrayList<Stat> stats){}
	public ArrayList<InventoryItem> getInventory() {return null;}
	public void setInventory(ArrayList<InventoryItem> inventory){}
	public String[] getDescriptionText(){return null;}
	public void setDescriptionText(String[] descriptionText) {}
	public String getImgID(){return null;}
	public void setImgID(String imgID){}
	public boolean isDrawable(){return false;}
}
