package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "nose";
	public static final String MODNAME = "Nose 11";
	public static final String VERSION = "0.1";
	
	@SidedProxy(clientSide = "tk.fmmc.nose.main.ClientProxy", serverSide = "tk.fmmc.nose.main.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	void preInit(FMLPreInitializationEvent e) throws Exception {
		proxy.preInit(e);
	}
	
	@EventHandler
	void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	void postInit(FMLPostInitializationEvent e) throws Exception {
		proxy.postInit(e);
	}
}