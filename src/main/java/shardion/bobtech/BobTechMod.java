package shardion.bobtech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import shardion.bobtech.items.ChargedLazuliPowderItem;
import shardion.bobtech.registries.BobTechRegistry;

public class BobTechMod implements ModInitializer {
	@Override
	public void onInitialize() {
		BobTechRegistry.register();
	}
}
