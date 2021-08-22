package com.vandendaelen.techor.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CutIronBlock extends Block {
    public CutIronBlock() {
        super(Properties.create(Material.IRON).harvestLevel(3).sound(SoundType.METAL).setRequiresTool());
    }
}
