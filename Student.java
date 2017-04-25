public class Student{
	public String last;
	public String first;
	public int id;
	public double grade;
	public String letter;
	public Student (String last, String first, int id, double grade, String letter){
		this.last = last;
		this.first = first;
		this.id = id;
		this.grade = grade;
		this.letter = letter;
	}
	public String getLast(){
		return this.last;
	}
	public String getFirst(){
		return this.first;
	}
	public int getId(){
		return this.id;
	}
	public double getGrade(){
		return this.grade;
	}
	public String getLetter(){
		return this.letter;
	}

	public String toString(){
		return this.last + "       " + this.first + "          " + this.id + "    " + this.grade + "     " + this.letter;   
	}
}