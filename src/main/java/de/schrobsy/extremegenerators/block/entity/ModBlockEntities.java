package de.schrobsy.extremegenerators.block.entity;

import de.schrobsy.extremegenerators.ExtremeGenerators;
import de.schrobsy.extremegenerators.block.ModBlocks;
import de.schrobsy.extremegenerators.block.entity.custom.BioGeneratorBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ExtremeGenerators.MOD_ID);

    /*public static final Supplier<BlockEntityType<HeartBlockEntity>> HEART_BE =
            BLOCK_ENTITIES.register("heart_be", () -> BlockEntityType.Builder.of(
                    HeartBlockEntity::new, ModBlocks.HEART_BLOCK.get()).build(null));*/

    public static final Supplier<BlockEntityType<BioGeneratorBlockEntity>> BIO_GENERATOR_BE =
        BLOCK_ENTITIES.register("bio_generator_be", () -> BlockEntityType.Builder.of(
                BioGeneratorBlockEntity::new, ModBlocks.BIO_GENERATOR.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
