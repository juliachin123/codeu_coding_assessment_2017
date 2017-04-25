import java.util.*; 
public class ProjectCalender {
  public static void main(String args[]){
	  
	System.out.println("Please enter the number of days in the month: ");
	Scanner cal = new Scanner(System.in);
	int days = cal.nextInt();
	System.out.println("Please enter the number of the day of the first Sunday: ");
	int firstsunday = cal.nextInt();
	System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat   ");
	System.out.println("+------+------+------+------+------+------+------+");
	if (firstsunday==1) {
		Num(days, firstsunday);
		if (days==28) {
			System.out.println("|");
		}
	} 
	else if (firstsunday>1) {
		for (int i= firstsunday-7; i<= 0;i++) {
			System.out.print("|  ");
			System.out.print("    ");		
		}	
		for (int i= 1; i<firstsunday; i++) {
			System.out.print("|  "+i+"   ");
		}
		System.out.println("|");
		Num(days, firstsunday);
	}
	System.out.println("+------+------+------+------+------+------+------+");	
}
  public static void Num(int days, int firstsunday) {
  	 int number= (int)Math.ceil((double)days/(double)7);
		for (int j=1; j<= number; j++){
			if (j==5) {
				for (int i=firstsunday+28; i<=days;i++) {
					System.out.print("|  ");
					System.out.print(i);
					System.out.print("  ");	
				}
				System.out.print("|");	
				if (firstsunday<3) {
					for (int i= days+1; i<= firstsunday+7*(j-1)+6 ;i++) {
						System.out.print("    ");
						System.out.print("  |");		
					}	
					System.out.println();
				}	
				else if (firstsunday>=4) {
					for (int i=firstsunday; i<=(firstsunday-3); i++) {
						System.out.print("    |");	
					}
					System.out.println();	
				}
				else if (firstsunday==3) {
						System.out.println();	
				}
			}	
			else {					
				for (int i=firstsunday + (7*j-7); i<firstsunday+7*j;i++) {
					System.out.print("|  ");
						if (i>days) {
							System.out.print("    ");
						}
						else {
							System.out.print(i);
						}
						if (i<=days) {
							if (i>=10) {
								System.out.print("  ");
							}
							else if (i<10) {
								System.out.print("   ");
							}	
						}
					if (i== (firstsunday+7*j)-1) {
						if (i>=days) {
							int h= i;
						}
						else{
							System.out.println("|");
						}
					}		
				}	
			}
		}
	}	
}