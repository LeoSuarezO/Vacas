package Test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.uptc.livestock.view.JPanelMilkProduction;

public class TestViewMilkProduction {

	public static void main(String[] args) {
		JPanelMilkProduction jPanelMilkProduction = new JPanelMilkProduction();
		JFrame jFrame = new JFrame("Meat Production");
		jFrame.setVisible(true);
		jFrame.setSize(660, 500);
		jFrame.setLocationRelativeTo(null);;
		jFrame.add(jPanelMilkProduction);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
