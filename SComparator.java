import java.util.*;
import java.io.*;
public class SComparator implements Comparator<Stock> {
    public int compare(Stock s1, Stock s2) {
        String n3 = s1.getS();
        String n4 = s2.getS();
        return n3.compareTo(n4);
    }
}