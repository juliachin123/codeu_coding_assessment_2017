public class Superhero{
	String s;
	public Superhero(){
		s= "I'M A SUPERHERO";
		System.out.println(s);
	} 
	public void punch(){
		System.out.println("Punch! Punch!");
	}
	public void punch (Superhero a){
		System.out.println("BOOM "+ s);
	}
}