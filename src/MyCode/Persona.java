package MyCode;

public class Persona {

	protected String CLASS_NAME = this.getClass().getName();
	public String name;
	public Integer age;
	public Double height;

	Persona() {
		System.out.println("Metodo toString() di default: " + this.superToString() + "\n");
		System.out.println(Persona.getClassName(CLASS_NAME));
	}

	Persona(String name, Integer age, Double height, Object... args) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println(this.getPersonaInfo(name, age, height) + "\n" + 
			"Altro: " + args);
	}

	@Override
	public String toString() {
		return "Piacere di conoscerti " + this.name + "\n";
	}
	
	public String superToString() {
		return super.toString() + "\n";
	}

	public String getPersonaInfo(String name, int age, double height) {
		return "Nome: " + name + "\t Età: " + age + "\t Altezza: " + height + "m\n";
	}
	
	public static String getClassName(String CLASS_NAME) {
		return "Il nome di questa classe è " + CLASS_NAME + "\n";
	}
}
