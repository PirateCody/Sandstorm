package com.piratecody.sandstorm.blocks;

import com.piratecody.sandstorm.Reference;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;

public class SSBlock extends BlockFalling{



    public SSBlock(String name)
    {
        super();
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setHardness(0.8F);
        this.setResistance(0.5F);
        this.setStepSound(soundTypeSand);
        this.setLightLevel(0.1F);
        this.setBlockTextureName(Reference.MODID + ":"+ name);
        
       
    }
    
    public static final String[] field_149838_a = new String[] {"default", "red"};
    private static final String __OBFID = "CL_00000303";

    
    public MapColor getMapColor(int p_149728_1_)
    {
        return p_149728_1_ == 1 ? MapColor.dirtColor : MapColor.sandColor;
    }
}
   
   