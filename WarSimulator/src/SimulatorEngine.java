
public class SimulatorEngine {

	static int calcolaValoreArmata(Army a) {

		int accumulatore = 0;

		if (a.popolo.equals("Roma"))
			accumulatore += 5;
		else if (a.popolo.equals("Europa"))
			accumulatore += 4;
		else if (a.popolo.equals("Giappone"))
			accumulatore += 4;

		if (a.generale.equals("Giulio Cesare"))
			accumulatore += 9;
		else if (a.generale.equals("Scipione l'Africano"))
			accumulatore += 6;
		else if (a.generale.equals("Spartaco"))
			accumulatore += 5;

		else if (a.generale.equals("Giovanna d'Arco"))
			accumulatore += 6;
		else if (a.generale.equals("Vlad l'Impalatore"))
			accumulatore += 7;
		else if (a.generale.equals("Enrico I di Sassonia"))
			accumulatore += 8;

		else if (a.generale.equals("Miyamoto Musashi"))
			accumulatore += 9;
		else if (a.generale.equals("Minamoto Tametomo"))
			accumulatore += 6;
		else if (a.generale.equals("Ishikawa Goemon"))
			accumulatore += 5;

		if (a.truppe.equals("Legionari"))
			accumulatore += 8;
		else if (a.truppe.equals("Equites"))
			accumulatore += 6;
		else if (a.truppe.equals("Gladiatori"))
			accumulatore += 6;
		else if (a.truppe.equals("Velites"))
			accumulatore += 5;

		else if (a.truppe.equals("Cavalieri"))
			accumulatore += 8;
		else if (a.truppe.equals("Balestrieri"))
			accumulatore += 5;
		else if (a.truppe.equals("Catapulte"))
			accumulatore += 4;
		else if (a.truppe.equals("Vichinghi"))
			accumulatore += 8;

		else if (a.truppe.equals("Monaci guerrieri"))
			accumulatore += 6;
		else if (a.truppe.equals("Ninja"))
			accumulatore += 8;
		else if (a.truppe.equals("Samurai"))
			accumulatore += 8;
		else if (a.truppe.equals("Arceri"))
			accumulatore += 4;

		if (a.generale.equals("Giulio Cesare") && a.truppe.equals("Legionari"))
			accumulatore += 5;
		else if (a.generale.equals("Spartaco") && a.truppe.equals("Gladiatori"))
			accumulatore += 5;
		else if (a.generale.equals("Enrico I di Sassonia") && a.truppe.equals("Cavalieri"))
			accumulatore += 5;
		else if (a.generale.equals("Vlad l'Impalatore"))
			accumulatore += 2;
		else if (a.generale.equals("Miyamoto Musashi") && a.truppe.equals("Samurai"))
			accumulatore += 4;
		else if (a.generale.equals("Minamoto Tametomo") && a.truppe.equals("Arceri"))
			accumulatore += 5;
		else if (a.generale.equals("Ishikawa Goemon") && a.truppe.equals("Ninja"))
			accumulatore += 4;

		return accumulatore;

	}

	static int calcolaBonusBattlefield(Army a, Battlefield b) {

		int accumulatore = 0;

		if (b.terreno.equals("Pianura") && a.truppe.equals("Cavalieri"))
			accumulatore += 5;
		else if (b.terreno.equals("Pianura") && a.truppe.equals("Equites"))
			accumulatore += 4;
		else if (b.terreno.equals("Pianura") && a.truppe.equals("Arceri"))
			accumulatore += 3;
		else if (b.terreno.equals("Pianura") && a.truppe.equals("Balestrieri"))
			accumulatore += 3;
		else if (b.terreno.equals("Pianura") && a.truppe.equals("Catapulte"))
			accumulatore += 5;

		else if (b.terreno.equals("Foresta") && a.truppe.equals("Ninja"))
			accumulatore += 5;
		else if (b.terreno.equals("Foresta") && a.truppe.equals("Velites"))
			accumulatore += 3;
		else if (b.terreno.equals("Foresta") && a.truppe.equals("Monaci guerrieri"))
			accumulatore += 2;
		else if (b.terreno.equals("Foresta") && a.truppe.equals("Cavalieri"))
			accumulatore -= 2;
		else if (b.terreno.equals("Foresta") && a.truppe.equals("Equites"))
			accumulatore -= 2;
		else if (b.terreno.equals("Foresta") && a.truppe.equals("Catapulte"))
			accumulatore -= 3;

		else if (b.terreno.equals("Palude") && a.truppe.equals("Cavalieri"))
			accumulatore -= 3;
		else if (b.terreno.equals("Palude") && a.truppe.equals("Equites"))
			accumulatore -= 2;
		else if (b.terreno.equals("Palude") && a.truppe.equals("Velites"))
			accumulatore += 1;
		else if (b.terreno.equals("Palude") && a.truppe.equals("Ninja"))
			accumulatore += 1;
		else if (b.terreno.equals("Palude") && a.truppe.equals("Monaci guerrieri"))
			accumulatore += 1;
		else if (b.terreno.equals("Palude"))
			accumulatore -= 1;

		if (b.orario.equals("Giorno") && a.truppe.equals("Ninja"))
			accumulatore -= 3;
		else if (b.orario.equals("Notte") && a.truppe.equals("Ninja"))
			accumulatore += 3;
		else if (b.orario.equals("Notte") && a.truppe.equals("Arceri"))
			accumulatore -= 1;
		else if (b.orario.equals("Notte") && a.truppe.equals("Balestrieri"))
			accumulatore -= 1;
		else if (b.orario.equals("Notte") && a.truppe.equals("Catapulte"))
			accumulatore -= 1;

		return accumulatore;

	}

