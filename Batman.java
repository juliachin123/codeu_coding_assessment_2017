public class Batman extends Superhero {
	String s;
	public Batman(){
		s= "NANANANANNANANANANA";
	}
	public Batman (String s){
		this.s = s;
		System.out.println(this.s);
	}
	public void punch (Superhero v){
		s= "BATMAN! ";
		super.punch(v);
		System.out.println("BOOM "+ s);
	}
	public void punch(Batman b){
		System.out.println("Wat.");
	}
}