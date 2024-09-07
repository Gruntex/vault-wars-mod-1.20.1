package net.froge.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.froge.tutorialmod.block.ModBlocks;
import net.froge.tutorialmod.block.entity.ModBlockEntities;
import net.froge.tutorialmod.item.ModItemGroups;
import net.froge.tutorialmod.item.ModItems;
import net.froge.tutorialmod.screen.ModScreenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandler.registerScreenHandler();

		FuelRegistry.INSTANCE.add(ModItems.BURN_DUST, 200);
	}
}