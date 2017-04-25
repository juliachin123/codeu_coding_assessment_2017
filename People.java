import java.util.*;
public class People{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<Person>();
		String name= input.next();
		while (!name.equals("stop")){
			int age= input.nextInt();
			double weight= input.nextInt();
			Person p= new Person();
			p= p.setPeople(name,age,weight);
			people.add(p);
			name= input.next();
		}
		for (int i= 0; i< people.size(); i++){
			System.out.println(people.get(i).toString());
		}
	}
}