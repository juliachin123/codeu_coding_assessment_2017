import java.util.*;
public class FibonacciSequence {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Input row index: ");
		int ri= input.nextInt(); //set row index var
		System.out.print("Input column index: ");
		int ci=input.nextInt(); //set column index var
		int[] num= new int[2];
		num[0]=ri;
		num[1]=ci;
		Columnzero(num);
		int fib=num[0]; //number of rows total
		long[][] arrPascal= new long[92][92];
		Pascal(fib, num, arrPascal);
		Fib(fib, num, arrPascal);
	}
		public static void Columnzero(int[] num){ //set column to 0 if !0
			while( num[1]!=0){
				num[0]++;
				num[1]--;
			}

		}
		public static void Pascal(int fib, int[] num, long[][] arrPascal){ //Pascal's tnum[0]angle
			for(int i=0; i<=num[0]; i++){ //Pascal's triangle
				arrPascal[i]= new long[i+1];
				arrPascal[i][0]=1;
				arrPascal[i][i]=1;
				if (i>1){	
					for (int j=1;j<i;j++){
						if (arrPascal[i][j]>Long.MAX_VALUE || arrPascal[i][j]<0){ //long detection
							arrPascal[i][j]=0;
						}
						else{
							arrPascal[i][j]=arrPascal[i-1][j-1]+ arrPascal[i-1][j];
						}
						if (arrPascal[i][j]>Long.MAX_VALUE|| arrPascal[i][j]<0){ //long detection
							arrPascal[i][j]=0;
						}
					}
				}
			}
		}
		public static void Fib(int fib, int[] num, long[][] arrPascal){ //pnum[0]nt output and calculate Fibonacci Sequence
			long sum=0;
			outerloop:
			while(num[0]+num[1]==fib){
				if (num[0]==num[1]&& num[0]>0){
					break outerloop;
				}
				sum+=arrPascal[num[0]][num[1]]; //finding the total for the fibonacci sequence
				System.out.printf("arrPascal%-9s","["+num[0]+"]["+num[1]+"]");
				System.out.println("= "+arrPascal[num[0]][num[1]]);
				num[0]--;
				if (num[0]<0){
					break outerloop;
				}
				if (num[0]!=num[1]){
					num[1]++;
				}
			}
			System.out.println("-----------------------");
			System.out.printf("Fibonacci%-9s","("+(fib+1)+")");     
			System.out.println("= "+sum);
			System.out.print(Arrays.toString(arrPascal[fib]));
		}
}