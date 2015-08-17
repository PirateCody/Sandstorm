package com.piratecody.sandstorm.init;

import com.piratecody.sandstorm.blocks.SSBlock;
import com.piratecody.sandstorm.helpers.RegisterHelper;


import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block compressedSand = new SSBlock("CompressedSand");
	
	public static void registerBlocks(){
		
		RegisterHelper.registerBlock(compressedSand);
		
	}

}
