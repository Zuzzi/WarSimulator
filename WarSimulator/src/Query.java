
public class Query {

	static String creaTabella = "create table salvataggio ( partita varchar(20) primary key, terreno varchar(10), ora varchar(10), vincitore int,"
			+ "popolo1 varchar(10), generale1 varchar(30), truppe1 varchar(20), strategia1 varchar(30),"
			+ "popolo2 varchar(10), generale2 varchar(30), truppe2 varchar(20), strategia2 varchar(30));";

	static String stampaTabella = "select * from salvataggio;";

	static String cancellaTabella = "delete  from salvataggio;";

}
