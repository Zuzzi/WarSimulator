
public class Neurone {
	
	
	boolean attivato = false;
	
	
	
	
	public void impulso (String strategiaAI, String strategiaAvversario) {
		
		
		
		
		int intensità = 0;
		int soglia = (int) ((Math.random()*100)%10);
		
		
		
		
		
		
		
		if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("attacco frontale")) {
			
			
			intensità = 5;
			
		}
		
		
		
		
		
		
		
		else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("accerchiamento")) {
			
			intensità = 3;
			
			
		}
		
		
		
		
		
		
		
		
		else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensità = 4;
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("difesa a quadrato")) {
			
			intensità = 6;
			
			
			
		}
		
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("attacco a cuneo")) {
        	
        	
        	intensità = 4;
	
	
	
	
	
        }
		
		
		
		
		
		
		
        else if (strategiaAI.equals("attacco frontale") && strategiaAvversario.equals("ritirata strategica")) {
        	
        	
        	
        	intensità = 9;
	
	
	
	
	
        }
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("attacco frontale")) {
        	
        	
        	
        	intensità = 9;
	
	
	
	
	
        }
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("tenere la posizione")) {
			
			
        	intensità = 8;
			
			
			
		}
		
		
		
		
		
		
		
		
        else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensità = 3;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("attacco a cuneo")) {
			
			intensità = 9;
			
			
			
		}
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("accerchiamento") && strategiaAvversario.equals("ritirata strategica")) {
			
			
			intensità = 7;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("attacco frontale")) {
			
			intensità = 6;
			
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensità = 4;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("attacco a cuneo")) {
			
			
			intensità = 4;
			
			
		}
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("tenere la posizione") && strategiaAvversario.equals("ritirata strategica")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("attacco frontale")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("accerchiamento")) {
			
			
			intensità = 9;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("tenere la posizione")) {
			
			
			intensità = 4;
			
			
		}
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("difesa a quadrato")) {
			
			
			intensità = 5;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("attacco a cuneo")) {
			
			
			intensità = 4;
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("difesa a quadrato") && strategiaAvversario.equals("tenere la posizione")) {
			
			intensità = 4;
			
			
			
		}
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("attacco frontale")) {
    	   
    	   
    	   intensità = 7;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("accerchiamento")) {
    	   
    	   
    	   intensità = 2;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("tenere la posizione")) {
    	   
    	   
    	   intensità = 8;
    	   
    	   
       }
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("difesa a quadrato")) {
    	   
    	   
    	   intensità = 9;
    	   
    	   
       }
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("attacco a cuneo")) {
    	   
    	   
    	   intensità = 5;
    	   
    	   
       }
		
		

		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("attacco a cuneo") && strategiaAvversario.equals("ritirata strategica")) {
    	   
    	   
    	   intensità = 10;
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("attacco frontale")) {
    	   
    	   
    	   
    	   
    	   
    	   intensità = 1;
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("accerchiamento")) {
    	   
    	   
    	   
    	   
    	   intensità = 2;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("tenere la posizione")) {
    	   
    	   
    	   
    	   
    	   intensità = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("difesa a quadrato")) {
    	   
    	   
    	   
    	   
    	   intensità = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("attacco a cuneo")) {
    	   
    	   
    	   
    	   intensità = 2;
    	   
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
       else if (strategiaAI.equals("ritirata strategica") && strategiaAvversario.equals("ritirata strategica")) {
    	   
    	   
    	   
    	   
    	   intensità = 5;
    	   
    	   
    	   
    	   
    	   
       }
		
		
		
		
		
		
		
		
		
		
		if (intensità >= soglia) attivato = true;
		
		
		
		
		
	
		
		
		
	}
	

}
