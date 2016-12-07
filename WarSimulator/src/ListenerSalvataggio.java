import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ListenerSalvataggio implements ActionListener {
	
	
	String query;
	boolean stato = false;
	
	
	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	

	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object sorgente = e.getSource();
		
		if (sorgente == GUIsalvataggio.ok) {
			
		
		    if (GUIsalvataggio.nome.getText().isEmpty()) {
		    	
		    	
		    	infoBox("Devi dare un nome alla partita!", "Attenzione");
		    	
		    	
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		     query = new String();
		     
		     
		     if (Globali.giocatore.generale.equals("Vlad l'Impalatore")) Globali.giocatore.generale = "Vlad l Impalatore";
		     else if (Globali.giocatore.generale.equals("Giovanna d'Arco")) Globali.giocatore.generale = "Giovanna d Arco";
		     else if (Globali.giocatore.generale.equals("Scipione l'Africano")) Globali.giocatore.generale = "Scipione l Africano";
		     
		     
		     if (Globali.avversario.generale.equals("Vlad l'Impalatore")) Globali.avversario.generale = "Vlad l Impalatore";
		     else if (Globali.avversario.generale.equals("Giovanna d'Arco")) Globali.avversario.generale = "Giovanna d Arco";
		     else if (Globali.avversario.generale.equals("Scipione l'Africano")) Globali.avversario.generale = "Scipione l Africano";
		     
		     
		     
		     
		     
		     query = "insert into SALVATAGGIO values  " + "('" + GUIsalvataggio.nome.getText() + "'," +
		                                                   "'" + Globali.battaglia.terreno + "'," +
		    		                                       "'" + Globali.battaglia.orario + "'," +
		                                                       + Globali.vincitore  + "," +
		    		                                       "'" + Globali.giocatore.popolo + "'," +
		                                                   "'" + Globali.giocatore.generale + "'," +
		    		                                       "'" + Globali.giocatore.truppe + "'," +
		                                                   "'" + Globali.giocatore.strategia + "'," +
		    		                                       "'" + Globali.avversario.popolo + "'," +
		                                                   "'" + Globali.avversario.generale + "'," +
		    		                                       "'" + Globali.avversario.truppe + "'," +
		                                                   "'" + Globali.avversario.strategia + "')";
		     
		     
		     
		     
		     
		     
		     
		     
		     try {
				stato = Database.connetti();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		     
		     
		     
		     try {
			     if (!Database.esistenzaTabella()) {
			    	 
			    	 
			    	 Database.esegui_query(Query.creaTabella);
			    	 
			    	 
			     }
			     
			     } catch (SQLException e2) {
			    	 
			    	 e2.printStackTrace();
			    	 
			     }
		     
		     
	
		     
		     
		     if (stato) {
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 boolean existing = false;
		    	 
		    	 
		    	 
		    	 try {
					existing = Database.salvataggio_esistente(GUIsalvataggio.nome.getText());
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
		    	 
		    	 if (!existing) {
		    	
		    	 

		     
		     
		     
		             try {
				        Database.esegui_query(query);
			        } catch (SQLException e3) {
				
				
				        e3.printStackTrace();
			        }
		         
		         
		         
		             try {
					    Database.disconnetti();
				    } catch (SQLException e1) {
					
					    e1.printStackTrace();
				    }
		             
		             
		             
		    	 
		     
		     
		     
		     
		     
		             infoBox("Risultato salvato con successo!", "Info");
		         
		         
		         
		     
		             WarSimulator.menu.setVisible(true);
		     
		             ListenerRisultato.salvataggio.setVisible(false);
		             
		             
		    	 }
		    	 
		    	 
		    	 
		    	 else {
		    		 
		    		 
		    		 infoBoxErrore ("Nome salvataggio già esistente", "Errore");
		    		 
		    		 
		    	 }
		    
		    
		
			
			
		    }
		     
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	void infoBox(String infoMessage, String location){
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	static void infoBoxErrore(String infoMessage, String location){
	  	JOptionPane.showMessageDialog(null, infoMessage, "" + location,JOptionPane.ERROR_MESSAGE);
		
	}
	
	
	
	
	
	
	
	
}