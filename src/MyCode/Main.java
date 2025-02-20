package MyCode;

import java.util.Scanner;
import Utils.MyIo;

public class Main {

	public static void main(String[] args) {
		// MyIo.readF("src/MyCode/Persona.java");
		
		Persona p1 = new Persona();
		System.out.println(p1);
		System.out.println(p1.superToString());
		
		int age;
		double height;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		MyIo.pl("Quanti anni hai?"); // println() personalizzato
		
		// System.out.println("Quanti anni hai?");
		age = scanner.nextInt();
		System.out.println("Hai detto di avere " + age + " anni.\n");
		
		scanner.nextLine();
		
		System.out.println("Come ti chiami?");
		name = scanner.nextLine();
		System.out.println("Hai detto di chiamarti: " + name + "\n");
		
		System.out.println("Quanto sei alto in m?");
		height = scanner.nextDouble();
		System.out.println("Hai detto di essere alto " + height + "m\n");
		
		scanner.nextLine();
		
		// Persona p2 = new Persona(name, age, height);
		// System.out.println(p2.getPersonaInfo(name, age, height)); // con toString() overridato
		
		// System.out.println("Dati registrati. Ti chiami " + name + ", hai " + age + " anni e sei alto " + height + "m\n");
		// System.out.println("\rGrazie! I tuoi dati sono ora di Elon Musk e verranno inseriti in un robot.");
		
		scanner.close();
		
		// MyIo.readF("Main.java");
	}
}


