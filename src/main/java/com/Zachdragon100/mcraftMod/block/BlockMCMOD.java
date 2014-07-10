package com.Zachdragon100.mcraftMod.block;

import com.Zachdragon100.mcraftMod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMCMOD extends Block{
    public BlockMCMOD(){
        this(Material.rock);
    }

    public BlockMCMOD(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.MCMOD_TAB);
    }
}
