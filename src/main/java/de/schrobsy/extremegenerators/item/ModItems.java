package de.schrobsy.extremegenerators.item;

import de.schrobsy.extremegenerators.ExtremeGenerators;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ExtremeGenerators.MOD_ID);

    public static final DeferredItem<Item> BIO_MASS = ITEMS.register("bio_mass",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
