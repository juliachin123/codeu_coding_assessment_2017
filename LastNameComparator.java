import java.util.*;
import java.io.*;
public class LastNameComparator implements Comparator<Student>{
	public int compare(Student a, Student b){
		String last1 = a.getLast();
		String last2 = b.getLast();
		return last1.compareTo(last2);
	}
}