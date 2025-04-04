package net.sided.steelgenesis.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.sided.steelgenesis.SteelGenesis;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ALUMINUM_ALLOY = registerItem("aluminum_alloy", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SteelGenesis.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SteelGenesis.LOGGER.info("Registering Mod Items For " + SteelGenesis.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(ALUMINUM_ALLOY);
            entries.add(RAW_ALUMINUM);
        });
    }
}
