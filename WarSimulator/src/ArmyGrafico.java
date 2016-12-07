import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



	
	public class ArmyGrafico extends JPanel {	
		
		
		
		
		
		Image alaSinistra;		
		Image centroSinistra; 
		Image centroDestra; 
		Image alaDestra;
		
		
		
		int alaSinistraX;
		int alaSinistraY;
		
		int centroSinistraX;
		int centroSinistraY;
		
		int centroDestraX;
		int centroDestraY;
		
		int alaDestraX;
		int alaDestraY;
		
		
	
	
		
		
		String color;
		
		public ArmyGrafico (String pcolor, int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
			
			
			color = pcolor;
			
			
			
			alaSinistraX = ax;
			alaSinistraY = ay;
			
			centroSinistraX = bx;
			centroSinistraY = by;
			
			centroDestraX = cx;
			centroDestraY = cy;
			
			alaDestraX = dx;
			alaDestraY = dy;
			
			
			
		}
		
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			if (color.equals("blu")) {
			
			
			
			Image alaSinistra = new ImageIcon(this.getClass().getResource("/blu.png")).getImage();		
			Image centroSinistra = new ImageIcon(this.getClass().getResource("/blu.png")).getImage();
			Image centroDestra = new ImageIcon(this.getClass().getResource("/blu.png")).getImage();
			Image alaDestra = new ImageIcon(this.getClass().getResource("/blu.png")).getImage();
			
			
			
			
			g.drawImage(alaSinistra,alaSinistraX,alaSinistraY, this);
			g.drawImage(centroSinistra,centroSinistraX, centroSinistraY, this);
			g.drawImage(centroDestra,centroDestraX, centroDestraY, this);
			g.drawImage(alaDestra,alaDestraX, alaDestraY, this);
		
			}
			
			
			
			else if (color.equals("rosso")) {
				
				
			Image alaSinistra = new ImageIcon(this.getClass().getResource("/rosso.png")).getImage();		
			Image centroSinistra = new ImageIcon(this.getClass().getResource("/rosso.png")).getImage();
			Image centroDestra = new ImageIcon(this.getClass().getResource("/rosso.png")).getImage();
			Image alaDestra = new ImageIcon(this.getClass().getResource("/rosso.png")).getImage();
				
				
				
				
			g.drawImage(alaSinistra,alaSinistraX,alaSinistraY, this);
			g.drawImage(centroSinistra,centroSinistraX, centroSinistraY, this);
			g.drawImage(centroDestra,centroDestraX, centroDestraY, this);
			g.drawImage(alaDestra,alaDestraX, alaDestraY, this);
				
				
				
			}
			
			
			
			
			
			
		}
		
	}
		
		
		
	
	


