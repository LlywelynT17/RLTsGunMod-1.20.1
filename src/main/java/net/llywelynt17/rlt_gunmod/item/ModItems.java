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
//ammo:
    public static final RegistryObject<Item> AMMO280 = ITEMS.register("ammo280",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO303 = ITEMS.register("ammo303",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO455 = ITEMS.register("ammo455",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO9MM = ITEMS.register("ammo9mm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO762 = ITEMS.register("ammo762",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMMO792 = ITEMS.register("ammo792",
            () -> new Item(new Item.Properties()));
//bullets:
    public static final RegistryObject<Item> BULLET280 = ITEMS.register("bullet280",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET303 = ITEMS.register("bullet303",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET455 = ITEMS.register("bullet455",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET9MM = ITEMS.register("bullet9mm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET762 = ITEMS.register("bullet762",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET792 = ITEMS.register("bullet792",
            () -> new Item(new Item.Properties()));
//parts:
    public static final RegistryObject<Item> BRASSINGOT = ITEMS.register("brassingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAWBRASS = ITEMS.register("rawbrass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAWNCASE = ITEMS.register("drawncase",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRIMER = ITEMS.register("primer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEADMETAL = ITEMS.register("leadmetal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
