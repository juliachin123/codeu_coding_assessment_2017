import java.util.*;
import java.io.*;
public class LetterComparator implements Comparator<Student>{
	public int compare(Student a, Student b){
		String letter1 = a.getLetter();
		String letter2 = b.getLetter();
		return letter1.compareTo(letter2);
	}
}