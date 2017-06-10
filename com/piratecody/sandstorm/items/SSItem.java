package com.piratecody.sandstorm.items;

import com.piratecody.sandstorm.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class SSItem extends Item
{
    public SSItem(String name)
    {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }
}

