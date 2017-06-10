package com.piratecody.sandstorm.items;

import com.piratecody.sandstorm.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemSandstormRecord extends ItemRecord{
	
	
	public ItemSandstormRecord(String name)
    {
        super("sandstorm");
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName("record");
        this.setTextureName(Reference.MODID + ":" + name);
    }

	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}
	

}
