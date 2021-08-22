package com.vandendaelen.techor.common.blocks;

import com.vandendaelen.techor.Techor;
import com.vandendaelen.techor.common.TechorTab;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Techor.MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Techor.MODID);

    public static final RegistryObject<Block> CUT_CAST_IRON_BLOCK = register("cut_cast_iron_block", () -> setUpBlock(new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(3).sound(SoundType.METAL).setRequiresTool())), true);
    public static final RegistryObject<Block> CUT_CAST_IRON_LAMP = register("cut_cast_iron_lamp", () -> setUpBlock(new RedstoneLampBlock(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).harvestLevel(3).setLightLevel(getLightValueLit(15)).sound(SoundType.METAL).setRequiresTool())), true);
    public static final RegistryObject<Block> CUT_IRON_BLOCK = register("cut_iron_block", () -> setUpBlock(new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(3).sound(SoundType.METAL).setRequiresTool())), true);
    public static final RegistryObject<Block> CUT_IRON_LAMP = register("cut_iron_lamp", () -> setUpBlock(new RedstoneLampBlock(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).harvestLevel(3).setLightLevel(getLightValueLit(15)).sound(SoundType.METAL).setRequiresTool())), true);
    public static final RegistryObject<Block> CUT_IRON_STAIRS = register("cut_iron_stairs",() -> setUpBlock(new StairsBlock(() -> net.minecraft.block.Blocks.IRON_BLOCK.getDefaultState(), Block.Properties.create(Material.IRON))), true);

    private static Block setUpBlock(Block block) {
        return block;
    }

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, boolean hasItem){
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        if (hasItem)
            BLOCK_ITEMS.register(id, () -> new BlockItem(registryObject.get(), new Item.Properties().group(TechorTab.MAIN_TAB)));
        return registryObject;
    }

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> {
            return state.get(BlockStateProperties.LIT) ? 0 : lightValue;
        };
    }

}
