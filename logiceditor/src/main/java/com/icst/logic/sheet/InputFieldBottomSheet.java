/*
 *  This file is part of Block IDLE.
 *
 *  Block IDLE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Block IDLE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Block IDLE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.icst.logic.sheet;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.bean.NumericBlockElementBean;
import com.icst.blockidle.bean.StringBlockElementBean;
import com.icst.blockidle.bean.ValueInputBlockElementBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;
import com.icst.logic.editor.databinding.BottomsheetInputFieldBinding;
import com.icst.logic.view.BlockElementInputEditText;

import android.content.Context;
import android.view.LayoutInflater;

public class InputFieldBottomSheet extends BottomSheetDialog {

	private BottomsheetInputFieldBinding binding;

	public InputFieldBottomSheet(
			Context context,
			ValueInputBlockElementBean mValueInputBlockElementBean,
			ValueListener valueListener) {
		super(context);

		binding = BottomsheetInputFieldBinding.inflate(LayoutInflater.from(context));
		if (mValueInputBlockElementBean instanceof StringBlockElementBean mStringBlockElementBean) {
			if (mValueInputBlockElementBean.getAcceptedReturnType().isSuperTypeOrDatatype(getStringDatatype())) {
				binding.dialogTitle.setText("Enter String");
				binding.message.setText(
						"Please make sure you escape the String, otherwise you will encounter error.");
				binding.mBlockElementInputEditText.setText(
						mStringBlockElementBean.getString() == null ? "" : mStringBlockElementBean.getString());
				binding.mBlockElementInputEditText.setInputType(
						BlockElementInputEditText.InputType.STRING,
						binding.mTextInputLayout,
						new BlockElementInputEditText.EditTextValueListener() {

							@Override
							public void onValueChange(String value) {
								binding.done.setEnabled(binding.mBlockElementInputEditText.isValid());
							}
						});
			}
		} else if (mValueInputBlockElementBean instanceof NumericBlockElementBean mNumericBlockElementBean) {
			if (mValueInputBlockElementBean.getAcceptedReturnType().equals(getIntegerDatatype())) {
				binding.dialogTitle.setText("Enter your Integer");
				binding.message.setText(
						"Please make sure you enter a valid integer value, otherwise you will encounter error.");
				binding.mBlockElementInputEditText.setText(
						mNumericBlockElementBean.getNumericalValue() == null ? ""
								: mNumericBlockElementBean.getNumericalValue());
				binding.mBlockElementInputEditText.setInputType(
						BlockElementInputEditText.InputType.INT,
						binding.mTextInputLayout,
						new BlockElementInputEditText.EditTextValueListener() {

							@Override
							public void onValueChange(String value) {
								binding.done.setEnabled(binding.mBlockElementInputEditText.isValid());
							}
						});
			} else if (mValueInputBlockElementBean.getAcceptedReturnType().equals(getFloatDatatype())) {
				binding.dialogTitle.setText("Enter your Float");
				binding.message.setText(
						"Please make sure you enter a valid float value, otherwise you will encounter error.");
				binding.mBlockElementInputEditText.setText(
						mNumericBlockElementBean.getNumericalValue() == null ? ""
								: mNumericBlockElementBean.getNumericalValue());
				binding.mBlockElementInputEditText.setInputType(
						BlockElementInputEditText.InputType.FLOAT,
						binding.mTextInputLayout,
						new BlockElementInputEditText.EditTextValueListener() {

							@Override
							public void onValueChange(String value) {
								binding.done.setEnabled(binding.mBlockElementInputEditText.isValid());
							}
						});
			}
		}
		setContentView(binding.getRoot());
		binding.done.setOnClickListener(v -> {
			valueListener.onChange(binding.mBlockElementInputEditText.getText().toString());
			dismiss();
		});
	}

	public DatatypeBean getStringDatatype() {
		return BuiltInDatatypes.getStringDatatype();
	}

	public DatatypeBean getIntegerDatatype() {
		return BuiltInDatatypes.getPrimitiveIntegerDatatype();
	}

	public DatatypeBean getFloatDatatype() {
		return BuiltInDatatypes.getPrimitiveFloatDatatype();
	}

	public interface ValueListener {
		void onChange(String value);
	}
}
