package com.icst.logic.editor.view;

import org.commonmark.node.Node;

import com.google.android.material.card.MaterialCardView;
import com.icst.logic.editor.databinding.LogiceditorFloatingWindowBinding;
import com.icst.logic.utils.CanvaMathUtils;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import io.noties.markwon.Markwon;

public class LogicEditorFloatingWindow extends MaterialCardView {

	private LogiceditorFloatingWindowBinding binding;
	private LogicEditorView logicEditor;
	private LogicEditorView.LayoutParams lp;
	private View attachedView;
	private ViewTreeObserver.OnScrollChangedListener listener;

	public LogicEditorFloatingWindow(Context context, String data, LogicEditorView logicEditor) {
		super(context);
		this.logicEditor = logicEditor;
		binding = LogiceditorFloatingWindowBinding.inflate(LayoutInflater.from(context));

		TextView content = new TextView(context);

		final Markwon markwon = Markwon.create(context);
		final Node node = markwon.parse(data);
		final Spanned markdown = markwon.render(node);
		markwon.setParsedMarkdown(content, markdown);

		binding.content.addView(content);
		addView(binding.getRoot());
		binding.dismiss.setOnClickListener(
				v -> {
					if (getParent() != null) {
						if (getParent() instanceof ViewGroup viewGroup) {
							viewGroup.removeView(LogicEditorFloatingWindow.this);
						}
					}
					attachedView.getViewTreeObserver().removeOnScrollChangedListener(listener);
				});
		listener = new ViewTreeObserver.OnScrollChangedListener() {
			@Override
			public void onScrollChanged() {
				int[] position = CanvaMathUtils.getRelativeCoordinates(attachedView, logicEditor);
				setX(position[0]);
				setY(position[1]);
			}
		};
	}

	public View getAttachedView() {
		return this.attachedView;
	}

	public void setAttachedView(View attachedView, LogicEditorView.LayoutParams lp) {
		this.attachedView = attachedView;
		this.lp = lp;
		attachedView.getViewTreeObserver().addOnScrollChangedListener(listener);
		int[] position = CanvaMathUtils.getRelativeCoordinates(attachedView, logicEditor);
		setX(position[0]);
		setY(position[1]);
	}
}
