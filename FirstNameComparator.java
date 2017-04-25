import java.util.*;
import java.io.*;
public class FirstNameComparator implements Comparator<Student>{
	public int compare(Student a, Student b){
		String first1 = a.getFirst();
		String first2 = b.getFirst();
		return first1.compareTo(first2);
	}
}