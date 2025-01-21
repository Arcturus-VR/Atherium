package net.ryan.Atherium.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ryan.Atherium.AtheriumMain;
import net.ryan.Atherium.Items.custom.ManatiteItem;
import net.ryan.Atherium.Items.custom.StaffItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AtheriumMain.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUH = ITEMS.register("huh",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANATITE = ITEMS.register("manatite",
            () -> new ManatiteItem(new Item.Properties().durability(1)));
    public static final RegistryObject<Item> BLAND_STAFF = ITEMS.register("bland_staff",
            () -> new StaffItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
