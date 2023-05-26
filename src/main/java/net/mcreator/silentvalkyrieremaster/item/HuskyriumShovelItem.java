
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public class HuskyriumShovelItem extends ShovelItem {
	public HuskyriumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.HUSKYRIUM.get()));
			}
		}, 1, -1f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
	}
}
