package net.llywelynt17.rlt_gunmod.item;

import net.llywelynt17.rlt_gunmod.RLT_GunMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RLT_GunMod.MOD_ID);

    public static final RegistryObject<Item> AMMO280 = ITEMS.register("ammo280",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO303 = ITEMS.register("ammo303",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRASSINGOT = ITEMS.register("brassingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAWBRASS = ITEMS.register("rawbrass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAWNCASE = ITEMS.register("drawncase",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRIMER = ITEMS.register("primer",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
