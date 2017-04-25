public abstract class Ticket {
	private int num;
	private int num1;
	public Ticket(int num){
		this.num=num;
	}
	public Ticket(int num, int num1){
		this.num=num;
		this.num1=num1;
	}
	public int getNumber(int num){
		return this.num;
	}
    public abstract double getPrice();
    public String toString(){
    	return "Number: "+this.num+ ", Price: "+ getPrice();
    }   
}