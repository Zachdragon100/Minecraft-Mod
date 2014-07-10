package com.Zachdragon100.mcraftMod.init;

import com.Zachdragon100.mcraftMod.item.ItemMCMOD;
import com.Zachdragon100.mcraftMod.item.ItemStickyStick;
import com.Zachdragon100.mcraftMod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemMCMOD stickyStick = new ItemStickyStick();


    public static void init(){
        GameRegistry.registerItem(stickyStick, Names.STICKY_STICK_NAME);
    }
}
