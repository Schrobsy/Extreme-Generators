package de.schrobsy.extremegenerators.datagen;


import de.schrobsy.extremegenerators.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BIO_GENERATOR.get());
      //  add(ModBlocks.VOID_SOURCE.get(), block -> createOreDrop(ModBlocks.VOID_SOURCE.get(), ModItems.VOID_INGOT.get()));
        // for Ores:
      //   add(ModBlocks.VOID_BLOCK.get(),
      //         block -> createOreDrop(ModBlocks.VOID_BLOCK.get(), ModItems.VOID_INGOT.get()));
// Multiple Ore Drops
    //     add(ModBlocks.VOID_BLOCK.get(),
      //           block -> createMultifaceBlockDrops((ModBlocks.VOID_BLOCK.get(), ModBlocks.VOID_BLOCK.get(), 2,5));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
