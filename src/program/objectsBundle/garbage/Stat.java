package program.objectsBundle.garbage;

import java.util.ArrayList;

public class Stat extends GameObject{
	private final String objType = "Stat";
	private String[] descriptionText;
	private ArrayList<Stat> stats;
	public void init(){
		setStats(new ArrayList<Stat>());
		setDescriptionText(new String[]{""});
	}
	public String[] getDescriptionText() {
		return descriptionText;
	}
	public void setDescriptionText(String[] descriptionText) {
		this.descriptionText = descriptionText;
	}
	public void setStats(ArrayList<Stat> stats){
		this.stats = stats;
	}
	public ArrayList<Stat> getStats(){
		return stats;
	}
	public String getObjType() {
		return objType;
	}
}
