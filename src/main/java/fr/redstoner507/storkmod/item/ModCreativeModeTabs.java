package fr.redstoner507.storkmod.item;

import fr.redstoner507.storkmod.StorkMod;
import fr.redstoner507.storkmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorkMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STORK_MOD_TAB = CREATIVE_MODE_TABS.register("stork_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STORK_FEATHER.get()))
                    //.withTabsBefore()
                    .title(Component.translatable("creativetab.storkmod.stork_mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STORK_CATCHER.get());
                        output.accept(ModItems.STORK_FEATHER.get());
                        output.accept(ModItems.STORK_EGG.get());
                        output.accept(ModBlocks.STORK_NEST_BLOCK.get());
                        output.accept(ModItems.CHISEL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
