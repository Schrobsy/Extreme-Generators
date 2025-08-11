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
            CREATIVE_MODE_TABS.register("extremegenerators_items_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.extremegenerators"))
                    .icon(() -> new ItemStack(ModBlocks.BIO_GENERATOR.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BIO_GENERATOR);
                        pOutput.accept(ModItems.BIO_MASS);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
