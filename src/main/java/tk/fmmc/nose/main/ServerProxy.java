package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {
	void preInit(FMLPreInitializationEvent e) throws Exception {
		super.preInit(e);
	}
	
	void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	void postInit(FMLPostInitializationEvent e) throws Exception {
		super.postInit(e);
	}
}
