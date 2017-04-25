public class StudentAdvanceTicket extends AdvanceTicket {
	private int num3a;
	private int num3b;
	public StudentAdvanceTicket(int num3a, int num3b){
		super(num3a, num3b);
		this.num3a=num3a;
		this.num3b=num3b;
	}
	public int getNumber(String s, int number){
		System.out.print(s);
		return super.getNumber(number);
	}
	public double getPrice(){
		return super.getPrice()/2;
	}
	public String toString(){
		return super.toString() + " (ID required)";
	}
}	