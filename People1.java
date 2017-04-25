import java.util.*;
public class People1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<Person>();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1= new ArrayList<String>();
		String name= input.next();
		while (!name.equals("stop")){
			int age= input.nextInt();
			double weight= input.nextInt();
			Person p= new Person();
			p= p.setPeople(name,age,weight);
			people.add(p);
			name= input.next();
		}
		for (int i=0; i< people.size(); i++){
			list1.add(people.get(i).toString());
		}
		System.out.println("Original list: ");
		System.out.println(list1);
		System.out.println("");
		Collections.sort(people);
		for (int i=0; i< people.size(); i++){
			list.add(people.get(i).toString());
		}
		System.out.println("Sorted list: ");
		System.out.println(list);
		//for (int i= 0; i< list.size(); i++){
		//	System.out.println(list.get(i).toString());
		//}
	}
}

