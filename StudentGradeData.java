import java.util.*;
import java.io.*;
public class StudentGradeData{
	public static void main(String [] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter student data file name: ");
		String file = console.next();
		File f = new File(file);
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner input = new Scanner(f);
		while(input.hasNextLine()){
			String last = input.next();
			String first = input.next();
			int id= input.nextInt();
			double grade = input.nextDouble();
			String letter = input.next();
			Student student = new Student(last, first, id, grade, letter);
			list.add(student);
		}
		System.out.println("Student data, by last name:");
		Collections.sort(list, new LastNameComparator());
		print(list);
		System.out.println("Student data, by first name:");
		Collections.sort(list, new FirstNameComparator());
		print(list);
		System.out.println("Student data, by student id:");
		Collections.sort(list, new IdComparator());
		print(list);
		System.out.println("Student data, by percentage:");
		Collections.sort(list, new GradeComparator());
		print(list);
		System.out.println("Student data, by grade:");
		Collections.sort(list, new LetterComparator());
		print(list);
		System.out.println("Student data, by last name(reversed):");
		Collections.sort(list, Collections.reverseOrder(new LastNameComparator()));
		print(list);
		System.out.println("Student data, by first name(reversed):");
		Collections.sort(list, Collections.reverseOrder(new FirstNameComparator()));
		print(list);
		System.out.println("Student data, by student id(reversed):");
		Collections.sort(list, Collections.reverseOrder(new IdComparator()));
		print(list);
		System.out.println("Student data, by percentage(reversed):");
		Collections.sort(list, Collections.reverseOrder(new GradeComparator()));
		print(list);
		System.out.println("Student data, by grade(reversed):");
		Collections.sort(list, Collections.reverseOrder(new LetterComparator()));
		print(list);
	}
	public static void print(ArrayList<Student> list){
		for (int i = 0; i < list.size(); i++){
			System.out.printf("%-10s", list.get(i).getLast());
			System.out.printf("%-14s", list.get(i).getFirst());
			System.out.printf("%06d", list.get(i).getId());
			System.out.printf("%8.1f", list.get(i).getGrade());
			System.out.printf("%6s", list.get(i).getLetter());
			System.out.println("");
		}
		System.out.println("");
	}
}