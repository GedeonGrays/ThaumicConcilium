package com.ilya3point999k.thaumicconcilium.common.research;

import com.ilya3point999k.thaumicconcilium.common.registry.Thaumonomicon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategoryList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

/**
 * This class was created by <flaxbeard> as part of Thaumic Exploration. It is
 * being distributed as part of Tainted Magic.
 * And also as part of Thaumic Concilium
 */
public class ThaumcraftResearchItem extends ResearchItem {
	public ResearchItem original;

	public ThaumcraftResearchItem(String tag, String origin, String originCategory, int col, int row,
			ResourceLocation icon) {
		super(tag, Thaumonomicon.catName, new AspectList(), col, row, 1, icon);
		original = ResearchCategories.researchCategories.get(originCategory).research
				.get(origin);
		bindToOriginal();
		setStub();
		setHidden();
	}

	public ThaumcraftResearchItem(String tag, String origin, String originCategory, int col, int row, ItemStack icon) {
		super(tag, Thaumonomicon.catName, new AspectList(), col, row, 1, icon);
		original = ResearchCategories.researchCategories.get(originCategory).research
				.get(origin);
		bindToOriginal();
		setStub();
		setHidden();
	}

	private void bindToOriginal() {
		if (original.siblings == null)
			original.setSiblings(key);
		else {
			String[] family = original.siblings;
			String[] newFamily = new String[family.length + 1];
			System.arraycopy(family, 0, newFamily, 0, family.length);
			newFamily[family.length] = key;
			original.setSiblings(newFamily);
		}
		if (original.isSecondary()) {
			this.setSecondary();
		}
	}

	public ResearchPage[] getPages() {
		return original.getPages();
	}

	@SideOnly(Side.CLIENT)
	public String getName() {
		return original.getName();
	}

	@SideOnly(Side.CLIENT)
	public String getText() {
		return original.getText();
	}

	public boolean isStub() {
		return true;
	}

	public boolean isHidden() {
		return true;
	}

	public int getComplexity() {
		return 1;
	}
}
