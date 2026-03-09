package com.icst.blockidle.beans;

import java.io.Serializable;

public class PluginConfigurationBean implements Serializable {

	private String selectedVariant;
	private boolean isVariantSelected;

	public String getSelectedVariant() {
		return this.selectedVariant;
	}

	public void setSelectedVariant(String selectedVariant) {
		this.selectedVariant = selectedVariant;
	}

	public boolean getIsVariantSelected() {
		return this.isVariantSelected;
	}

	public void setIsVariantSelected(boolean isVariantSelected) {
		this.isVariantSelected = isVariantSelected;
	}
}
