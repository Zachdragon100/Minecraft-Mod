package com.Zachdragon100.mcraftMod.creativetab;

import com.Zachdragon100.mcraftMod.init.ModItems;
import com.Zachdragon100.mcraftMod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTab {
    public static final CreativeTabs MCMOD_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.stickyStick;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel(){
            return StatCollector.translateToLocal("key.categories.mcmod");
        }
    };
}
