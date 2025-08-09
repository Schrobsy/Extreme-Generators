package de.schrobsy.extremegenerators.event;

import de.schrobsy.extremegenerators.block.entity.ModBlockEntities;
import de.schrobsy.extremegenerators.block.entity.custom.BioGeneratorBlockEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

@EventBusSubscriber
public class ModBusEvents {
    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ModBlockEntities.BIO_GENERATOR_BE.get(), BioGeneratorBlockEntity::getEnergyStorage);

    }
}