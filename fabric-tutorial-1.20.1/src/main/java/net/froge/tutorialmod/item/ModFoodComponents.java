package net.froge.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent DORITO_TACO = new FoodComponent.Builder().hunger(5).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200), 0.5f).build();

    public static final FoodComponent CRUNCHWRAP = new FoodComponent.Builder().hunger(8).saturationModifier(3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1000, 10), 0.8f).build();

}
