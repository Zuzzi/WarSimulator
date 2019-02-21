import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Database {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:./bin/db/";
	static final String DB_NOME = "db";
	static final String USER = "admin";
	static final String PASS = "admin";
	static boolean connesso;
	static Statement stmt = null;
	static Connection conn = null;

	static boolean connetti() throws SQLException {

		connesso = false;
		try {

			Class.forName(JDBC_DRIVER);
			conn = (DriverManager.getConnection(DB_URL + DB_NOME, USER, PASS));

			if (conn != null)
				connesso = true;

		} catch (Exception e) {
			infoBoxErrore("Si è verificato un errore durante la connessione, il programma verrà chiuso.", "Errore");

			System.exit(0);

		}

		return connesso;
	}

	static void disconnetti() throws SQLException {

		try {
			conn.close();
			connesso = false;
		} catch (Exception e) {
			infoBoxErrore("Si è verificato un errore durante la disconnessione, il programma verrà chiuso.", "Errore");
			System.exit(0);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	static boolean esistenzaTabella() throws SQLException {

		boolean esiste = false;
		int count = 0;

		String query = "select count(*)as count from information_schema.tables  where table_name ='SALVATAGGIO'";

		stmt = (conn.createStatement());
		try {
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				count = rs.getInt("count");
			}
			if (count > 0)
				esiste = true;

		} catch (SQLException e) {

			infoBoxErrore(
					"Si è verificato un errore durante il controllo sull'esistenza della tabella, il programma verrà chiuso.",
					"Errore");
			System.exit(0);

		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

		return esiste;
	}

	static void stampaTabella(JTable tabellone) throws SQLException {

		String appoggio = new String();

		int grandezza = 0;

		DefaultTableModel dtm = new DefaultTableModel(0, 0);

		String header[] = new String[] { "Salvataggio", "Terreno", "Ora", "Vincitore", "Popolo1", "Generale1",
				"Truppe1", "Strategia1", "Popolo2", "Generale2", "Truppe2", "Strategia2" };

		dtm.setColumnIdentifiers(header);

		tabellone.setModel(dtm);

		stmt = (conn.createStatement());
		try {

			ResultSet rs = stmt.executeQuery(Query.stampaTabella);

			while (rs.next()) {

				dtm.addRow(new Object[] { rs.getString("partita"), rs.getString("terreno"), rs.getString("ora"),
						rs.getInt("vincitore"), rs.getString("popolo1"), rs.getString("generale1"),
						rs.getString("truppe1"), rs.getString("strategia1"), rs.getString("popolo2"),
						rs.getString("generale2"), rs.getString("truppe2"), rs.getString("strategia2") });

				grandezza++;

			}

		} catch (SQLException e) {

			infoBoxErrore("Si è verificato un errore durantela stampa della tabella, il programma verrà chiuso.",
					"Errore");
			System.exit(0);

		}

		finally {
			if (stmt != null)
				stmt.close();

			if (grandezza >= 100) {

				Database.esegui_query(Query.cancellaTabella);

			}

		}

	}

	static void esegui_query(String query) throws SQLException {

		stmt = (conn.createStatement());
		try {

			stmt.executeUpdate(query);

		} catch (SQLException se) {
			infoBoxErrore("Si è verificato un errore durante l'esecuzione di una query, il programma verrà chiuso.",
					"Errore");

			se.printStackTrace();
			System.exit(0);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

	}

	public static boolean salvataggio_esistente(String nomePartita) throws SQLException {

		boolean esiste = false;
		int count = 0;
		String salvataggio = "select count(*)as count FROM SALVATAGGIO WHERE partita='" + nomePartita + "';";

		stmt = (conn.createStatement());
		try {
			ResultSet rs = stmt.executeQuery(salvataggio);
			while (rs.next()) {
				count = rs.getInt("count");
			}
			if (count > 0)
				esiste = true;

		} catch (SQLException e) {

			infoBoxErrore(
					"Si è verificato un errore durante il controllo di un salvataggio già esistente, il programma verrà chiuso.",
					"Errore");
			System.exit(0);

		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

		return esiste;
	}

	static void infoBox(String infoMessage, String location) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);
	}

	static void infoBoxErrore(String infoMessage, String location) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.ERROR_MESSAGE);

	}

}
