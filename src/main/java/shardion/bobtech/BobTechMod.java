package shardion.bobtech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import shardion.bobtech.items.ChargedLazuliPowderItem;

public class BobTechMod implements ModInitializer {

	// Basic items
	public static final Item FAKE_COPPER_INGOT_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item LAPIS_LAZULI_DUST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CHARGED_LAZULI_DUST_ITEM = new ChargedLazuliPowderItem(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// Register the basic items
		Registry.register(Registry.ITEM, new Identifier("bobtech", "fake_copper_ingot"), FAKE_COPPER_INGOT_ITEM);
		Registry.register(Registry.ITEM, new Identifier("bobtech", "lapis_lazuli_dust"), LAPIS_LAZULI_DUST_ITEM);
		Registry.register(Registry.ITEM, new Identifier("bobtech", "charged_lazuli_powder"), CHARGED_LAZULI_DUST_ITEM);
	}
}
