package com.vandendaelen.techor.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;

import java.util.function.ToIntFunction;

public class CutIronLamp extends RedstoneLampBlock {
    public CutIronLamp() {
        super(Properties.create(Material.IRON).harvestLevel(3).setLightLevel(getLightValueLit(15)).sound(SoundType.METAL).setRequiresTool());
    }

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> {
            return state.get(BlockStateProperties.LIT) ? lightValue : 0;
        };
    }
}
