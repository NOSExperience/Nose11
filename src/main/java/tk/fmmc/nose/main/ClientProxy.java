package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.parsing.Discoverer;

public class ClientProxy extends CommonProxy {
	void preInit(FMLPreInitializationEvent e) throws Exception {
		super.preInit(e);
		
		Downloader.download();
		
		Discoverer ds = new Discoverer();
		ds.run();
	}
	
	void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	void postInit(FMLPostInitializationEvent e) throws Exception {
		super.postInit(e);
	}
}
