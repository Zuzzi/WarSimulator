
public class Neurone {
	
	
	boolean attivato = false;
	
	
	
	
	public void impulso (String strategiaAI, String strategiaAvversario) {
		
		
		
		
		int intensit� = 0;
		int soglia = (int) ((Math.random()*100)%10);
		
		
		
		
		
		
		
		if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("attacco frontale")) {
			
			
			intensit� = 5;
			
		}
		
		
		
		
		
		
		
		else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("accerchiamento")) {
			
			intensit� = 3;
			
			
		}
		
		
		
		
		
		
		
		
		else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensit� = 4;
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("difesa a quadrato")) {
			
			intensit� = 6;
			
			
			
		}
		
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("attacco a cuneo")) {
        	
        	
        	intensit� = 4;
	
	
	
	
	
        }
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("ritirata strategica")) {
        	
        	
        	
        	intensit� = 9;
	
	
	
	
	
        }
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("attacco frontale")) {
        	
        	
        	
        	intensit� = 9;
	
	
	
	
	
        }
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("tenere la posizione")) {
			
			
        	intensit� = 8;
			
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensit� = 3;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("attacco a cuneo")) {
			
			intensit� = 9;
			
			
			
		}
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("ritirata strategica")) {
			
			
			intensit� = 7;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("attacco frontale")) {
			
			intensit� = 6;
			
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensit� = 4;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("attacco a cuneo")) {
			
			
			intensit� = 4;
			
			
		}
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("ritirata strategica")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("attacco frontale")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensit� = 9;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensit� = 4;
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensit� = 5;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("attacco a cuneo")) {
			
			
			intensit� = 4;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("tenere la posizione")) {
			
			intensit� = 4;
			
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("attacco frontale")) {
    	   
    	   
    	   intensit� = 7;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("accerchiamento")) {
    	   
    	   
    	   intensit� = 2;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("tenere la posizione")) {
    	   
    	   
    	   intensit� = 8;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("difesa a quadrato")) {
    	   
    	   
    	   intensit� = 9;
    	   
    	   
       }
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("attacco a cuneo")) {
    	   
    	   
    	   intensit� = 5;
    	   
    	   
       }
		
		

		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("ritirata strategica")) {
    	   
    	   
    	   intensit� = 10;
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("attacco frontale")) {
    	   
    	   
    	   
    	   
    	   
    	   intensit� = 1;
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("accerchiamento")) {
    	   
    	   
    	   
    	   
    	   intensit� = 2;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("tenere la posizione")) {
    	   
    	   
    	   
    	   
    	   intensit� = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("difesa a quadrato")) {
    	   
    	   
    	   
    	   
    	   intensit� = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("attacco a cuneo")) {
    	   
    	   
    	   
    	   intensit� = 2;
    	   
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("ritirata strategica")) {
    	   
    	   
    	   
    	   
    	   intensit� = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		if (intensit� >= soglia) attivato = true;
		
		
		
		
		
	
		
		
		
	}
	

}
