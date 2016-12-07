import java.awt.*;

import javax.swing.*;

public class Grafico extends JPanel {
	
	
	int strategia;
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		if (strategia == 1) {
		Image logo = new ImageIcon(this.getClass().getResource("/frontale.jpeg")).getImage();
		
		g.drawImage(logo,0, 0, this);
		}
		
		
		else if (strategia == 2) {
			
	    Image logo = new ImageIcon(this.getClass().getResource("/accerchiamento.jpeg")).getImage();
			
		g.drawImage(logo,0, 0, this);
			
		}
		
		else if (strategia == 3) {
			
	    Image logo = new ImageIcon(this.getClass().getResource("/tenere.jpeg")).getImage();
				
		g.drawImage(logo,0, 0, this);	
			
		}
		
		
		else if (strategia == 4) {
			
		Image logo = new ImageIcon(this.getClass().getResource("/quadrato.jpeg")).getImage();
				
		g.drawImage(logo,0, 0, this);
			
			
		}
		
		else if (strategia == 5) {
			
		Image logo = new ImageIcon(this.getClass().getResource("/cuneo.jpeg")).getImage();
			
		g.drawImage(logo,0, 0, this);		
			
		}
		
		
		else if (strategia == 6) {
			
			
		Image logo = new ImageIcon(this.getClass().getResource("/ritirata.jpeg")).getImage();
			
		g.drawImage(logo,0, 0, this);	
			
		}
	
		
		
	}
	
	
	
	public Grafico (int pstrategia) {
		
		this.strategia = pstrategia;
		
		
	}
	
	
	
	public void  setStrategia(int pstrategia) {
		
		this.strategia = pstrategia;

		
		
	}
	
	
	

}