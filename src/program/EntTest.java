package program;


import java.util.ArrayList;

import program.objectsBundle.*;
import program.objectsBundle.garbage.GameObject;
import program.objectsBundle.garbage.InventoryItem;
import program.objectsBundle.garbage.ThingFactory;

public class EntTest {

	public EntTest() {
		GameObject e = ThingFactory.buildEnt(new String[]{});
		
			ArrayList<InventoryItem> search = e.getInventory().get(0).nameSearchComponent("9mm");
			if(search!=null){
				System.out.println("results: "+search.size());
				for(InventoryItem i : search){
					System.out.println(i.getName());
					System.out.println(i.getAmount());
				}
			}
	}
}
