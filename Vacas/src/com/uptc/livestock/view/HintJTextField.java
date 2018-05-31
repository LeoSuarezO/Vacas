package com.uptc.livestock.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class HintJTextField extends JTextField implements FocusListener {
	private static final long serialVersionUID = 1L;
	private String hint;
	private boolean showingHint;

	public HintJTextField() {
		this(" ");
	}
	public HintJTextField(String hint) {
		super(hint);
		this.setForeground(Color.gray);
		this.hint = hint;
		this.showingHint = true;
		init();
	}

	private void init() {
		super.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (this.getText().isEmpty()) {
			super.setText("");
			this.setForeground(Color.black);
			showingHint = false;
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (this.getText().isEmpty()) {
			super.setText(hint);
			this.setForeground(Color.gray);
			showingHint = true;
		}
	}
	
	public void setHint(String hint) {
		this.hint = hint;
		putHint();
	}

	public void putHint() {
		setText(hint);
		this.setForeground(Color.gray);
		showingHint = true;
	}

	@Override
	public void setText(String t) {
		super.setText(t);
		showingHint = false;
		this.setForeground(Color.black);
		if (t.equals("")) {
			putHint();
		}
	}

	@Override
	public String getText() {
		return showingHint ? "" : super.getText();
	}
}