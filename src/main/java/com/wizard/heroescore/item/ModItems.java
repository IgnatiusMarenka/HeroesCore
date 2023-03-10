package com.wizard.heroescore.item;

import com.wizard.heroescore.HeroesCore;
import com.wizard.heroescore.item.custom.HeroesTabletItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HeroesCore.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEROES_CORE_TAB)));

    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEROES_CORE_TAB)));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEROES_CORE_TAB)));

    public static final RegistryObject<Item> HEROES_TABLET = ITEMS.register("heroes_tablet",
            () -> new HeroesTabletItem(new Item.Properties().tab(ModCreativeModeTab.HEROES_CORE_TAB).durability(3)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
