public class Stock {	
	private String n;
	private String s;
	private String p2;
	private String e;
	private String r;
	private String r6;
	private String r7;
	public Stock (String n, String s, String p2 , String e, String r, String r6, String r7) {
		this.n=n;
		this.s=s;
		this.p2=p2;
		this.e=e;
		this.r= r;
		this.r6= r6;
		this.r7= r7;
	}
	public String getN() {
		return this.n;
	} 
	public String getS() {
		return this.s;
	} 
	public String getP2() {
		return this.p2;
	} 
	public String getE() {
		return this.e;
	} 
	public String getR() {
		return this.r;
	} 
	public String getR6() {
		return this.r6;
	} 
	public String getR7() {
		return this.r7;
	} 
	public String toString() {
	// 	//String i= "" + id;
	// 	String x= "" + grade;

	// 	if (grade > 100) {


	// 		return String.format("%-10s", last) + String.format("%-14s", first) + String.format("%-9s", id) + String.format("%-10s", x) +letter ;
	// 	}

	// 	else {

	// 		return String.format("%-10s", last) + String.format("%-14s", first) + String.format("%-10s", id) + String.format("%-9s", x) +letter ;

	// }
		return String.format("%-35s", n) + String.format("%-10s", s) + String.format("%-10s", p2) + String.format("%-10s", e) + String.format("%-10s", r) + String.format("%-10s", r6) + String.format("%-10s", r7);	
	}
}


