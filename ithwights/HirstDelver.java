/*package com.personj.changedttu.meanly.ithwights;

import java.util.List;

import javax.annotation.Nullable;

import com.personj.changedttu.meanly.wight.CostForesets;

import net.ltxprogrammer.changed.entity.HairStyle;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.entity.TransfurMode;
import net.ltxprogrammer.changed.entity.beast.AbstractLatexWolf;
import net.ltxprogrammer.changed.entity.beast.DarkLatexEntity;
import net.ltxprogrammer.changed.util.Color3;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.level.Level;

public class HirstDelver extends AbstractLatexWolf implements DarkLatexEntity{

	public HirstDelver(EntityType<HirstDelver> kind, Level world) {
		super(kind, world);
		}

	@Override
	protected void setAttributes(AttributeMap costs) {
		super.setAttributes(costs);
		CostForesets.HD(costs);
	}
	
	@Override
	public Color3 getDripColor() {
		return Color3.getColor("#2b2b2b");
	}

	@Override
    public HairStyle getDefaultHairStyle() {
        return HairStyle.BALD.get();
    }
	
	@Override
	public LatexType getLatexType() {
		return LatexType.DARK_LATEX;
	}

	@Override
	public TransfurMode getTransfurMode() {
		return TransfurMode.REPLICATION;
	}
	
	 public @Nullable List<HairStyle> getValidHairStyles() {
	        return HairStyle.Collection.getAll();
	    }

	@Override
	public boolean isMaskless() {
		return true;
	}

	
}
*/