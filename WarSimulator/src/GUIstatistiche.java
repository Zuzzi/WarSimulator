import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUIstatistiche extends JFrame {

	static JTable tabella;
	JScrollPane scrollPane;
	boolean stato = false;

	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int) Math.round(14.0 * screenRes / 72.0);

	Font font = new Font("serif", Font.PLAIN, fontSize);

	void creaStatistiche() {

		tabella = new JTable();

		scrollPane = new JScrollPane(tabella);
		scrollPane.setPreferredSize(new Dimension(1300, 200));

		setContentPane(scrollPane);

		tabella.setEnabled(false);

		try {
			stato = Database.connetti();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (stato) {

			try {
				if (!Database.esistenzaTabella())

					Database.esegui_query(Query.creaTabella);

			} catch (SQLException e) {

				e.printStackTrace();
			}

			finally {

				try {
					Database.stampaTabella(tabella);
				} catch (SQLException e) {

					e.printStackTrace();
				}

			}

		}

		pack();

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2, (dimFinestra.height - getHeight()) / 2 - 200);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		// setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Statistiche");

	}

}
