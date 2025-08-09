package de.schrobsy.extremegenerators.item;

import de.schrobsy.extremegenerators.ExtremeGenerators;
import de.schrobsy.extremegenerators.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtremeGenerators.MOD_ID);

    public static final Supplier<CreativeModeTab> EXTREME_GENERATORS_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("extremgenerators_items_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.extremgenerators_items"))
                    .icon(() -> new ItemStack(ModBlocks.BIO_GENERATOR.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BIO_GENERATOR);
                    }).build());

 /*   public static final Supplier<CreativeModeTab> BLACK_OPAL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("black_opal_blocks_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mccourse.black_opal_blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MCCourseMod.MOD_ID, "black_opal_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK);

                    }).build());*/



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
