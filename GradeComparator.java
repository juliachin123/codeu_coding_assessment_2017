import java.util.*;
import java.io.*;
public class GradeComparator implements Comparator<Student>{
	public int compare(Student a, Student b){
		double grade1 = a.getGrade();
		double grade2 = b.getGrade();
		return (int) (grade1-grade2);
	}
}