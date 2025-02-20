package Lesson;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		
		java.util.Scanner sc;
		/*
		 * A differenza delle variabili come int e String, 
		 * alcuni tipi di variabili non possono essere usati
		 * solo dichiarandoli. Devono essere istanziati!
		 * ISTANZIARE una varibile significa rendella un vero oggetto!
		 * Prima di questa operazione, l'istanziamento, la variabile è solo BLOCCATA 
		 * per poter fare quello per cui è stata dichiarata
		 * 
		 * Nel nostro caso 
		 * 
		 * java.util.Scanner sc; 
		 * significa che sc è predisposta per diventare un oggetto di tipo java.util.Scanner
		 * e non può più essere usata come una variabile di altro tipo.
		 * MA non occupa ancora memoria vera! E' solo un nome bloccato!
		 * Per occupare VERA MEMORIA, dobbiamo istanziarla!
		 * Quando si istanzia un oggetto si usa (di solito) la parola chiave new
		 * E si richiama (di solito) il nome della classe dell'oggetto
		 * new java.util.Scanner();
		 * ALLE VOLTE (e Scanner è una di queste) è necessario anche indicare dei parametri di costruzione.
		 * Cioè non solo l'istanziamento farà occupare a sc della memoria, ma gli si dice anche come
		 * deve essere costruito, deve (nel nostro caso) essere predisposto già ad essere usato per l'input da tastiera.
		 * Quindi non solo scriveremo
		 * sc = new java.util.Scanner(); ma vi aggiungeremo i parametri di costruzione:
		 * sc = new java.util.Scanner(System.in); 
		 * 
		 */
		
		sc = new java.util.Scanner(System.in);
		// ORA sc è un oggetto di tipo Scanner e occupa memoria vera ed è stato costruito in modo da poter gestire l'input da tastiera!
		// E' pronto!
		
		System.out.println("Come ti chiami?");
		nome = sc.nextLine(); 
		// nextLine() è un metodo dell'oggetto sc di tipo Scanner che legge una riga di testo da tastiera.
		// Cioè aspetta che l'utente prema INVIO e nel frattempo si segna tutto quello che l'utente scrive.
		// Intanto tiene bloccato il terminale a non andare avanti nel programma.
		// Così l'utente vede il programma fermo e può scrivere. Appena preme invio... sc prenderà tutto il digitato e lo riverserà
		// In nome, in questo caso
		System.out.println("Ciao " + nome + "!");
		sc.close();
	}
}
