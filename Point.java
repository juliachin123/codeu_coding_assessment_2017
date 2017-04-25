public class Point{
	//private int x;
	//private int y;
	public int x;
	public int y;
	public Point(){ //constructors
		this(0,0);
	}
	public Point(int x, int y){ //constructors
		this.x=x;
		this.y=y;
	}
	public Point translate(int dx, int dy){ //mutators
		this.x+=dx;
		this.y+=dy;
		return this;
	} 
	public int getX(){ //accessors
		return this.x;
	}
	public int getY(){ //accessors
		return this.y;
	}
	public Point setXY(int ax, int ay){ //mutators
		System.out.println("x = "+ax);
		System.out.println("this.x = "+ this.x);
		this.x=ax;
		this.y=ay;
		return this;
	}
	public String toString(){ //mutators
		String s= "("+this.x+", "+this.y+")";
		return s;
	}
	public int getQuadrant(){ //accessors
		if (this.x>0 && this.y>0){
			return 1;
		}
		else if (this.x<0 && this.y>0){
			return 2;
		}
		else if (this.x<0 && this.y<0){
			return 3;
		}
		else if (this.x>0 && this.y<0){
			return 4;
		}
		return 0;
	}
	public double distanceToOrigin(){ //accessors
		double distance= Math.sqrt(Math.pow(this.x-0,2)+Math.pow(this.y-0,2));
		return distance;
	}
}