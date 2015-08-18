package com.piratecody.sandstorm.blocks;

import com.piratecody.sandstorm.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SSBlock extends Block
{
    public SSBlock(String name)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":"+ name);
       
    }
}