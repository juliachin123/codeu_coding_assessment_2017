public class WalkupTicket extends Ticket {
	private int num1;
	public WalkupTicket(int num1){
		super(num1);
		this.num1=num1;
	}
	public int getNumber(String s, int number){
		System.out.print(s);
		return super.getNumber(number);
	}
	public double getPrice(){
		return 50.0;
	}
	public String toString(){
		return super.toString();
	}
}