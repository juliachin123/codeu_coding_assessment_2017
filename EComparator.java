import java.util.*;
import java.io.*;
public class EComparator implements Comparator<Stock> {
    public int compare(Stock e1, Stock e2) {
        String n3 = e1.getE();
        String n4 = e2.getE();
        return n3.compareTo(n4);
    }
}