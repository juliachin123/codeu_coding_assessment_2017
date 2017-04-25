
import java.util.*;
public class ReferenceSemantics1{
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = 9 - i;
			System.out.print(a[i]);
		}
		System.out.println();

		System.out.println("a[]: " + Arrays.toString(a));
		System.out.println("pointer a: " + a);  //prints value of pointer a.  See DPointers in 0Ch4Examples
		System.out.println();

		for (int i = 0; i < 10; i++){
			a[i] = a[a[i]];
			System.out.print(a[i]);
		}
		System.out.println();

		System.out.println("a[]: " + Arrays.toString(a));

		int[] b = a;
		System.out.println("b[]: " + Arrays.toString(b));
		System.out.println("pointer b: " + b);
		System.out.println();


		voidMethod(a);
		System.out.println("a[]: " + Arrays.toString(a));
		System.out.println();				

		int[] d = {1, 2, 3, 4, 5};
		int[] e = {1, 2, 3, 4, 5};
		System.out.println("pointer d: " + d + ",  pointer e: " + e);		
		System.out.println(d == e);
		System.out.println(Arrays.equals(d,e));
	}

	public static void voidMethod(int[] c){
		for (int i = 0; i < 10; i++){
			c[i] = c[i] + 10;
		}
		System.out.println("c[]: " + Arrays.toString(c));
		System.out.println("pointer c: " + c);
		System.out.println();

	}
	
}