package raytracer.pixels;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PixelTestJFrame extends JFrame {

	PixelTestPanel ptp;
	
	public static void main(String[] args) {
		PixelTestJFrame pf = new PixelTestJFrame();
	}
	
	public PixelTestJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ptp = new PixelTestPanel();
		add(ptp, BorderLayout.CENTER);
		pack();
		setVisible(true);
		repaint();
	}
	
	
}
