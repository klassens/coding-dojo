package function_katas;
import java.util.Scanner;

//FRAGE: Wie kann man wiederverwendbare Variablen schneller schreiben ohne es sie jedes Mal auszuschreiben (Tastenkombi)?
public class Galgenmann {
	public static void start() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Gib das zu erratende Wort ein: ");
		String zuErratenesWort = sc.next();
		Galgenmännchen test = new Galgenmännchen(zuErratenesWort);


		char eingabe  = ' ';
		String vollständigesWort = "";


		while(vollständigesWort.equals(zuErratenesWort) == false) // while(String != String) hat nicht funktioniert --> vergleicht Adresse wie bei einer Instanz
		{
			System.out.println("Gib einen Buchstaben ein: ");
			eingabe = sc.next().charAt(0);
			vollständigesWort = test.Ratebuchstabe(eingabe);
			System.out.println(vollständigesWort);
		}
		System.out.println("Geschafft!");

	}
}

class Galgenmännchen{
	private String wort = "";
	public String erratenesWort = "";
	public Galgenmännchen(String gesuchtesWort)
	{
		wort = gesuchtesWort;
		for (int i = 0; i < wort.length(); i++) {
			erratenesWort+="_";
		}
	}

	public String Ratebuchstabe(char buchstabe)
	{
		String neuesWort = "";
		for (int i = 0; i < wort.length(); i++) {

			if(buchstabe == wort.charAt(i) && erratenesWort.charAt(i) == '_')
				neuesWort += buchstabe;
			else if (erratenesWort.charAt(i) == '_')
				neuesWort += "_";
			else
				neuesWort += erratenesWort.charAt(i);
		}
		erratenesWort = neuesWort;

		return erratenesWort;
	}

}

