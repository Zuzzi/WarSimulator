import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class AI {

	public static Neurone neurone1 = new Neurone();
	public static Neurone neurone2 = new Neurone();
	public static Neurone neurone3 = new Neurone();
	public static Neurone neurone4 = new Neurone();
	public static Neurone neurone5 = new Neurone();

	static ArrayList<String> strategie = new ArrayList<String>();

	public static String decidi(String truppeA, String truppeB) {

		int contatore;
		boolean trovato = false;
		int k = 0;

		String tipoTruppeA = new String();
		String tipoTruppeB = new String();

		String strategiaAI = new String();

		String strategiaProbabileA = new String();

		if (truppeA.equals("Cavalieri") || truppeA.equals("Equites"))
			tipoTruppeA = "cavalleria";
		else if (truppeA.equals("Balestrieri") || truppeA.equals("Arceri") || truppeA.equals("Catapulte"))
			tipoTruppeA = "tiro";
		else
			tipoTruppeA = "fanteria";

		if (truppeB.equals("Cavalieri") || truppeB.equals("Equites"))
			tipoTruppeB = "cavalleria";
		else if (truppeB.equals("Balestrieri") || truppeB.equals("Arceri") || truppeB.equals("Catapulte"))
			tipoTruppeB = "tiro";
		else
			tipoTruppeB = "fanteria";

		strategiaProbabileA = pensa(tipoTruppeA, tipoTruppeB);

		strategie.add("attacco frontale");
		strategie.add("accerchiamento");
		strategie.add("tenere la posizione");
		strategie.add("difesa a quadrato");
		strategie.add("attacco a cuneo");
		strategie.add("ritirata strategica");

		Collections.shuffle(strategie);

		for (int i = 0; i < 5 && !trovato; i++) {

			neurone1.impulso(strategie.get(i), strategiaProbabileA);
			neurone2.impulso(strategie.get(i), strategiaProbabileA);
			neurone3.impulso(strategie.get(i), strategiaProbabileA);
			neurone4.impulso(strategie.get(i), strategiaProbabileA);
			neurone5.impulso(strategie.get(i), strategiaProbabileA);

			k = i;

			if (neurone1.attivato && neurone2.attivato && neurone3.attivato && neurone4.attivato && neurone5.attivato)
				trovato = true;

		}

		if (trovato)
			strategiaAI = strategie.get(k);
		else if (!trovato && tipoTruppeB.equals("tiro"))
			strategiaAI = "tenere la posizione";
		else if (!trovato && tipoTruppeB.equals("fanteria"))
			strategiaAI = "attacco frontale";
		else if (!trovato && tipoTruppeB.equals("cavalleria"))
			strategiaAI = "attacco a cuneo";

		return strategiaAI;

	}

	public static String pensa(String truppeA, String truppeB) {

		String strategiaProbabileA = new String();

		if (truppeA.equals("fanteria") && truppeB.equals("fanteria")) {

			strategiaProbabileA = "attacco frontale";

		}

		else if (truppeA.equals("fanteria") && truppeB.equals("cavalleria")) {

			strategiaProbabileA = "accerchiamento";

		}

		else if (truppeA.equals("fanteria") && truppeB.equals("tiro")) {

			strategiaProbabileA = "attacco a cuneo";

		}

		else if (truppeA.equals("cavalleria") && truppeB.equals("cavalleria")) {

			strategiaProbabileA = "accerchiamento";

		}

		else if (truppeA.equals("cavalleria") && truppeB.equals("tiro")) {

			strategiaProbabileA = "attacco a cuneo";

		}

		else if (truppeA.equals("tiro") && truppeB.equals("tiro")) {

			strategiaProbabileA = "tenere la posizione";

		}

		else if (truppeA.equals("cavalleria") && truppeB.equals("fanteria")) {

			strategiaProbabileA = "accerchiamento";

		}

		else if (truppeA.equals("tiro") && truppeB.equals("fanteria")) {

			strategiaProbabileA = "tenere la posizione";

		}

		else if (truppeA.equals("tiro") && truppeB.equals("cavalleria")) {

			strategiaProbabileA = "difesa a quadrato";

		}

		return strategiaProbabileA;

	}

}
