public class SuperheroClient{
	public static void main(String[] args) {
		System.out.println();

		System.out.println("slide 14");
		Superhero superhero = new Superhero();
		superhero.punch(superhero);

		// System.out.println("slide 16");
		// Batman batman = new Batman("I'M BATMAN!");
		// batman.punch(batman);

		// System.out.println("slide 18");			//compile-time error
		// Batman batman = new Superhero();
		// batman.punch(batman);

		// System.out.println("slide 20");
		// Superhero superhero = new Batman();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 22");
		// Batman batman = new Batman();
		// ((Superhero) batman).punch(batman);

		// System.out.println("slide 24");			//run-time error
		// Superhero superhero = new Superhero();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 26");
		// Superhero superhero = new Batman();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 28");			//compile-time error
		// Batman batman = new Batman();			//remove Superhero.punch(Superhero a)
		// ( (Superhero) batman).punch(batman);
	}
}