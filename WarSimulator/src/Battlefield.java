
public class Battlefield {

	String terreno;

	String orario;

	public void random() {

		int field;
		int time;

		do {

			field = (int) ((Math.random() * 100) % 4);

		} while (field == 0);

		do {

			time = (int) ((Math.random() * 100) % 3);

		} while (time == 0);

		if (field == 1)
			terreno = "Pianura";
		else if (field == 2)
			terreno = "Foresta";
		else if (field == 3)
			terreno = "Palude";

		if (time == 1)
			orario = "Giorno";
		else if (time == 2)
			orario = "Notte";

	}

}
