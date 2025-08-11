package de.schrobsy.extremegenerators.datagen;

import de.schrobsy.extremegenerators.ExtremeGenerators;
import de.schrobsy.extremegenerators.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExtremeGenerators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //register Items
    basicItem(ModItems.BIO_MASS.get());
    }
}
