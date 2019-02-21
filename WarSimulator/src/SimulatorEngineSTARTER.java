
public class SimulatorEngineSTARTER {

	public static void starter(Army a, Army b, Battlefield c) {

		int valoreArmataA;
		int valoreArmataB;

		int bonusBattlefieldA;
		int bonusBattlefieldB;

		int percentualeStrategiaA;
		int percentualeStrategiaB;

		String tipoTruppeA;
		String tipoTruppeB;

		valoreArmataA = SimulatorEngine.calcolaValoreArmata(a);
		valoreArmataB = SimulatorEngine.calcolaValoreArmata(b);

		bonusBattlefieldA = SimulatorEngine.calcolaBonusBattlefield(a, c);
		bonusBattlefieldB = SimulatorEngine.calcolaBonusBattlefield(b, c);

		if (a.truppe.equals("Cavalieri") || a.truppe.equals("Equites"))
			tipoTruppeA = "cavalleria";
		else if (a.truppe.equals("Balestrieri") || a.truppe.equals("Arceri") || a.truppe.equals("Catapulte"))
			tipoTruppeA = "tiro";
		else
			tipoTruppeA = "fanteria";

		if (b.truppe.equals("Cavalieri") || b.truppe.equals("Equites"))
			tipoTruppeB = "cavalleria";
		else if (b.truppe.equals("Balestrieri") || b.truppe.equals("Arceri") || b.truppe.equals("Catapulte"))
			tipoTruppeB = "tiro";
		else
			tipoTruppeB = "fanteria";

		percentualeStrategiaA = SimulatorEngine.calcolaPercentualeStrategia(a.strategia, tipoTruppeA, b.strategia,
				tipoTruppeB);

		if (Globali.matchStrategia) {

			percentualeStrategiaB = 100 - percentualeStrategiaA;

		}

		else {

			percentualeStrategiaB = SimulatorEngine.calcolaPercentualeStrategia(b.strategia, tipoTruppeB, a.strategia,
					tipoTruppeA);

			percentualeStrategiaA = 100 - percentualeStrategiaB;

		}

		percentualeStrategiaA = (percentualeStrategiaA * (valoreArmataA + bonusBattlefieldA)) / 100;
		percentualeStrategiaB = (percentualeStrategiaB * (valoreArmataB + bonusBattlefieldB)) / 100;

		Globali.giocatore.probabilit‡Vittoria = valoreArmataA + bonusBattlefieldA + percentualeStrategiaA;
		Globali.avversario.probabilit‡Vittoria = valoreArmataB + bonusBattlefieldB + percentualeStrategiaB;

		System.out.println(Globali.giocatore.probabilit‡Vittoria);
		System.out.println(Globali.avversario.probabilit‡Vittoria);

	}

}
