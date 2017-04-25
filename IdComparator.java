import java.util.*;
import java.io.*;
public class IdComparator implements Comparator<Student>{
	public int compare(Student a, Student b){
		int id1 = a.getId();
		int id2 = b.getId();
		return id1-id2;
	}
}