package com.vandendaelen.techor.common.blocks;

import com.vandendaelen.techor.Techor;
import com.vandendaelen.techor.common.TechorTab;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Techor.MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Techor.MODID);

    public static final RegistryObject<Block> CUT_CAST_IRON_BLOCK = register("cut_cast_iron_block", () -> setUpBlock(new CutCastIronBlock()), true);
    public static final RegistryObject<Block> CUT_CAST_IRON_LAMP = register("cut_cast_iron_lamp", () -> setUpBlock(new CutCastIronLamp()), true);
    public static final RegistryObject<Block> CUT_IRON_BLOCK = register("cut_iron_block", () -> setUpBlock(new CutIronBlock()), true);
    public static final RegistryObject<Block> CUT_IRON_LAMP= register("cut_iron_lamp", () -> setUpBlock(new CutIronLamp()), true);

    private static Block setUpBlock(Block block) {
        return block;
    }

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, boolean hasItem){
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        if (hasItem)
            BLOCK_ITEMS.register(id, () -> new BlockItem(registryObject.get(), new Item.Properties().group(TechorTab.MAIN_TAB)));
        return registryObject;
    }

}
