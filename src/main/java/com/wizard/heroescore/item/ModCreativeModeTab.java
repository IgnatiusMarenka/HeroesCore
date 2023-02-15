package com.wizard.heroescore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HEROES_CORE_TAB = new CreativeModeTab("heroescoretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_INGOT.get());
        }
    };
}
