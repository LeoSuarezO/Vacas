package com.uptc.livestock.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import com.uptc.livestock.controller.Command;
import com.uptc.livestock.controller.LivestockListener;
import com.uptc.livestock.model.entity.Race;

public class JDialogNewBovine extends JDialog {

	private HintJTextField nameBovineField;
	private HintJTextField birthDayField;
	private HintJTextField birthMonthField;
	private HintJTextField birthYearField;
	private HintJTextField weightField;
	private HintJTextField vaccinesField;
	private HintJTextField partsNumberField;
	private HintJTextField daysDryPeriodField;
	private JRadioButton cowRadBtn;
	private JRadioButton bullRadBtn;
	private ButtonGroup genderBtnGroup;
	private JButton addBtn;
	private JButton cancelBtn;
	private JLabel infoLabel;
	private JComboBox<Race> raceComBox;

	public JDialogNewBovine() {
		super();
		LivestockListener.getIntance().setJDialogNewBovine(this);
		init();
	}

	private void init() {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setBounds(50, 50, 500, 400);
		this.setModal(true);
		
		JPanel contentPanel;

		this.getContentPane().setBackground(new Color(17, 122, 101));

		contentPanel = new JPanel();
		contentPanel.setOpaque(false);

		GridBagLayout gb_contentpanel = new GridBagLayout();
		gb_contentpanel.rowHeights = new int[] { 45, 45, 45, 45, 45, 38 };
		gb_contentpanel.columnWidths = new int[] { 200, 200 };
		contentPanel.setLayout(gb_contentpanel);

		infoLabel = new JLabel();
		infoLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		infoLabel.setForeground(Color.decode("#E5E7E9"));
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_infoLabel = new GridBagConstraints();
		gbc_infoLabel.insets = new Insets(0, 5, 5, 5);
		gbc_infoLabel.fill = GridBagConstraints.BOTH;
		gbc_infoLabel.gridx = 0;
		gbc_infoLabel.gridy = 0;
		contentPanel.add(infoLabel, gbc_infoLabel);

		nameBovineField = new HintJTextField();
		nameBovineField.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_nameBovineField = new GridBagConstraints();
		gbc_nameBovineField.insets = new Insets(0, 5, 5, 5);
		gbc_nameBovineField.fill = GridBagConstraints.BOTH;
		gbc_nameBovineField.gridx = 0;
		gbc_nameBovineField.gridy = 1;
		contentPanel.add(nameBovineField, gbc_nameBovineField);
		nameBovineField.setColumns(10);

		birthDayField = new HintJTextField();
		birthDayField.setColumns(5);
		birthDayField.setPreferredSize(new Dimension(0, 45));
		birthDayField.setHorizontalAlignment(SwingConstants.CENTER);

		birthMonthField = new HintJTextField();
		birthMonthField.setColumns(5);
		birthMonthField.setPreferredSize(new Dimension(0, 45));
		birthMonthField.setHorizontalAlignment(SwingConstants.CENTER);

		birthYearField = new HintJTextField();
		birthYearField.setColumns(8);
		birthYearField.setPreferredSize(new Dimension(0, 45));
		birthYearField.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel birthDateContent = new JPanel();
		birthDateContent.setOpaque(false);
		birthDateContent.setLayout(new FlowLayout(0, 5, 0));
		birthDateContent.add(birthDayField);
		birthDateContent.add(birthMonthField);
		birthDateContent.add(birthYearField);

		GridBagConstraints gbc_birthDateContent = new GridBagConstraints();
		gbc_birthDateContent.insets = new Insets(0, 5, 5, 5);
		gbc_birthDateContent.fill = GridBagConstraints.BOTH;

		gbc_birthDateContent.gridx = 1;
		gbc_birthDateContent.gridy = 1;
		contentPanel.add(birthDateContent, gbc_birthDateContent);

		weightField = new HintJTextField();
		weightField.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_weightField = new GridBagConstraints();
		gbc_weightField.insets = new Insets(0, 5, 5, 5);
		gbc_weightField.fill = GridBagConstraints.BOTH;
		gbc_weightField.gridx = 0;
		gbc_weightField.gridy = 2;
		contentPanel.add(weightField, gbc_weightField);
		weightField.setColumns(10);

		vaccinesField = new HintJTextField();
		vaccinesField.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_vaccinesField = new GridBagConstraints();
		gbc_vaccinesField.insets = new Insets(0, 0, 5, 5);
		gbc_vaccinesField.fill = GridBagConstraints.BOTH;
		gbc_vaccinesField.gridx = 1;
		gbc_vaccinesField.gridy = 2;
		contentPanel.add(vaccinesField, gbc_vaccinesField);
		vaccinesField.setColumns(10);

		partsNumberField = new HintJTextField();
		partsNumberField.setVisible(false);
		partsNumberField.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_partsNumberField = new GridBagConstraints();
		gbc_partsNumberField.insets = new Insets(0, 5, 5, 5);
		gbc_partsNumberField.fill = GridBagConstraints.BOTH;
		gbc_partsNumberField.gridx = 0;
		gbc_partsNumberField.gridy = 4;
		contentPanel.add(partsNumberField, gbc_partsNumberField);
		partsNumberField.setColumns(10);

		daysDryPeriodField = new HintJTextField();
		daysDryPeriodField.setVisible(false);
		daysDryPeriodField.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_daysDryPeriodField = new GridBagConstraints();
		gbc_daysDryPeriodField.insets = new Insets(0, 5, 5, 5);
		gbc_daysDryPeriodField.fill = GridBagConstraints.BOTH;
		gbc_daysDryPeriodField.gridx = 1;
		gbc_daysDryPeriodField.gridy = 4;
		contentPanel.add(daysDryPeriodField, gbc_daysDryPeriodField);
		daysDryPeriodField.setColumns(10);
		
		raceComBox = new JComboBox<>();
		raceComBox.setBackground(Color.WHITE);
		raceComBox.setForeground(Color.GRAY);
		raceComBox.setModel(new DefaultComboBoxModel<>(Race.values()));
		
		GridBagConstraints gbc_raceComBox = new GridBagConstraints();
		gbc_raceComBox.insets = new Insets(0, 5, 5, 5);
		gbc_raceComBox.fill = GridBagConstraints.BOTH;
		gbc_raceComBox.gridx = 1;
		gbc_raceComBox.gridy = 3;
		contentPanel.add(raceComBox, gbc_raceComBox);
		
		bullRadBtn = new JRadioButton();
		bullRadBtn.setSelected(true);
		bullRadBtn.addActionListener(LivestockListener.getIntance());
		bullRadBtn.setActionCommand(Command.NEW_BULLDATA_RAD_BTN.toString());
		bullRadBtn.setOpaque(false);
		cowRadBtn = new JRadioButton();
		cowRadBtn.addActionListener(LivestockListener.getIntance());
		cowRadBtn.setActionCommand(Command.NEW_COWDATA_RAD_BTN.toString());
		cowRadBtn.setOpaque(false);
		
		genderBtnGroup = new ButtonGroup();
		genderBtnGroup.add(bullRadBtn);
		genderBtnGroup.add(cowRadBtn);

		JPanel genderBtnsContent = new JPanel();
		genderBtnsContent.setOpaque(false);
		genderBtnsContent.setLayout(new FlowLayout(0, 10, 0));
		genderBtnsContent.add(bullRadBtn);
		genderBtnsContent.add(cowRadBtn);

		GridBagConstraints gbc_genderBtnsContent = new GridBagConstraints();
		gbc_genderBtnsContent.insets = new Insets(0, 5, 5, 5);
		gbc_genderBtnsContent.fill = GridBagConstraints.BOTH;
		gbc_genderBtnsContent.gridx = 0;
		gbc_genderBtnsContent.gridy = 3;
		contentPanel.add(genderBtnsContent, gbc_genderBtnsContent);

		addBtn = new JButton();
		addBtn.setBackground(Color.decode("#ABEBC6"));
		cancelBtn = new JButton();
		cancelBtn.setBackground(Color.decode("#ABEBC6"));
		cancelBtn.setActionCommand(Command.BTNCANCEL_NEWBOVINE_JDIALOG.toString());
		cancelBtn.addActionListener(LivestockListener.getIntance());

		JPanel actionBtnsContent = new JPanel();
		actionBtnsContent.setOpaque(false);
		actionBtnsContent.setLayout(new FlowLayout(0, 10, 0));
		actionBtnsContent.add(addBtn);
		actionBtnsContent.add(cancelBtn);

		GridBagConstraints gbc_actionBtnsContent = new GridBagConstraints();
		gbc_actionBtnsContent.insets = new Insets(0, 5, 5, 5);
		gbc_actionBtnsContent.fill = GridBagConstraints.BOTH;
		gbc_actionBtnsContent.gridx = 1;
		gbc_actionBtnsContent.gridy = 5;
		contentPanel.add(actionBtnsContent, gbc_actionBtnsContent);

		this.getContentPane().add(contentPanel);

	}

	public void setStringsLanguages(String nameBovine, String daysDryPeriod, String birthDay, String birthMonth,
			String birthYear, String weight, String vaccines, String partsNumber, String bull, String cow,
			String addText, String cancelText, String infoText) {

		this.nameBovineField.setHint(nameBovine);
		this.daysDryPeriodField.setHint(daysDryPeriod);
		this.birthDayField.setHint(birthDay);
		this.birthMonthField.setHint(birthMonth);
		this.birthYearField.setHint(birthYear);
		this.weightField.setHint(weight);
		this.partsNumberField.setHint(partsNumber);
		this.vaccinesField.setHint(vaccines);
		this.bullRadBtn.setText(bull);
		this.cowRadBtn.setText(cow);
		this.addBtn.setText(addText);
		this.cancelBtn.setText(cancelText);
		this.infoLabel.setText(infoText);
		

	}
	
	public void showCowDataFields() {
		if(cowRadBtn.isSelected()) {
		daysDryPeriodField.setVisible(true);
		partsNumberField.setVisible(true);
		this.revalidate();
		}else {
			daysDryPeriodField.setVisible(false);
			partsNumberField.setVisible(false);
		}
			
	}

}
