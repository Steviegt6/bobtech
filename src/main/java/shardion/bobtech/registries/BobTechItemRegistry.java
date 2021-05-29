package shardion.bobtech.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import shardion.bobtech.items.ChargedLazuliPowderItem;
import shardion.bobtech.util.BobTechIdentifier;

public class BobTechItemRegistry {
    public static final Item FAKE_COPPER_INGOT_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item LAPIS_LAZULI_DUST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item CHARGED_LAZULI_DUST_ITEM = new ChargedLazuliPowderItem(new FabricItemSettings().group(ItemGroup.MISC));

    public static void register() {
        registerItem(new BobTechIdentifier("fake_copper_ingot"), FAKE_COPPER_INGOT_ITEM);
        registerItem(new BobTechIdentifier("lapis_lazuli_dust"), LAPIS_LAZULI_DUST_ITEM);
        registerItem(new BobTechIdentifier("charged_lazuli_powder"), CHARGED_LAZULI_DUST_ITEM);
    }

    public static void registerItem(Identifier id, Item item) {
        Registry.register(Registry.ITEM, id, item);
    }
}
