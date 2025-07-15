package fr.redstoner507.storkmod.item;

import fr.redstoner507.storkmod.StorkMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, StorkMod.MOD_ID);

    public static final RegistryObject<Item> STORK_CATCHER = ITEMS.register("stork_catcher",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STORK_FEATHER = ITEMS.register("stork_feather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STORK_EGG = ITEMS.register("stork_egg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
