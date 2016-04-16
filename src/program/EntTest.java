package program;


import java.util.ArrayList;

import program.objectsBundle.*;
import program.objectsBundle.garbage.GameObject;
import program.objectsBundle.garbage.InventoryItem;
import program.objectsBundle.garbage.ThingFactory;


public class EntTest {
	
	public EntTest() {
		runTest(getTestPlayer());
	}
	private Entity getTestPlayer(){
		Entity player = new Entity();
		player.init("testPlayer", "NOID", "player1", "a player");
		
		Stat s = new Stat();
		s.init("t", "s0000", "hp", "a stat", 0);
		Stat s1 = new Stat();
		s1.init("te", "s0001", "strength", "a stat", 1);
		Stat s2 = new Stat();
		s2.init("tes", "s0002", "agility", "a stat", 2);
		Stat s3 = new Stat();
		s3.init("test", "s0003", "stealth", "a stat", 3);
		Stat s4 = new Stat();
		s4.init("testS", "s0004", "willpower", "a stat", 4);
		Stat s5 = new Stat();
		s5.init("testSt", "s0005", "stamina", "a stat", 5);
		Stat s6 = new Stat();
		s6.init("testStat", "s0006", "focus", "a stat", 6);
		
		Item object = new Item();
		object.init("testObject", "i0000", "test object", "an object", 5);
		Item object1 = new Item();
		object.init("testObject", "i0001", "test object1", "an object", 1);
		Item component = new Item();
		component.init("testComponent", "i0002", "test component", "a component", 1);
		
		component.getStats().add(s6);component.getStats().add(s5);
		
		object.getComponents().add(component);
		
		object.getStats().add(s4);object.getStats().add(s3);
		
		s.getSubStats().add(s1);s.getSubStats().add(s2);
		
		player.getStats().add(s);
		
		player.getInventory().add(object);
		player.getInventory().add(object1);
		
		return player;
	}
	private void runTest(Entity e) {
		System.out.println(e.pullAllData());
	}
}
