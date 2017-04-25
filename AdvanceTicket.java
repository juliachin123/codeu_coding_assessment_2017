public class AdvanceTicket extends Ticket {
	private int num2a;
	private int num2b;
	public AdvanceTicket(int num2a, int num2b){
		super(num2a, num2b);
		this.num2a=num2a;
		this.num2b=num2b;
	}
	public int getNumber(String s, int number){
		System.out.print(s);
		return super.getNumber(number);
	}
	public double getPrice(){
		if (this.num2b>= 10){
			return 30.0;
		}
		return 40.0;
	}
	public String toString(){
		return super.toString();
	}
}