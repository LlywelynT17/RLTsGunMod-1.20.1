package net.llywelynt17.rlt_gunmod.item;

import net.llywelynt17.rlt_gunmod.RLT_GunMod;
import net.llywelynt17.rlt_gunmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RLT_GunMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GUNMOD_TAB = CREATIVE_MODE_TABS.register("gunmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMMO280.get()))
                    .title(Component.translatable("creativetab.gunmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMMO280.get());
                        output.accept(ModItems.AMMO303.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> GUNMODINGREDIENTS_TAB = CREATIVE_MODE_TABS.register("gunmodingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRASSINGOT.get()))
                    .title(Component.translatable("creativetab.gunmodingredients_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BRASSORE_BLOCK.get());
                        output.accept(ModItems.RAWBRASS.get());
                        output.accept(ModItems.BRASSINGOT.get());
                        output.accept(ModItems.DRAWNCASE.get());
                        output.accept(ModItems.PRIMER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
