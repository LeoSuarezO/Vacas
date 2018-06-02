package Test;

import javax.swing.JFrame;

import com.uptc.livestock.view.PresentationJPanel;

public class TestPresentationJPanel {

	public static void main(String[] args) {
		JFrame f = new JFrame("Test presentacion");
		f.add(new PresentationJPanel());
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640, 480);
		f.setVisible(true);
	}
}
