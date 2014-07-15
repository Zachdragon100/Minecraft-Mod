package com.Zachdragon100.mcraftMod.creativetab;

import com.Zachdragon100.mcraftMod.init.ModItems;
import com.Zachdragon100.mcraftMod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public static final CreativeTabs MCMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem(){
            return ModItems.stickyStick;
        };
    };
}
