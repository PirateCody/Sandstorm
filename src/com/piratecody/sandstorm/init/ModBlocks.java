package com.piratecody.sandstorm.init;

import com.piratecody.sandstorm.blocks.SSBlock;
//import com.piratecody.sandstorm.blocks.SSJukebox;
import com.piratecody.sandstorm.helpers.RegisterHelper;



import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block compressedSand = new SSBlock("compressedSand");
	//public static Block SSJukebox = new SSJukebox("SSJukebox");
	
	public static void registerBlocks(){
		
		RegisterHelper.registerBlock(compressedSand);
		//RegisterHelper.registerBlock(SSJukebox);
		
	}

}
