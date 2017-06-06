package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy {
	void preInit(FMLPreInitializationEvent e) throws Exception {
	}
	
	void init(FMLInitializationEvent e) {
	}
	
	void postInit(FMLPostInitializationEvent e) throws Exception {
	} 
}
