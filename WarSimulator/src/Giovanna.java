import java.awt.*;

import javax.swing.*;

public class Giovanna extends JPanel {
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image logo = new ImageIcon(this.getClass().getResource("/giovanna.jpg")).getImage();
		
		g.drawImage(logo,0, 0, this);
		
	
		
		
	}
	
	
	

}
