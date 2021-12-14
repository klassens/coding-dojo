package function_katas;
import java.util.Scanner;

//FRAGE: Wie kann man wiederverwendbare Variablen schneller schreiben ohne es sie jedes Mal auszuschreiben (Tastenkombi)?
public class Galgenmann {
	public static void start() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Gib das zu erratende Wort ein: ");
		String zuErratenesWort = sc.next();
		Galgenm�nnchen test = new Galgenm�nnchen(zuErratenesWort);


		char eingabe  = ' ';
		String vollst�ndigesWort = "";


		while(vollst�ndigesWort.equals(zuErratenesWort) == false) // while(String != String) hat nicht funktioniert --> vergleicht Adresse wie bei einer Instanz
		{
			System.out.println("Gib einen Buchstaben ein: ");
			eingabe = sc.next().charAt(0);
			vollst�ndigesWort = test.Ratebuchstabe(eingabe);
			System.out.println(vollst�ndigesWort);
		}
		System.out.println("Geschafft!");

	}
}

class Galgenm�nnchen{
	private String wort = "";
	public String erratenesWort = "";
	public Galgenm�nnchen(String gesuchtesWort)
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

