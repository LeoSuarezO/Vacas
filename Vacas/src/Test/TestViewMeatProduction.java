package Test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.uptc.livestock.view.JPanelMeatProduction;

public class TestViewMeatProduction {
	
	public static void main(String[] args) {
		JPanelMeatProduction jPanelMeatProduction = new JPanelMeatProduction();
		JFrame jFrame = new JFrame("Meat Production");
		jFrame.setVisible(true);
		jFrame.setSize(660, 500);
		jFrame.setLocationRelativeTo(null);;
		jFrame.add(jPanelMeatProduction);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
