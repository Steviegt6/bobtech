// TODO: Probably don't need a custom item class for this? See ReplaceEntityMixin.

package shardion.bobtech.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ChargedLazuliPowderItem extends Item {

    public ChargedLazuliPowderItem(Settings settings) {
        super(settings);
    }
}