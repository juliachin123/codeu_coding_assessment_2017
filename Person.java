public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private double weight;
	public Person(){
		this.name= name;
		this.age= age;
		this.weight= weight;
	}
	public Person setPeople(String name, int age, double weight){
		this.name= name;
		this.age = age;
		this.weight = weight;
		return this;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public String toString(){
		return "{" + getName()+", " + getAge() +", "+ getWeight()+ "}";
	}
	public int compareTo(Person p){
		if (name.compareTo(p.name)> 0){
			return 1;
		}
		else if (name.compareTo(p.name)< 0){
			return -1;
		}
		else {
			if (age != p.age){
				return age-p.age;
			}
			else {
				if (weight != p.weight){
					return (int)Math.round(weight-p.weight);
				}
				else{
					return 0;
				}
			}
		}
	}
}