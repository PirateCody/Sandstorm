package com.piratecody.sandstorm.init;

import com.piratecody.sandstorm.helpers.RegisterHelper;
import com.piratecody.sandstorm.items.ItemSandstormRecord;
import com.piratecody.sandstorm.items.SSItem;

import net.minecraft.item.Item;

public class SandstormItems {
	
	
	public static Item SandstormRecord = new ItemSandstormRecord("Sandstorm").setUnlocalizedName("Sandstorm");
	public static Item SandShard = new SSItem("SandShard");
	public static Item darudeEssence = new SSItem("darudeEssence");
	public static Item sandstormFrag = new SSItem("sandstormFrag");
	public static Item primordialSS = new SSItem("primordialSS");
	
	public static void registerItems(){
		
		RegisterHelper.registerItem(SandstormRecord);
		RegisterHelper.registerItem(SandShard);
		RegisterHelper.registerItem(darudeEssence);
		RegisterHelper.registerItem(sandstormFrag);
		RegisterHelper.registerItem(primordialSS);
	}
	

}
