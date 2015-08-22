package com.piratecody.sandstorm.blocks;

import com.piratecody.sandstorm.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SSBlock extends Block
{
    public SSBlock(String name)
    {
        super(Material.sand);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":"+ name);
        this.setHardness(0.7F);
        this.setResistance(0.5F);
        
       
    }
    
   

}