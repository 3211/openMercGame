package program.objectsBundle.garbage;

import java.util.ArrayList;
import java.util.Iterator;

public class InventoryItem extends DrawableGameObject{
	private final String objType = "InventoryItem";
	private ArrayList<Stat> stats;
	private ArrayList<InventoryItem> components;
	private String[] descriptionText;
	public void init(){
		setStats(new ArrayList<Stat>());
		setInventory(new ArrayList<InventoryItem>());
		setDescriptionText(new String[]{""});
	}
	public void loadObject(String ID, String name, int amount, int complexity, ArrayList<Stat> stats, ArrayList<InventoryItem> components){
		setUniqueItemID(ID);
		setName(name);
		setAmount(amount);
		setComplexity(complexity);
		setInventory(components);
		setStats(stats);
	}
	public InventoryItem locateExactComponent(String targetName){
		//if the item is the component, it returns itself at the bottom.
		if(!getName().equals(targetName)){
			//if not, each item in the inventory is searched
			for(InventoryItem item : getInventory()){
				//if the item is found
				if(item.getName().equals(targetName)){
					//it is returned
					return item;
					//if not...
				} else {
					//we have to go deeper
					InventoryItem goDeeper = item.locateExactComponent(targetName);
					if(goDeeper!=null){
						return goDeeper;
					}
				}
			}
			return null;
		} else {
			return this;
		}
	}
	public ArrayList<InventoryItem> nameSearchComponent(String targetName){
		ArrayList<InventoryItem> matches = new ArrayList<InventoryItem>();
		//if(getName().contains(targetName)){
			//matches.add(this);
		//}
		for(InventoryItem item : getInventory()){
			if(item.getName().contains(targetName)){
				matches.add(item);
			} 
			ArrayList<InventoryItem> goDeeper = item.nameSearchComponent(targetName);
			if(goDeeper!=null){
				for(InventoryItem m : goDeeper){
					matches.add(m);
				}
			}
		}
		return matches;
		//return removeBugDuplicates(matches);
		//TODO fix this bug;
	}
	private ArrayList<InventoryItem> removeBugDuplicates(ArrayList<InventoryItem> item){
		for(int i=0;i<item.size();i++){
			int j = i+1;
			if(j<item.size()){
				if(item.get(i).equals(item.get(j))){
					item.remove(j);
					i--;
				}
			}
		}
		return item;
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
		return components;
	}
	public void setInventory(ArrayList<InventoryItem> components) {
		this.components = components;
	}
	public String getObjType() {
		return objType;
	}
}
