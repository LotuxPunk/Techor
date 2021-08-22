package com.vandendaelen.techor.common;

import com.vandendaelen.techor.Techor;
import com.vandendaelen.techor.common.blocks.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TechorTab {
    public static ItemGroup MAIN_TAB = new ItemGroup(Techor.MODID + ".blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.CUT_CAST_IRON_BLOCK.get());
        }
    };
}
