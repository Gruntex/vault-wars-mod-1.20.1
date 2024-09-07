package net.froge.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.froge.tutorialmod.screen.GemPolishingScreen;
import net.froge.tutorialmod.screen.ModScreenHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandler.GEM_POLISHING_SCREEN_HANDLER, GemPolishingScreen:: new);

    }

}
