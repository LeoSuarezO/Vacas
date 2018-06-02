package com.uptc.livestock.view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Race;

public class BovineGUI extends Bovine{

	public BovineGUI(Bovine bovine) {
		super(bovine.getId(), bovine.getName(), bovine.getBirthDate(), bovine.getRace(), bovine.getWeight(), bovine.getVaccine(), bovine.getHealthCondition());
	}
	
	public Icon getImageBovine() {
		Icon icon = null;
		ImageIcon imageIcon = null;
		switch (this.getRace()) {
		case ANGUS:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.ANGUS.getNameImage());
			break;
		case BLANCO_OREJINEGRO:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.BLANCO_OREJINEGRO.getNameImage());
			break;
		case BRAHMAN:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.BRAHMAN.getNameImage());
			break;
		case BRANGUS:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.BRANGUS.getNameImage());
			break;
		case BUFALA:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.BUFALA.getNameImage());
			break;
		case CAQUETEÑO:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.CAQUETEÑO.getNameImage());
			break;
		case CEBU:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.CEBU.getNameImage());
			break;
		case CHINO_SANTANDEREANO:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.CHINO_SANTANDEREANO.getNameImage());
			break;
		case COSTEÑO_CON_CUERNOS:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.COSTEÑO_CON_CUERNOS.getNameImage());
			break;
		case GYR:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.GYR.getNameImage());
			break;
		case HARTON_DEL_VALLE:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.HARTON_DEL_VALLE.getNameImage());
			break;
		case HOLSTEIN:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.HOLSTEIN.getNameImage());
			break;
		case JERSEY:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.JERSEY.getNameImage());
			break;
		case LUCERNA:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.LUCERNA.getNameImage());
			break;
		case NORMANDO:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.NORMANDO.getNameImage());
			break;
		case SANMARTINERO:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.SANMARTINERO.getNameImage());
			break;
		case SIMMENTAL:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.SIMMENTAL.getNameImage());
			break;
		case VELAZQUEZ:
			imageIcon = new ImageIcon(Constant.PATH_IMAGES_BOVINES +Race.VELAZQUEZ.getNameImage());
			break;
		default:
			break;
		}
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
		return icon;
	}
}
