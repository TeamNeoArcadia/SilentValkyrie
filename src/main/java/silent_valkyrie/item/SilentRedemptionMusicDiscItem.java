
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkAddonsItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

@SilentValkyrieModElements.ModElement.Tag
public class SilentRedemptionMusicDiscItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:silent_redemption_music_disc")
	public static final Item block = null;

	public SilentRedemptionMusicDiscItem(SilentValkyrieModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SilentValkyrieModElements.sounds.get(new ResourceLocation("silent_valkyrie:silentredemption1")),
					new Item.Properties().group(SilentValkAddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("silent_redemption_music_disc");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
