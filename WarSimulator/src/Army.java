
public class Army {
	
	
	 String popolo;
	 String generale;
	 String truppe;
	 
	 String strategia;
	 
	 int probabilit‡Vittoria;
	 
	 
	 
	 
	 
	 
	 public void random() {
		 
		 
		 int country = 0;
		 int general = 0;
		 int troup = 0;
		 
		 do{
			 
		   country = (int) ((Math.random()*100)% 4);
		 
		 }while (country == 0);
		 
		 
		 
		 do {
			 
			 general = (int) ((Math.random()*100)%4);
			 
		 }while (general == 0);
		 
		 
		 do {
			 
			 
			 troup = (int) ((Math.random()*100)%4);
			 
		 }while (troup == 0);
		 
		 
		 
		 
		 if (country == 1 && general == 1 && troup == 1) {
			 
			 popolo = "Roma";
			 generale = "Giulio Cesare";
			 truppe = "Legionari";

		 }
		 
		 
		 
		 else if (country == 1 && general == 1 && troup == 2) {
			 
			 popolo = "Roma";
			 generale = "Giulio Cesare";
			 truppe = "Equites";
			 
			 
		 }
		 
		 
		 
         else if (country == 1 && general == 1 && troup == 3) {
			 
			 popolo = "Roma";
			 generale = "Giulio Cesare";
			 truppe = "Gladiatori";
			 
			 
		 }
		
		
		 
         else if (country == 1 && general == 1 && troup == 4) {
			 
			 popolo = "Roma";
			 generale = "Giulio Cesare";
			 truppe = "Velites";
			 
			 
		 }
		 
		 
         else if (country == 1 && general == 2 && troup == 1) {
			 
			 popolo = "Roma";
			 generale = "Scipione l'Africano";
			 truppe = "Legionari";

		 }
		 
		 
		 
		 else if (country == 1 && general == 2 && troup == 2) {
			 
			 popolo = "Roma";
			 generale = "Scipione l'Africano";
			 truppe = "Equites";
			 
			 
		 }
		 
		 
		 
         else if (country == 1 && general == 2 && troup == 3) {
			 
			 popolo = "Roma";
			 generale = "Scipione l'Africano";
			 truppe = "Gladiatori";
			 
			 
		 }
		
		
		 
         else if (country == 1 && general == 2 && troup == 4) {
			 
			 popolo = "Roma";
			 generale = "Scipione l'Africano";
			 truppe = "Velites";
			 
			 
		 }
		 
		 
		 
		 
		 
         else if (country == 1 && general == 3 && troup == 1) {
			 
			 popolo = "Roma";
			 generale = "Spartaco";
			 truppe = "Legionari";

		 }
		 
		 
		 
		 else if (country == 1 && general == 3 && troup == 2) {
			 
			 popolo = "Roma";
			 generale = "Spartaco";
			 truppe = "Equites";
			 
			 
		 }
		 
		 
		 
         else if (country == 1 && general == 3 && troup == 3) {
			 
			 popolo = "Roma";
			 generale = "Spartaco";
			 truppe = "Gladiatori";
			 
			 
		 }
		
		
		 
         else if (country == 1 && general == 3 && troup == 4) {
			 
			 popolo = "Roma";
			 generale = "Spartaco";
			 truppe = "Velites";
			 
			 
		 }
		 
		 
		 
		 
		 
         else if (country == 2 && general == 1 && troup == 1) {
			 
			 popolo = "Europa";
			 generale = "Giovanna d'Arco";
			 truppe = "Cavalieri";

		 }
		 
		 
		 
		 
		 
		 else if (country == 2 && general == 1 && troup == 2) {
			 
			 popolo = "Europa";
			 generale = "Giovanna d'Arco";
			 truppe = "Balestrieri";
			 
			 
		 }
		 
		 
		 
         else if (country == 2 && general == 1 && troup == 3) {
			 
			 popolo = "Europa";
			 generale = "Giovanna d'Arco";
			 truppe = "Catapulte";
			 
			 
		 }
		
		
		 
         else if (country == 2 && general == 1 && troup == 4) {
			 
			 popolo = "Europa";
			 generale = "Giovanna d'Arco";
			 truppe = "Vichinghi";
			 
			 
		 }
		 
		 
		 
		 
		 
		 
        else if (country == 2 && general == 2 && troup == 1) {
			 
			 popolo = "Europa";
			 generale = "Vlad l'Impalatore";
			 truppe = "Cavalieri";

		 }
		 
		 
		 
		 else if (country == 2 && general == 2 && troup == 2) {
			 
			 popolo = "Europa";
			 generale = "Vlad l'Impalatore";
			 truppe = "Balestrieri";
			 
			 
		 }
		 
		 
		 
         else if (country == 2 && general == 2 && troup == 3) {
			 
			 popolo = "Europa";
			 generale = "Vlad l'Impalatore";
			 truppe = "Catapulte";
			 
			 
		 }
		
		
		 
         else if (country == 2 && general == 2 && troup == 4) {
			 
			 popolo = "Europa";
			 generale = "Vlad l'Impalatore";
			 truppe = "Vichinghi";
			 
			 
		 }
		 
		 
		 
		 
		 
		 
        else if (country == 2 && general == 3 && troup == 1) {
			 
			 popolo = "Europa";
			 generale = "Enrico I di Sassonia";
			 truppe = "Cavalieri";

		 }
		 
		 
		 
		 else if (country == 2 && general == 3 && troup == 2) {
			 
			 popolo = "Europa";
			 generale = "Enrico I di Sassonia";
			 truppe = "Balestrieri";
			 
			 
		 }
		 
		 
		 
         else if (country == 2 && general == 3 && troup == 3) {
			 
			 popolo = "Europa";
			 generale = "Enrico I di Sassonia";
			 truppe = "Catapulte";
			 
			 
		 }
		
		
		 
         else if (country == 2 && general == 3 && troup == 4) {
			 
			 popolo = "Europa";
			 generale = "Enrico I di Sassonia";
			 truppe = "Vichinghi";
			 
			 
		 }
		 
		 
		 
		 
		 
		
         else if (country == 3 && general == 1 && troup == 1) {
			 
 			 popolo = "Giappone";
 			 generale = "Miyamoto Musashi";
 			 truppe = "Monaci guerrieri";

 		 }
 		 
 		 
 		 
 		 else if (country == 3 && general == 1 && troup == 2) {
 			 
 			 popolo = "Giappone";
 			 generale = "Miyamoto Musashi";
 			 truppe = "Ninja";
 			 
 			 
 		 }
 		 
 		 
 		 
          else if (country == 3 && general == 1 && troup == 3) {
 			 
 			 popolo = "Giappone";
 			 generale = "Miyamoto Musashi";
 			 truppe = "Samurai";
 			 
 			 
 		 }
 		
 		
 		 
          else if (country == 3 && general == 1 && troup == 4) {
 			 
 			 popolo = "Giappone";
 			 generale = "Miyamoto Musashi";
 			 truppe = "Arceri";
 			 
 			 
 		 }
 		 
		 
		 
		 
		 
		 
          else if (country == 3 && general == 2 && troup == 1) {
 			 
  			 popolo = "Giappone";
  			 generale = "Minamoto Tametomo";
  			 truppe = "Monaci guerrieri";

  		 }
  		 
  		 
  		 
  		 else if (country == 3 && general == 2 && troup == 2) {
  			 
  			 popolo = "Giappone";
  			 generale = "Minamoto Tametomo";
  			 truppe = "Ninja";
  			 
  			 
  		 }
  		 
  		 
  		 
           else if (country == 3 && general == 2 && troup == 3) {
  			 
  			 popolo = "Giappone";
  			 generale = "Minamoto Tametomo";
  			 truppe = "Samurai";
  			 
  			 
  		 }
  		
  		
  		 
           else if (country == 3 && general == 2 && troup == 4) {
  			 
  			 popolo = "Giappone";
  			 generale = "Minamoto Tametomo";
  			 truppe = "Arceri";
  			 
  			 
  		 }
		 
		 
		 
		 
		 
		 
           else if (country == 3 && general == 3 && troup == 1) {
   			 
    			 popolo = "Giappone";
    			 generale = "Ishikawa Goemon";
    			 truppe = "Monaci guerrieri";

    		 }
    		 
    		 
    		 
    		 else if (country == 3 && general == 3 && troup == 2) {
    			 
    			 popolo = "Giappone";
    			 generale = "Ishikawa Goemon";
    			 truppe = "Ninja";
    			 
    			 
    		 }
    		 
    		 
    		 
             else if (country == 3 && general == 3 && troup == 3) {
    			 
    			 popolo = "Giappone";
    			 generale = "Ishikawa Goemon";
    			 truppe = "Samurai";
    			 
    			 
    		 }
    		
    		
    		 
             else if (country == 3 && general == 3 && troup == 4) {
    			 
    			 popolo = "Giappone";
    			 generale = "Ishikawa Goemon";
    			 truppe = "Arceri";
    			 
    			 
    		 }
		 
		 
		 
  		 
  		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	

}
