
public class SunTzu {

	public static String parla() {

		String discorso = new String();

		int y;
		y = (int) ((Math.random() * 100) % 8);

		if (y == 0) {

			discorso = "Chi in cento battaglie riporta cento\n vittorie" + " non è il più abile in assoluto.\n"
					+ "Chi non dà nemmeno battaglia\ne sottomette l'avversario,\n" + "è il più abile in assoluto.";

		}

		else if (y == 1) {

			discorso = "La strategia è la via del paradosso.";

		}

		else if (y == 2) {

			discorso = "Il vittorioso impegnato a\ncombattere il nemico è simile\n"
					+ "a una massa d'acqua, che irrompe\n in una gola profonda mille jen.";

		}

		else if (y == 3) {

			discorso = "Il potere è come la contrazione\ndella balestra;\n"
					+ "la tempestività come lo scoccare\ndel dardo.";

		}

		else if (y == 4) {

			discorso = "Sii veloce come il vento;\nlento come una pianta;\n"
					+ "aggressivo come il fuoco;\nimmobile come una montagna;\n"
					+ "inconoscibile come lo yin;\nirruento come il tuono.";

		}

		else if (y == 5) {

			discorso = "Quando le truppe nemiche\nti si presentano minacciose,\n"
					+ "mantenendo a lungo\nquesto atteggiamento,\n"
					+ "senza impegnarsi nel\ncombattimento e senza ritirarsi,\n"
					+ "devi studiare attentamente\nla situazione.";

		}

		else if (y == 6) {

			discorso = "Se ne ricavate un profitto, muovetevi;\n" + "se non lo ricavate, fermatevi.";

		}

		else if (y == 7) {

			discorso = "Resistere è un difetto;\nattaccare, un eccesso.";

		}

		else if (y == 8) {

			discorso = "Quando il nemico si trova\na suo agio, può essere messo\na disagio;\n"
					+ "quando è sazio, gli si può\nmettere fame;\n" + "quando è stabile,\npuò essere scosso.";

		}

		return discorso;

	}

}
