package de.schrobsy.extremegenerators.datagen;

import de.schrobsy.extremegenerators.ExtremeGenerators;
import de.schrobsy.extremegenerators.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExtremeGenerators.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // register Blocks
        blockWithItem(ModBlocks.BIO_GENERATOR);
     //   blockWithItem(ModBlocks.VOID_SOURCE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
