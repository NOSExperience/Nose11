package tk.fmmc.nose.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tk.fmmc.nose.network.Downloader;

public class ClientProxy extends CommonProxy {
	void preInit(FMLPreInitializationEvent e) throws Exception {
		super.preInit(e);
		
		//Downloader.preInit(Main.URL);
		Downloader.downloadXML();
		
		Block test = new Block(Material.ROCK).setRegistryName("test");
		GameRegistry.register(test);
		
		ItemBlock test_item = new ItemBlock(test);
		test_item.setRegistryName("test");
		GameRegistry.register(test_item);
	}
	
	void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	void postInit(FMLPostInitializationEvent e) throws Exception {
		super.postInit(e);
	}
}
