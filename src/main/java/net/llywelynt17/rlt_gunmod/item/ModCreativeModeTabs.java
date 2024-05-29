package net.llywelynt17.rlt_gunmod.item;

import net.llywelynt17.rlt_gunmod.RLT_GunMod;
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

    public static final RegistryObject<CreativeModeTab> GUNMODAMMO_TAB = CREATIVE_MODE_TABS.register("gunmodammo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMMO280.get()))
                    .title(Component.translatable("creativetab.gunmodeammo_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.
                    })
                    .build())

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
