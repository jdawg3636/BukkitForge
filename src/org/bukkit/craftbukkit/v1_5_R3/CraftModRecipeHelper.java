package org.bukkit.craftbukkit.v1_5_R3;

import net.minecraft.item.crafting.CraftingManager;

public class CraftModRecipeHelper {

	private static CraftingManager theCraftingManager;
	
	public static void saveCraftingManagerRecipes() {
		theCraftingManager = CraftingManager.getInstance();
	}
	
	public static CraftingManager getOriginalCraftingManager() {
		if (theCraftingManager == null)
			saveCraftingManagerRecipes();
		return theCraftingManager;
	}
	
}
