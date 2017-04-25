import java.util.*; 
public class ProjectCalender {
  public static void main(String args[]){
	  
	System.out.println("Please enter the number of days in the month: ");
	Scanner days = new Scanner(System.in);
	int days = days.nextInt();
	System.out.println("Please enter the number of the day of the first Sunday: ");
	int firstsunday = days.nextInt();
    printfirst(firstsunday);
    printbottom(firstsunday, days);
	System.out.println("+------------------------------------------------+");
  }
  public static void printbottom(int firstsunday, int numberofdays){
    int count = firstsunday;
    int fincount = count;
    for(int i = 0; i <= (int)Math.ceil(((numberofdays-firstsunday+1)/(7.0))-1); i++){
      for(int j = count; j < firstsunday + (i+1)*7;j=j){
        System.out.print("|  ");
        if(j-10<0){
          System.out.print(" ");
        }
        int county = j;
        String countx = "  ";
        if(j>numberofdays){
          System.out.print(countx);
        }else if(j <= numberofdays){
          System.out.print(county);
        }
        System.out.print("  ");
        count = j + 1;
        j += 1;
      }
      System.out.print("|");
      System.out.println("");

    }
  } public static void printfirst(int firstsunday){
    System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    System.out.println("+------------------------------------------------+");
    for(int j = firstsunday - 7; j < firstsunday; j++){
      if(j<=0){
        System.out.print("|      ");
      }else if(j>0){
        System.out.print("|   ");
        System.out.print(j);
        System.out.print("  ");
      }
    }
    System.out.print("|");
    System.out.println("");
  }
}