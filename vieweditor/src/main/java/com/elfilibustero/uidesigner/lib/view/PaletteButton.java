package com.elfilibustero.uidesigner.lib.view;

import com.elfilibustero.uidesigner.beans.ViewBean;
import com.icst.layout.editor.databinding.PaletteButtonBinding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.DrawableRes;

public class PaletteButton extends RelativeLayout {

	private PaletteButtonBinding binding;
	private ViewBean bean;

	public PaletteButton(Context context) {
		super(context);
		init(context);
	}

	public PaletteButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public PaletteButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context);
	}

	private void init(Context context) {
		binding = PaletteButtonBinding.inflate(LayoutInflater.from(context), this, true);
	}

	public void setIcon(@DrawableRes int resourceId) {
		binding.icon.setImageResource(resourceId);
	}

	public void setName(String text) {
		binding.name.setText(text);
	}

	public void setClassName(String text) {
		binding.className.setText(text);
	}

	public ViewBean getBean() {
		return bean;
	}

	public void setBean(ViewBean bean) {
		this.bean = bean;
	}
}
