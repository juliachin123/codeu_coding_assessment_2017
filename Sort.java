import java.util.*;
public class Sort{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num1=input.nextInt();
		int[] array1=new int[num1];
		for (int i=0; i<num1; i++){
			array1[i]=input.nextInt();
		}
		int num2=input.nextInt();
		int[] array2= new int[num2];
		for (int i=0; i<num2; i++){
			array2[i]=input.nextInt();
		}
		int[] array3= new int[num1+num2];
		int j=0;
		int k=0;
		for (int i=0; i<(num1+num2); i++){
			if (j<num1 && k<num2){
				if (array1[j]<array2[k]){
					array3[i]=array1[j];
					j++;
				}	
				else{
					array3[i]=array2[k];
					k++;
				}	
			}
			else if (j<num1){
				if (array1[j]>array2[k-1]){
					array3[i]=array1[j];
					j++;
				}
			}
			else if (k<num2){
				if (array1[j-1]<array2[k]){
					array3[i]=array2[k];
					k++;
				}	
			}
		}
		for (int i=0; i<array3.length; i++){
			System.out.print(array3[i]+" ");
		}
		System.out.println();	
	}
}
/*		int x=num2;
		if(num1>num2){
			x=num1;
		}
		int max=array1[array1.length-1];
		if(array1[array1.length]<array2[array2.length]){
			max=array2[array2.length-1];
		}
		int k=array1.length-1;
		int l=array2.length-1;
		while(k<num1 ||l<num2){
			if(array1[k]<=max){
				max=array1[k];
				System.out.print(max+" ");
				k++;
			}
			k++;
			while(array2[l]>=max){
				max=array2[l];
				System.out.print(max+" ");
				l++;
			}
			l++;

			int k=0;
		int l=0;
		for (int i=0;i<x;i++){
			outerloop:
			if(array1[i]<array2[i]){
				if (i>0&&array1[i]<array2[i-1]){
					System.out.print(array2[i-1]+" ");
				}
				x=array1[i];
				System.out.print(x+" ");
				k++;
				if (k>=num1){
					break outerloop;
				}	
			}
			else{
				x=array2[i];
				System.out.print(x+" ");
				l++;
				if (l>=num2){
					break outerloop;
				}
			}
		}
		System.out.println();	

		int x=num2;
		if(num1>num2){
			x=num1;
		}
		int k=0;
		int l=0;
		for (int i=0;i<x;i++){
			outerloop:
			while(array1[k]<array2[l]){
				x=array1[k];
				System.out.print(x+" ");
				k++;
				if (k>=num1){
					break outerloop;
				}	
			}
			outerloop:
			while(array2[l]<array1[k]){
				x=array2[l];
				System.out.print(x+" ");
				l++;
				if (l>=num2){
					break outerloop;
				}
			}
		}*/