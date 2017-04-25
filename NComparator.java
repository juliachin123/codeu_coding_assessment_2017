import java.util.*;
import java.io.*;
public class NComparator implements Comparator<Stock> {
    public int compare(Stock n1, Stock n2) {
        String n3 = n1.getN();
        String n4 = n2.getN();
        return n3.toLowerCase().compareTo(n4.toLowerCase());
    }
}