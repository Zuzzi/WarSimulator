
public class SunTzu {

	public static String parla() {

		String discorso = new String();

		int y;
		y = (int) ((Math.random() * 100) % 8);

		if (y == 0) {

			discorso = "Chi in cento battaglie riporta cento\n vittorie" + " non � il pi� abile in assoluto.\n"
					+ "Chi non d� nemmeno battaglia\ne sottomette l'avversario,\n" + "� il pi� abile in assoluto.";

		}

		else if (y == 1) {

			discorso = "La strategia � la via del paradosso.";

		}

		else if (y == 2) {

			discorso = "Il vittorioso impegnato a\ncombattere il nemico � simile\n"
					+ "a una massa d'acqua, che irrompe\n in una gola profonda mille jen.";

		}

		else if (y == 3) {

			discorso = "Il potere � come la contrazione\ndella balestra;\n"
					+ "la tempestivit� come lo scoccare\ndel dardo.";

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

			discorso = "Resistere � un difetto;\nattaccare, un eccesso.";

		}

		else if (y == 8) {

			discorso = "Quando il nemico si trova\na suo agio, pu� essere messo\na disagio;\n"
					+ "quando � sazio, gli si pu�\nmettere fame;\n" + "quando � stabile,\npu� essere scosso.";

		}

		return discorso;

	}

}