	static int calcolaPercentualeStrategia(String strategiaA, String truppeA, String strategiaB, String truppeB) {

		int percentuale = 0;

		Globali.matchTruppa = false;
		Globali.matchStrategia = false;

		// ------------------ATTACCO FRONTALE/ATTACCO FRONTALE
		// ---------------------------------------------

		if (strategiaA.equals("attacco frontale") && strategiaB.equals("attacco frontale")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 90;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 0;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO FRONTALE / ACCERCHIAMENTO -----------------------

		else if (strategiaA.equals("attacco frontale") && strategiaB.equals("accerchiamento")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 10;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO FRONTALE / TENERE LA POSIZIONE
		// -----------------------

		else if (strategiaA.equals("attacco frontale") && strategiaB.equals("tenere la posizione")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 40;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO FRONTALE / ATTACCO A CUNEO -----------------------

		else if (strategiaA.equals("attacco frontale") && strategiaB.equals("attacco a cuneo")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 0;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO FRONTALE / DIFESA A QUADRATO
		// -----------------------

		else if (strategiaA.equals("attacco frontale") && strategiaB.equals("difesa a quadrato")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO FRONTALE / RITIRATA STRATEGICA
		// -----------------------

		else if (strategiaA.equals("attacco frontale") && strategiaB.equals("ritirata strategica")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ACCERCHIAMENTO / ACCERCHIAMENTO -----------------------

		else if (strategiaA.equals("accerchiamento") && strategiaB.equals("accerchiamento")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ACCERCHIAMENTO / TENERE LA POSIZIONE
		// -----------------------

		else if (strategiaA.equals("accerchiamento") && strategiaB.equals("tenere la posizione")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 60;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ACCERCHIAMENTO / ATTACCO A CUNEO -----------------------

		else if (strategiaA.equals("accerchiamento") && strategiaB.equals("attacco a cuneo")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ACCERCHIAMENTO / DIFESA A QUADRATO -----------------------

		else if (strategiaA.equals("accerchiamento") && strategiaB.equals("difesa a quadrato")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 0;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 0;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ACCERCHIAMENTO / RITIRATA STRATEGICA
		// -----------------------

		else if (strategiaA.equals("accerchiamento") && strategiaB.equals("ritirata strategica")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------TENERE LA POSIZIONE / TENERE LA POSIZIONE
		// -----------------------

		else if (strategiaA.equals("tenere la posizione") && strategiaB.equals("tenere la posizione")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 0;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 0;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 100;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------TENERE LA POSIZIONE / ATTACCO A CUNEO
		// -----------------------

		else if (strategiaA.equals("tenere la posizione") && strategiaB.equals("attacco a cuneo")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 40;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 60;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 60;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------TENERE LA POSIZIONE / DIFESA A QUADRATO
		// -----------------------

		else if (strategiaA.equals("tenere la posizione") && strategiaB.equals("difesa a quadrato")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 0;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 100;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------TENERE LA POSIZIONE / RITIRATA STRATEGICA
		// -----------------------

		else if (strategiaA.equals("tenere la posizione") && strategiaB.equals("ritirata strategica")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO A CUNEO / ATTACCO A CUNEO -----------------------

		else if (strategiaA.equals("attacco a cuneo") && strategiaB.equals("attacco a cuneo")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 80;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 0;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO A CUNEO / DIFESA A QUADRATO
		// -----------------------

		else if (strategiaA.equals("attacco a cuneo") && strategiaB.equals("difesa a quadrato")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 60;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 70;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 30;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 10;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 90;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 20;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 30;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------ATTACCO A CUNEO / RITIRATA STRATEGICA
		// -----------------------

		else if (strategiaA.equals("attacco a cuneo") && strategiaB.equals("ritirata strategica")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------DIFESA A QUADRATO / DIFESA A QUADRATO
		// -----------------------

		else if (strategiaA.equals("difesa a quadrato") && strategiaB.equals("difesa a quadrato")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				percentuale = 10;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				percentuale = 50;
				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				percentuale = 0;
				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				percentuale = 50;

				Globali.matchTruppa = true;
			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				percentuale = 50;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				percentuale = 100;

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				percentuale = 100;

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		// -------------------DIFESA A QUADRATO / RITIRATA STRATEGICA
		// -----------------------

		else if (strategiaA.equals("difesa a quadrato") && strategiaB.equals("ritirata strategica")) {

			if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

				Globali.matchTruppa = true;

			}

			else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

				Globali.matchTruppa = true;
			}

			Globali.matchStrategia = true;

		}

		return percentuale;

	}

}
