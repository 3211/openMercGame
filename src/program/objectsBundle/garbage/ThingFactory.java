package program.objectsBundle.garbage;

public final class ThingFactory{
	public static Ent buildEnt(String[] playerdata){
		Ent e = new Ent();
		e.setName("unnamed");
		e.setDescriptionText(new String[]{"this is an example npc","honest"});
		
		Stat hp = new Stat();
		hp.setName("hp");
		hp.setAmount(100);
		
		e.getStats().add(hp);
		
		InventoryItem gun = new InventoryItem();
		gun.setName("9mm pistol");
		gun.setAmount(1);
		InventoryItem clip = new InventoryItem();
		clip.setName("9mm 15 round clip");
		clip.setAmount(1);
		InventoryItem bullet = new InventoryItem();
		bullet.setName("9mm bullet");
		bullet.setAmount(15);
		
		Stat acc = new Stat();
		acc.setName("accuracy");
		acc.setAmount(5);
		
		Stat range = new Stat();
		range.setName("range");
		range.setAmount(5);
		
		Stat dmg = new Stat();
		dmg.setName("damage");
		dmg.setAmount(10);
		
		Stat max = new Stat();
		max.setName("max_bullets");
		max.setAmount(15);
		
		clip.getStats().add(max);
		bullet.getStats().add(dmg);
		gun.getStats().add(range);
		gun.getStats().add(acc);
		
		clip.getInventory().add(bullet);
		gun.getInventory().add(clip);
		e.getInventory().add(gun);
		return e;
	}
}
