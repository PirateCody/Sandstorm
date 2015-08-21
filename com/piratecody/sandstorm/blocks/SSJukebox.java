package com.piratecody.sandstorm.blocks;

import com.piratecody.sandstorm.Reference;

import net.minecraft.block.BlockJukebox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class SSJukebox<String> extends BlockJukebox{
	
	public SSJukebox(String name){
		
		super();
		
		this.setBlockTextureName(Reference.MODID + ":" + name);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		
		
		
		
	}
	
	@Override
	public void func_149925_e(World p_149925_1_, int p_149925_2_, int p_149925_3_, int p_149925_4_)
    {
        if (!p_149925_1_.isRemote)
        {
            SSJukebox.TileEntityJukebox tileentityjukebox = (SSJukebox.TileEntityJukebox)p_149925_1_.getTileEntity(p_149925_2_, p_149925_3_, p_149925_4_);

            if (tileentityjukebox != null)
            {
                ItemStack itemstack = tileentityjukebox.func_145856_a();

                if (itemstack != null)
                {
                    p_149925_1_.playAuxSFX(1005, p_149925_2_, p_149925_3_, p_149925_4_, 0);
                    p_149925_1_.playRecord((String)null, p_149925_2_, p_149925_3_, p_149925_4_);
                    tileentityjukebox.func_145857_a((ItemStack)null);
                    p_149925_1_.setBlockMetadataWithNotify(p_149925_2_, p_149925_3_, p_149925_4_, 0, 2);
                    float f = 0.7F;
                    double d0 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d1 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.2D + 0.6D;
                    double d2 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    ItemStack itemstack1 = itemstack.copy();
                    EntityItem entityitem = new EntityItem(p_149925_1_, (double)p_149925_2_ + d0, (double)p_149925_3_ + d1, (double)p_149925_4_ + d2, itemstack1);
                    entityitem.delayBeforeCanPickup = 10;
                    p_149925_1_.spawnEntityInWorld(entityitem);
                }
            }
        }
    }

}
