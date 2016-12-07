import java.awt.*;

import javax.swing.*;

public class Samurai extends JPanel {
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image logo = new ImageIcon(this.getClass().getResource("/samurai.jpg")).getImage();
		
		g.drawImage(logo,0, 0, this);
		
	
		
		
	}
	
	
	

}
