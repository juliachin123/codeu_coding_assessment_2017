public class Line{
	public Vect2 a;
	public Vect2 b;
	public Line(Vect2 a, Vect2 b){
		this.a=a;
		this.b=b;
	}
	public Vect2 geta(){
		return this.a;
	}
	public Vect2 getb(){
		return this.b;
	}
	public Line rotate(double angle, Vect2 center){
		this.a= this.a.rotate(angle, center);
		this.b=this.b.rotate(angle, center);
		return this;
	}
	public Line translate(Vect2 transform){
		this.a=this.a.add(transform);
		this.b=this.b.add(transform);
		return this;
	}
	public double length(){
		return Math.sqrt(Math.pow(this.b.getX()-this.a.getX(),2)+Math.pow(this.b.getY()-this.a.getY(),2));
	}
	public String toString(){
		return "(("+this.a.getX()+", "+this.a.getY()+"), ("+this.b.getX()+", "+this.b.getY()+"))";
	}
}