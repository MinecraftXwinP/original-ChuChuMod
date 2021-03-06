package com.chuchu.chumod.items;

import com.chuchu.chumod.init.ModItems;
import com.chuchu.chumod.util.IHasModel;

import com.chuchu.chumod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this) ;
	}

	@Override
	public void registerModels() {
		Main.proxy.registerRenderer(this , 0 , "inventory" );
	}

	
}
