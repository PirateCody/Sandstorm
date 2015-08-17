package com.piratecody.sandstorm;

import com.piratecody.sandstorm.crafting.Recipes;
import com.piratecody.sandstorm.init.ModBlocks;
import com.piratecody.sandstorm.init.SandstormItems;
import com.piratecody.sandstorm.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Sandstorm {
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Instance(Reference.MODID)
	public static Sandstorm instance;
	
	
	//inits
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		SandstormItems.registerItems();
		ModBlocks.registerBlocks();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		Recipes.registerRecipes();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	

}
