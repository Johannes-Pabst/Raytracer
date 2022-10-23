package raytracer.pixels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class PixelTestPanel extends JPanel {
	
	public BufferedImage canvas;
	
	public PixelTestPanel() {
		canvas =new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
		
//		for(int i = 0; i < 400; i++) {
//			canvas.setRGB(i, i, 0xff00ff00);			
//		}
		repaint();
		setBackground(Color.red);
		
		
	}
	
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }

    
//	File fi = new File("test.png");
//	try {
//		ImageIO.write(b, "PNG", fi);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
    
}
