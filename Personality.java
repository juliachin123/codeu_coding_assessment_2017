import java.util.*;
import java.io.*;
public class Personality{
	public static final int Q_TYPE=4;
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Input file name: ");
		String filename= input.next();
		while (!filename.equals("Personality1.txt") && !filename.equals("Personality2.txt") && !filename.equals("MyPersonality.txt")) {
			filename= input.next();
			System.out.print("File not found. Try again:");
		}
		Scanner file_input= new Scanner(new File(filename));
		int blankline_cnt=0; //blankline_cnt++; 
		int q1_cnt=0;
		int q2_cnt=0;
		int q3_cnt=0;
		int q4_cnt=0;
		int q5_cnt=0;
		int q6_cnt=0;
		int q7_cnt=0;
		int[][] answer=new int[2][7];
		String[] percentage_ary= new String[Q_TYPE];
		String[] character_type= new String[Q_TYPE];
		while (file_input.hasNext()){
			int space_cnt=0;
			space_cnt++; //count words in Character's name
			String test= file_input.next();
			if (test.length()<70){	
				if (space_cnt>1){
					System.out.print(" ");
				}
				System.out.print(test);
			}
			else{
				space_cnt=0;
				check_string(test, answer, percentage_ary, character_type, blankline_cnt);
			}	
		}		
	}	

	public static void check_string(String test, int[][] answer,String[]percentage_ary, String[]character_type, int blankline_cnt){
			for (int p=0; p<7;p++){ //questions 0-7
				answer[0][p]=0;
				answer[1][p]=0;
			}
			System.out.println(":");
			for (int i=0; i<70;i+=7){ //counting number of answers for character type questions 
				for (int j=0; j<=6; j++){
					if (test.charAt(i+j)=='a'|| test.charAt(i+j)=='A'){
						answer[0][j]++;
						//System.out.println(i+j+" "+answer[0][j]+""+j);
					}
					else if(test.charAt(i+j)=='b'|| test.charAt(i+j)=='B'){
						answer[1][j]++;
						//System.out.println(i+j+" "+answer[1][j]+""+j);
					}
				}
			}	
			cntNcalculate(answer,percentage_ary,character_type );
			end_print(percentage_ary,character_type, blankline_cnt);	
	}	

	public static void cntNcalculate(int[][] answer,String[] percentage_ary, String[] character_type){
		System.out.print("    "+answer[0][0]+"A-"+answer[1][0]+"B"); //number of answers for character type questions
		System.out.print(" ");
		System.out.print((answer[0][1]+answer[0][2])+"A-"+(answer[1][1]+answer[1][2])+"B");
		System.out.print(" ");
		System.out.print((answer[0][3]+answer[0][4])+"A-"+(answer[1][3]+answer[1][4])+"B");
		System.out.print(" ");
		System.out.println((answer[0][5]+answer[0][6])+"A-"+(answer[1][5]+answer[1][6])+"B");
		double a=(double)((answer[0][0]*(double)100)/(answer[0][0]+answer[1][0])); //calculate percentages
		int a1=(int)Math.round(a);
		//System.out.println(Math.round(a));
		double a2=(double)((answer[1][0]*(double)100)/(answer[0][0]+answer[1][0]));
		//System.out.println(a2);
		int a3=(int)Math.round(a2);
		//System.out.println(Math.round(a2));
		double b =(double)(((answer[0][1]+answer[0][2])*(double)100)/(answer[0][1]+answer[0][2]+answer[1][1]+answer[1][2]));
		int b1= (int)Math.round(b);
		//System.out.println(Math.round(b));
		double b2 =(double)(((answer[1][1]+answer[1][2])*(double)100)/(answer[0][1]+answer[0][2]+answer[1][1]+answer[1][2]));
		int b3= (int)Math.round(b2);
		//System.out.println(b2);
		//System.out.println(Math.round(b2));
		double c =(double)(((answer[0][3]+answer[0][4])*(double)100)/(answer[0][3]+answer[0][4]+answer[1][3]+answer[1][4]));
		int c1= (int)Math.round(c);
		//System.out.println(Math.round(c));
		double c2 =(double)(((answer[1][3]+answer[1][4])*(double)100)/(answer[0][3]+answer[0][4]+answer[1][3]+answer[1][4]));
		int c3= (int)Math.round(c2);
		//System.out.println(c2);
		//System.out.println(Math.round(c2));
		double d =(double)(((answer[0][5]+answer[0][6])*(double)100)/(answer[0][5]+answer[0][6]+answer[1][5]+answer[1][6]));
		int d1= (int)Math.round(d);
		//System.out.println(Math.round(d));
		double d2 =(double)(((answer[1][5]+answer[1][6])*(double)100)/(answer[0][5]+answer[0][6]+answer[1][5]+answer[1][6]));
		int d3= (int)Math.round(d2);
		//System.out.println(d2);
		//System.out.println(Math.round(d2));
		percentage_ary[0]=a3+"%";//B percentages
		percentage_ary[1]=b3+"%";
		percentage_ary[2]=c3+"%";
		percentage_ary[3]=d3+"%";
		if (a1==50){
			character_type[0]= "X";
		}
		else if (a1>a3){ //result
			character_type[0]= "E";
		}
		else{	
			character_type[0]="I";
		}
		if (b1==50){
			character_type[1]= "X";
		}
		else if (b1>b3){
			character_type[1]="S";
		}
		else{
			character_type[1]="N";
		}
		if (c1==50){
			character_type[2]= "X";
		}
		else if (c1>c3){
			character_type[2]="T";
		}
		else{
			character_type[2]="F";
		}
		if (d1==50){
			character_type[3]= "X";
		}
		else if (d1>d3){
			character_type[3]="J";
		}
		else{
			character_type[3]="P";
		}
	}	

	public static void end_print (String[] percentage_ary,String[] character_type , int blankline_cnt){
		System.out.println("    "+Arrays.toString(percentage_ary)+ " = "+character_type[0]+character_type[1]+character_type[2]+character_type[3]);
		blankline_cnt++;
		if (blankline_cnt<9){
			System.out.println();
		}
	}		
}