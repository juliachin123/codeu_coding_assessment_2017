import java.util.*;
public class Mice{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int listnum=s.nextInt(); //number of integers on my list
		int[] list= new int[listnum];
		for (int i=0; i<listnum; i++){
			list[i]=s.nextInt();
		}
		int j=0;
		int k=0;
		int mice=s.nextInt();
		while (mice<1 || mice>1000){
			mice=s.nextInt();
		}
		int[][]micelist= new int[mice][];
		for (j=0; j<mice; j++){
			int micenum=s.nextInt();
			micelist[j]= new int[micenum];
			for(k=0; k<micelist[j].length; k++){	
				micelist[j][k]=s.nextInt();
			}
		}
		int match=0;
		int x;
		outerloop:
		for (j=0; j<mice; j++){
			int secondlistnumber=0;
			int count=0;
			for (k=0; k<micelist[j].length; k++){
					if (k==micelist[j].length){
						x= micelist[j].length;
					}
					else{
						x= micelist[j][k];
					}
					if (x== list[secondlistnumber]){
						count+=1;
						secondlistnumber+=1;
					}
					else {
						while (x!=list[secondlistnumber]){
							if (secondlistnumber>micelist[j].length){
								break outerloop;
							}
							secondlistnumber+=1;
						}
						count+=1;
						secondlistnumber+=1;
					}
			}
			if (count==micelist[j].length){
				match+=1;
			}
			else{
				break outerloop;
			}
		}
		System.out.println(match);
	}
}	