package com.vandendaelen.techor.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CutCastIronBlock extends Block {
    public CutCastIronBlock() {
        super(Properties.create(Material.IRON).harvestLevel(3).sound(SoundType.METAL).setRequiresTool());
    }
}
